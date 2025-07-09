package cn.sdu.fd.service.impl;

import cn.sdu.fd.mapper.FangzhuMapper;
import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Fangzhu;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.FangzhuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FangzhuServiceImpl implements FangzhuService { // 未实现接口时，不能使用 @Override

    @Autowired
    private FangzhuMapper fangzhuMapper;
    @Override
    public List<Fangzhu> selectAll() {
        List<Fangzhu> list = fangzhuMapper.selectList( null);
        return list;
    }
    @Override
    public Fangzhu selectById(Long id) {
        Fangzhu fangzhu = fangzhuMapper.selectById(id);
        if (fangzhu != null) {
            return fangzhu;
        }
            return null;
    }
    @Override
    public void addFangzhu(Fangzhu fangzhu) {
        int result = fangzhuMapper.insert(fangzhu);
        if (result < 1){
            throw new RuntimeException("添加失败");
        }
    }
    @Override
    public void update(Fangzhu fangzhu) {
        Fangzhu oldFangzhu = fangzhuMapper.selectById(fangzhu.getId());
        if (oldFangzhu != null) {
// 判断是否上传了新的图片
            if (fangzhu.getTouxiang() == null || fangzhu.getTouxiang().equals("")) {
                fangzhu.setTouxiang(oldFangzhu.getTouxiang());
            }
            int result = fangzhuMapper.updateById(fangzhu);
            if (result < 1) {
// 抛出异常
                throw new RuntimeException("更新失败");
            }
        } else {
// 抛出异常
            throw new RuntimeException("失败");
        }
    }
    //按账号查询
    @GetMapping("/Fangzhu/selectByZhanghao")
    @Override
    public List<Fangzhu> selectByZhanghao(String zhanghao) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("fangzhuzhanghao",zhanghao);
        List<Fangzhu> list = fangzhuMapper.selectList(queryWrapper);
        return list;
    }
    @DeleteMapping("/Fangzhu/delete")
    @Override
    public void delete(Long id) {
        int result = fangzhuMapper.deleteById(id);
        if (result == 1) {
            return;
        } else {
            throw new RuntimeException("删除失败");
        }
    }

}
