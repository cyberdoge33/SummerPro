package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("hetongxinxi")
public class Hetongxinxi {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String hetongbianhao;
    private String fangwumingcheng;
    private String fangwuleixing;
    private String xiaoqu;
    private String yuezujiage;
    private String zuyongyueshu;
    private Integer zuyongjine;
    private Integer yajin;
    private String fangzuzhuangtai;
    private String hetongjine;
    private String hetongneirong;
    private Date shengxiaori;
    private Date youxianqizhi;
    private String yonghuming;
    private String lianxidianhua;
    private String fangzhuzhanghao;
    private String fangzhuxingming;
    private String sfsh;
    private String shhf;
    private String ispay;
}
