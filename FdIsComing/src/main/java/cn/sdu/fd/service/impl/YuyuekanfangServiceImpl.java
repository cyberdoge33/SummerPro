package cn.sdu.fd.service.impl;


import cn.sdu.fd.mapper.YuyuekanfangMapper;
import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Yuyuekanfang;
import cn.sdu.fd.service.YuyuekanfangService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YuyuekanfangServiceImpl implements YuyuekanfangService {
    @Autowired
    private YuyuekanfangMapper yuyuekanfangMapper;
    @Override
    public void addYuyuekanfang(Yuyuekanfang yuyuekanfang) {
        yuyuekanfangMapper.insert(yuyuekanfang);
    }
    @Override
    public List<Yuyuekanfang> selectByYonghuming(String yonghuming){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("yonghuming",yonghuming);
        List<Yuyuekanfang> list = yuyuekanfangMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public List<Yuyuekanfang> selectByFangzhuzhanghao(String fangzhuzhanghao){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("fangzhuzhanghao",fangzhuzhanghao);
        List<Yuyuekanfang> list = yuyuekanfangMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public void deleteYuyue(Long id)
    {
        int result = yuyuekanfangMapper.deleteById(id);
        if (result < 1){
            throw new RuntimeException("删除失败");
        }
    }
    @Override
    public void update(Yuyuekanfang yuyuekanfang)
    {
        int result = yuyuekanfangMapper.updateById(yuyuekanfang);
        if (result < 1){
            throw new RuntimeException("更新失败");
        }
    }
}
