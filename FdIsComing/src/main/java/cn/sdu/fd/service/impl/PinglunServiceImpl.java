package cn.sdu.fd.service.impl;


import cn.sdu.fd.mapper.PinglunMapper;
import cn.sdu.fd.pojo.Pinglun;
import cn.sdu.fd.service.PinglunService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinglunServiceImpl implements PinglunService {
    @Autowired
    private PinglunMapper pinglunMapper;
    @Override
    public List<Pinglun> selectById(Long id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        List<Pinglun> list = pinglunMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public void addPinglun(Pinglun pinglun) {
        int result = pinglunMapper.insert(pinglun);
        if (result < 1){
            throw new RuntimeException("添加失败");
        }
    }
}
