package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("token")
public class Token {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userid;
    private String username;
    private String tablename;
    private String role;
    private String token;
    private Date addtime;
    private Date expiratedtime;
}