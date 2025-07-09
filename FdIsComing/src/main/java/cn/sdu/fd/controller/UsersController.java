package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Users;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.UsersService;
import cn.sdu.fd.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/Users/selectByUsername")
    public ServerResult<Users>  selectByYonghuming(String username)
    {
        Users user = usersService.selectByUsername(username);
        return ServerResult.ok(user);
    }

}

