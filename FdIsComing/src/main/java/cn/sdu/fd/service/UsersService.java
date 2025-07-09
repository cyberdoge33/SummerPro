package cn.sdu.fd.service;

import cn.sdu.fd.pojo.Users;

import java.util.List;

public interface UsersService {
/**
 * @Data
 * @TableName("users")
 * public class Users {
 *     @TableId(type = IdType.AUTO)
 *     private Long id;
 *
 *     private String username;
 *     private String password;
 *     private String role;
 *     private Date addtime;
 * }
 */
    //查询所有
    Users selectByUsername(String username);
}
