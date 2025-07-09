package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("users")
public class Users {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String role;
    private Date addtime;
}