package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("woyaodangfangzhu")
public class Woyaodangfangzhu {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String fangwumingcheng;
    private String fangwuleixing;
    private String tupian;
    private String zulinfangshi;
    private String chaoxianglouceng;
    private String xiaoqu;
    private String mianji;
    private Integer yuezujiage;
    private String fangwuxiangqing;
    private Date faburiqi;
    private String yonghuming;
    private String lianxidianhua;
    private String sfsh;
    private String shhf;
}