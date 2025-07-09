package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("fangwuleixing")
public class Fangwuleixing {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private String fangwuleixing;
}