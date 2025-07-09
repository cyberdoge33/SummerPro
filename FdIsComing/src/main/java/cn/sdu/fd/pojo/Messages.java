package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("messages")
public class Messages {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private Long userid;
    private String username;
    private String content;
    private String reply;
}
