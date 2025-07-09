package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("fangzhu")
public class Fangzhu {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String fangzhuzhanghao;//账号设置为唯一索引，注册时实现
    private String mima;
    private String fangzhuxingming;
    private String xingbie;
    private String touxiang;
    private String shouji;
    private String shenfenzheng;
}