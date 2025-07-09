package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("weixiuchuli")
public class Weixiuchuli {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String fangwumingcheng;
    private String fangwuleixing;
    private String baoxiumingcheng;
    private String leixing;
    private String baoxiuriqi;
    private String weixiufankui;
    private String weixiujindu;
    private Date gengxinriqi;
    private String fangzhuzhanghao;
    private String fangzhuxingming;
    private String yonghuming;
    private String lianxidianhua;
}