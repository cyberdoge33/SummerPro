package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("fangwubaoxiu")
public class Fangwubaoxiu {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String hetongbianhao;
    private String fangwumingcheng;
    private String fangwuleixing;
    private String xiaoqu;
    private String baoxiumingcheng;
    private String leixing;
    private String baoxiuneirong;
    private String tupian;
    private Date baoxiuriqi;
    private String fangzhuzhanghao;
    private String fangzhuxingming;
    private String yonghuming;
    private String lianxidianhua;
    private String sfsh;
    private String shhf;
}