package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Yuyuekanfang;

import java.util.List;

public interface YuyuekanfangService{
    //添加信息
    void addYuyuekanfang(Yuyuekanfang yuyuekanfang);
    //按照用户账号查询
    List<Yuyuekanfang> selectByYonghuming(String yonghuming);
    //按照房主账号查询
    List<Yuyuekanfang> selectByFangzhuzhanghao(String fangzhuzhanghao);
    //删除信息
    void deleteYuyue(Long id);
    //修改信息
    void update(Yuyuekanfang yuyuekanfang);

}
