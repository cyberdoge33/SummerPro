package cn.sdu.fd.controller;


import cn.sdu.fd.pojo.Fangwuxinxi;
import cn.sdu.fd.pojo.Fangzhu;
import cn.sdu.fd.pojo.Yonghu;
import cn.sdu.fd.service.FangzhuService;
import cn.sdu.fd.util.ServerResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
public class FangzhuController {
//    @Autowired
//    private FangzhuService fangzhuService;
//    //查询所有
//    @RequestMapping("/Fangzhu/selectAll")
//    public ServerResult<List<Fangzhu>> selectAll()
//    {
//        List<Fangzhu> list = fangzhuService.selectAll();
//        return ServerResult.ok(list);
//    }
@Autowired
private FangzhuService fangzhuService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String CACHE_KEY = "fangzhu:all";

    @RequestMapping("/selectAll")
    public ServerResult<List<Fangzhu>> selectAll() {
        try {
            // 1. 尝试从Redis获取缓存
            String json = stringRedisTemplate.opsForValue().get(CACHE_KEY);

            if (json != null && !json.isEmpty()) {
                // 2. 缓存命中，直接返回
                List<Fangzhu> cachedList = objectMapper.readValue(json,
                        objectMapper.getTypeFactory().constructCollectionType(List.class, Fangzhu.class));
                return ServerResult.ok(cachedList);
            }

            // 3. 缓存未命中，查询数据库
            List<Fangzhu> dbList = fangzhuService.selectAll();

            if (dbList != null && !dbList.isEmpty()) {
                // 4. 将结果存入Redis
                String dbJson = objectMapper.writeValueAsString(dbList);
                stringRedisTemplate.opsForValue().set(CACHE_KEY, dbJson);

                // 可设置过期时间（例如30分钟）
                // stringRedisTemplate.expire(CACHE_KEY, 30, TimeUnit.MINUTES);
            }

            return ServerResult.ok(dbList);

        } catch (JsonProcessingException e) {
            // 异常处理
            throw new RuntimeException("JSON转换异常");}
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
