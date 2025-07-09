package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("yonghu")
public class Yonghu {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String yonghuming;//设置为唯一索引，在注册时加以限制
    private String mima;
    private String xingming;
    private String touxiang;
    private String xingbie;
    private String zhiye;
    private String lianxidianhua;
    private String shenfenzheng;
}