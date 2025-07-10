package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Pinglun;
import cn.sdu.fd.service.PinglunService;
import cn.sdu.fd.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PinglunController {
    @Autowired
    private PinglunService pinglunService;
    //按id查询评论，此处id是房屋id
    @RequestMapping("/Pinglun/selectById")
    public ServerResult<List<Pinglun>> selectById(Long id){
        List<Pinglun> list = pinglunService.selectById(id);
        return ServerResult.ok(list);
    }
    //填加评论
    @PostMapping(value="/Pinglun/addPinglun", consumes = "multipart/form-data")
    public ServerResult<Void> addPinglun(Pinglun pinglun){
        pinglunService.addPinglun(pinglun);
        return ServerResult.ok();
    }
}
