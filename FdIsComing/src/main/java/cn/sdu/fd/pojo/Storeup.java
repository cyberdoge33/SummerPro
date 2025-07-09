package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("storeup")
public class Storeup {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;
    private Long userid;
    private Long refid;
    private String tablename;
    private String name;
    private String picture;
}