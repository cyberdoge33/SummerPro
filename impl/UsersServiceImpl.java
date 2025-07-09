package cn.sdu.fd.service.impl;


import cn.sdu.fd.mapper.UsersMapper;
import cn.sdu.fd.pojo.Users;
import cn.sdu.fd.service.UsersService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users selectByUsername(String username) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);
        return usersMapper.selectOne(queryWrapper);
    }
}
