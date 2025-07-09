package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Yonghu;

import java.util.List;

public interface YonghuService {
    //查询所有
    List<Yonghu> selectAll();
    //按照id查询
    Yonghu selectById(Long id);
    //修改信息
    void update(Yonghu yonghu);
    //添加用户
    void addYonghu(Yonghu yonghu);
    //按用户名(账号)查询
    List<Yonghu> selectByYonghuming(String yonghuming);
    //删除
    void delete(Long id);
}
