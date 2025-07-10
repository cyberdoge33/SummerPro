package cn.sdu.fd.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("pinglun")
public class Pinglun {
    @TableId(type = IdType.AUTO)
    private Long cid;
    private Date addtime;
    private String yonghuming;
    private String xingming;
    private Long id;
    private String comment;
}
