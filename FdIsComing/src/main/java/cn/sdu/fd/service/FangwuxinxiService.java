package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Fangwuxinxi;

import java.util.List;

public interface FangwuxinxiService {
    //查询所有房屋信息
    List<Fangwuxinxi> selectAll();
    //添加房屋信息
    void addFangwuxinxi(Fangwuxinxi fangwuxinxi);
    //查询房主对应房屋信息
    List<Fangwuxinxi> selectByFangzhuId(Long fangzhuId);
    //查询房主账号对应房屋信息
    List<Fangwuxinxi> selectByFangzhuzhanghao(String fangzhuzhanghao);
    //修改房屋信息
    void update(Fangwuxinxi fangwuxinxi);
    //删除房屋信息
    void delete(Long id);
    //按id查找
    Fangwuxinxi selectById(Long id);
}
