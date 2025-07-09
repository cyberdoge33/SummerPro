package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Fangzhu;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.FangzhuService;
import cn.sdu.fd.util.ServerResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class FangzhuController {
    @Autowired
    private FangzhuService fangzhuService;
    //查询所有
    @RequestMapping("/Fangzhu/selectAll")
    public ServerResult<List<Fangzhu>> selectAll()
    {
        List<Fangzhu> list = fangzhuService.selectAll();
        return ServerResult.ok(list);
    }
    //根据id查询，用于个人账户管理
    @GetMapping("/Fangzhu/selectById")
    public ServerResult<Fangzhu> selectById(Long id)
    {
        Fangzhu fangzhu = fangzhuService.selectById(id);
        return ServerResult.ok(fangzhu);
    }
    //添加账户，应用于注册
    @PostMapping("/Fangzhu/addFangzhu")
    public ServerResult<Void> addFangzhu(Fangzhu fangzhu)
    {
        fangzhuService.addFangzhu(fangzhu);
        return ServerResult.ok();
    }
    // 更新
    @PostMapping(value="/Fangzhu/update", consumes = "multipart/form-data")
    public ServerResult<Void> update(Fangzhu fangzhu, MultipartFile file){
        if (file != null) {
            File f = new File("E:/upload", file.getOriginalFilename());
            try {
                file.transferTo(f); // 保存图片
                fangzhu.setTouxiang(f.getName());
            } catch (Exception e) {
            }
        }
        try {
            fangzhuService.update(fangzhu);
        } catch (RuntimeException e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
    @PostMapping(value="/Fangzhu/addFangzhu",consumes = "multipart/form-data")
    public ServerResult<Void> addFangzhu(Fangzhu fangzhu, MultipartFile file){
        File uploadDir = new File("E:/upload");
        if (!uploadDir.exists()) {
            uploadDir.mkdirs(); // 创建目录
        }

        File f = new File(uploadDir, file.getOriginalFilename());
        try {
            file.transferTo(f); // 保存图片
            fangzhu.setTouxiang(f.getName()); // 使用实例调用 setter
            fangzhuService.addFangzhu(fangzhu);
            return ServerResult.ok();
        } catch (IOException e) {
            e.printStackTrace();
            return ServerResult.error(500,"文件上传失败");
        }
    }
    //按账号查找
    @GetMapping("/Fangzhu/selectByZhanghao")
    public ServerResult<Fangzhu>  selectByZhanghao(String zhanghao)
    {
        List<Fangzhu> fangzhu = fangzhuService.selectByZhanghao(zhanghao);
        return ServerResult.ok(fangzhu.get(0));
    }
    //删除
    @DeleteMapping("/Fangzhu/delete")
    public ServerResult<Void> delete(Long id)
        {
           try {
               fangzhuService.delete(id);
           } catch (RuntimeException e) {
               return ServerResult.error(500, e.getMessage());
           }
           return ServerResult.ok();
        }
}
