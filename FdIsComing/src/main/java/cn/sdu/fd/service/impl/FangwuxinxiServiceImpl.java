package cn.sdu.fd.service.impl;

import cn.sdu.fd.mapper.FangwuxinxiMapper;
import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.service.FangwuxinxiService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FangwuxinxiServiceImpl implements FangwuxinxiService {   //记得implement！！！！！！！！！！！！！！
    @Autowired
    private FangwuxinxiMapper fangwuxinxiMapper;
    @Override
    public List<Fangwuxinxi> selectAll() {
        List<Fangwuxinxi> list = fangwuxinxiMapper.selectList(null);
        return list;
    }
    @Override
    public void addFangwuxinxi(Fangwuxinxi fangwuxinxi) {
        int result = fangwuxinxiMapper.insert(fangwuxinxi);
        if (result < 1){
            throw new RuntimeException("添加失败");
        }
    }
    //根据房主id查询
    @Override
    public List<Fangwuxinxi> selectByFangzhuId(Long fangzhuId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("fangzhuzhanghao",fangzhuId);
        List<Fangwuxinxi> list = fangwuxinxiMapper.selectList(queryWrapper);
        return list;
    }
    //根据房主账号查询
    @Override
    public List<Fangwuxinxi> selectByFangzhuzhanghao(String fangzhuzhanghao) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("fangzhuzhanghao",fangzhuzhanghao);
        List<Fangwuxinxi> list = fangwuxinxiMapper.selectList(queryWrapper);
        return list;
    }
    //更新房屋信息
    @Override
    public void update(Fangwuxinxi fangwuxinxi) {
        Fangwuxinxi oldFangwuxinxi = fangwuxinxiMapper.selectById(fangwuxinxi.getId());
        if (oldFangwuxinxi != null) {
// 判断是否上传了新的图片
            if (fangwuxinxi.getTupian() == null || fangwuxinxi.getTupian().equals("")) {
                fangwuxinxi.settupian(oldFangwuxinxi.getTupian());
            }
            int result = fangwuxinxiMapper.updateById(fangwuxinxi);
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
    public void delete(Long id) {
        int result = fangwuxinxiMapper.deleteById(id);
if (result < 1){
            throw new RuntimeException("删除失败");
        }
    }
}
