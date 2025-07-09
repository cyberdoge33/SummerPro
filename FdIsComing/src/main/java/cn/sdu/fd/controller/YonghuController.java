package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Fangzhu;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.YonghuService;
import cn.sdu.fd.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class YonghuController {
    @Autowired
    private YonghuService yonghuService;
    //按id查询
    @GetMapping("/Yonghu/selectById")
    public ServerResult<Yonghu> selectById(Long id)
    {
        Yonghu yonghu = yonghuService.selectById(id);
        return ServerResult.ok(yonghu);
    }
    //修改信息
    @PostMapping(value="/Yonghu/update", consumes = "multipart/form-data")
    public ServerResult<Void> update(Yonghu yonghu, MultipartFile file){
        if (file != null) {
            File f = new File("E:/upload", file.getOriginalFilename());
            try {
                file.transferTo(f); // 保存图片
                yonghu.setTouxiang(f.getName());
            } catch (Exception e) {
            }
        }
        try {
            yonghuService.update(yonghu);
        } catch (RuntimeException e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
    //用户注册
    @PostMapping(value="/Yonghu/addYonghu",consumes = "multipart/form-data")
    public ServerResult<Void> addYonghu(Yonghu yonghu,MultipartFile file){
        File uploadDir = new File("E:/upload");
        if (!uploadDir.exists()) {
            uploadDir.mkdirs(); // 创建目录
        }

        File f = new File(uploadDir, file.getOriginalFilename());
        try {
            file.transferTo(f); // 保存图片
            yonghu.setTouxiang(f.getName()); // 使用实例调用 setter
            yonghuService.addYonghu(yonghu);
            return ServerResult.ok();
        } catch (IOException e) {
            e.printStackTrace();
            return ServerResult.error(500,"文件上传失败");
        }
    }
    //按用户名查询
    @GetMapping("/Yonghu/selectByYonghuming")
    public ServerResult<Yonghu>  selectByYonghuming(String yonghuming)
    {
        List<Yonghu> yonghu = yonghuService.selectByYonghuming(yonghuming);
        return ServerResult.ok(yonghu.get(0));
    }
    @RequestMapping("/Yonghu/selectAll")
    public ServerResult<List<Yonghu>> selectAll()
        {
            List<Yonghu> yonghu = yonghuService.selectAll();
            return ServerResult.ok(yonghu);
        }
    @DeleteMapping("/Yonghu/delete")
    public ServerResult<Void> delete(Long id){
        try {
            yonghuService.delete(id);
        }catch (RuntimeException e){
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
}
