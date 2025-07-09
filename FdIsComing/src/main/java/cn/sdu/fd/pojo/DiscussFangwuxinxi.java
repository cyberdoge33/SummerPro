package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("discussfangwuxinxi")
public class DiscussFangwuxinxi {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private Long refid;
    private Long userid;
    private String content;
    private String reply;
}