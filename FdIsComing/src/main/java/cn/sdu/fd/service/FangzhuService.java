package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Fangzhu;
import java.util.List;

public interface FangzhuService {
    //查询所有
    List<Fangzhu> selectAll();
    //按照id查询
    Fangzhu selectById(Long id);
    //添加
    void addFangzhu(Fangzhu fangzhu);
    //修改
    void update(Fangzhu fangzhu);
    //按账号查询
    List<Fangzhu> selectByZhanghao(String zhanghao);
    //删除
    void delete(Long id);
}
