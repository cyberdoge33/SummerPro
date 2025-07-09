package cn.sdu.fd.controller;
import java.util.concurrent.TimeUnit;

import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.service.FangwuxinxiService;
import cn.sdu.fd.util.ServerResult;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
@Slf4j
@RestController
public class FangwuxinxiController {
    @Autowired
    private FangwuxinxiService fangwuxinxiService;

    @RequestMapping("/Fangwuxinxi/selectAll")
    public ServerResult<List<Fangwuxinxi>> selectAll()
    {
        List<Fangwuxinxi> list = fangwuxinxiService.selectAll();
        return ServerResult.ok(list);
    }

    

    
    
    //添加房屋信息
    @PostMapping(value="/Fangwuxinxi/addFangwuxinxi", consumes = "multipart/form-data")
    public ServerResult<Void> addFangwuxinxi(Fangwuxinxi fangwuxinxi, MultipartFile file){
    // 文件保存路径
    File uploadDir = new File("E:/upload");
    if (!uploadDir.exists()) {
        uploadDir.mkdirs(); // 创建目录
    }

    File f = new File(uploadDir, file.getOriginalFilename());
    try {
        file.transferTo(f); // 保存图片
        fangwuxinxi.settupian(f.getName()); // 使用实例调用 setter
        fangwuxinxiService.addFangwuxinxi(fangwuxinxi);
        return ServerResult.ok();
    } catch (IOException e) {
        e.printStackTrace();
        return ServerResult.error(500,"文件上传失败");
    }
}
    //根据房东id查询房屋信息，即查询房东名下的所有房屋
    @RequestMapping("/Fangwuxinxi/selectByFangzhuId")
    public ServerResult<List<Fangwuxinxi>> selectByFangzhuId(Long fangzhuId)
    {
        List<Fangwuxinxi> list = fangwuxinxiService.selectByFangzhuId(fangzhuId);
        return ServerResult.ok(list);
    }
    //根据房东账号查询房屋信息
    @RequestMapping("/Fangwuxinxi/selectByFangzhuzhanghao")
    public ServerResult<List<Fangwuxinxi>> selectByFangzhuzhanghao(String fangzhuzhanghao)
    {
        List<Fangwuxinxi> list = fangwuxinxiService.selectByFangzhuzhanghao(fangzhuzhanghao);
        return ServerResult.ok(list);
    }
    //修改房屋信息
    @PostMapping(value="/Fangwuxinxi/update", consumes = "multipart/form-data")
    public ServerResult<Void> update(Fangwuxinxi fangwuxinxi, MultipartFile file){
        if (file != null) {
            File f = new File("E:/upload", file.getOriginalFilename());
            try {
                file.transferTo(f); // 保存图片
                fangwuxinxi.settupian(f.getName());
            } catch (Exception e) {
            }
        }
        try {
            fangwuxinxiService.update(fangwuxinxi);
        } catch (RuntimeException e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
    //删除房屋信息
    @DeleteMapping("/Fangwuxinxi/delete")
    public ServerResult<Void> delete(Long id){
        try {
            fangwuxinxiService.delete(id);
        }catch (RuntimeException e){
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
}
