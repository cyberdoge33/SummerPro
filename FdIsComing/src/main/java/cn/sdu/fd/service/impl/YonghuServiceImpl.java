package cn.sdu.fd.service.impl;

import cn.sdu.fd.mapper.YonghuMapper;
import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.YonghuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class YonghuServiceImpl implements YonghuService {
    @Autowired
    private YonghuMapper yonghuMapper;
    // 按id查询
    @Override
    public Yonghu selectById(Long id) {
        Yonghu yonghu = yonghuMapper.selectById(id);
        if (yonghu != null) {
            return yonghu;
        }
        return null;
    }
    //删除用户
    @Override
    public void delete(Long id) {
        int result = yonghuMapper.deleteById(id);
        if (result == 1) {
            return;
        } else {
            throw new RuntimeException("删除失败");
        }
    }
    //更新信息
    @Override
    public void update(Yonghu yonghu) {
        Yonghu oldYonghu = yonghuMapper.selectById(yonghu.getId());
        if (oldYonghu != null) {
// 判断是否上传了新的图片
            if (yonghu.getTouxiang() == null || yonghu.getTouxiang().equals("")) {
                yonghu.setTouxiang(oldYonghu.getTouxiang());
            }
            int result = yonghuMapper.updateById(yonghu);
            if (result < 1) {
// 抛出异常
                throw new RuntimeException("更新失败");
            }
        } else {
// 抛出异常
            throw new RuntimeException("失败");
        }
    }
    @Override
    public void addYonghu(Yonghu yonghu) {
        int result = yonghuMapper.insert(yonghu);
        if (result < 1) {
// 抛出异常
            throw new RuntimeException("添加失败");
        }
    }
    @Override
    public List<Yonghu> selectByYonghuming(String yonghuming) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("yonghuming",yonghuming);
        List<Yonghu> list = yonghuMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public List<Yonghu> selectAll() {
        List<Yonghu> list = yonghuMapper.selectList(null);
        return list;
    }
}
