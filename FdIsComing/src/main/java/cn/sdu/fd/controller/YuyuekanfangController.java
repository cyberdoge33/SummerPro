package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Yuyuekanfang;
import cn.sdu.fd.service.YuyuekanfangService;
import cn.sdu.fd.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YuyuekanfangController {
    @Autowired
    private YuyuekanfangService yuyuekanfangService;
    @PostMapping(value="/Yuyuekanfang/addYuyuekanfang", consumes = "multipart/form-data")
    public ServerResult<Void> addYuyuekanfang(Yuyuekanfang yuyuekanfang){
        yuyuekanfangService.addYuyuekanfang(yuyuekanfang);
        return ServerResult.ok();
    }
    @RequestMapping("/Yuyuekanfang/selectByYonghuming")
    public ServerResult<List<Yuyuekanfang>> selectByYonghuming(String yonghuming)
    {
        List<Yuyuekanfang> list = yuyuekanfangService.selectByYonghuming(yonghuming);
        return ServerResult.ok(list);
    }
    @RequestMapping("/Yuyuekanfang/selectByFangzhuzhanghao")
    public ServerResult<List<Yuyuekanfang>> selectByFangzhuId(String fangzhuzhanghao)
    {
        List<Yuyuekanfang> list = yuyuekanfangService.selectByFangzhuzhanghao(fangzhuzhanghao);
        return ServerResult.ok(list);
    }
    //删除，取消预约
    @DeleteMapping("/Yuyuekanfang/delete")
    public ServerResult<Void> delete(Long id){
        try {
            yuyuekanfangService.deleteYuyue(id);
        }catch (RuntimeException e){
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
    // 更新
    @PostMapping(value="/Yuyuekanfang/update", consumes = "multipart/form-data")
    public ServerResult<Void> update(Yuyuekanfang yuyuekanfang) {
        try {
            yuyuekanfangService.update(yuyuekanfang);
        } catch (RuntimeException e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
}
