package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Pinglun;

import java.util.List;

public interface PinglunService {
    //按照id查询(此处id为房屋id)
    List<Pinglun> selectById(Long id);
    //添加评论
    void addPinglun(Pinglun pinglun);
}
