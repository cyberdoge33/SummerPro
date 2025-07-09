package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("fangwupingjia")
public class Fangwupingjia {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String hetongbianhao;
    private String fangwumingcheng;
    private String fangwuleixing;
    private String xiaoqu;
    private String pingfen;
    private String pingjianeirong;
    private Date pingjiariqi;
    private String fangzhuzhanghao;
    private String yonghuming;
    private String lianxidianhua;
    private String sfsh;
    private String shhf;
}