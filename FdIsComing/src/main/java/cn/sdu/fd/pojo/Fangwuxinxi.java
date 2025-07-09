package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

@Data
@TableName("fangwuxinxi")
public class Fangwuxinxi {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime; //添加时间
    private String fangwumingcheng; //房屋名称
    private String fangwuleixing; //房屋类型
    private String tupian; //图片
    private String zulinfangshi; //租赁方式
    private String chaoxianglouceng; //朝向楼层
    private String mianji; //面积
    private String fangwuzhuangtai; //状态
    private String xiaoqu; //小区
    private String xiangxidizhi; //详细地址
    private Integer yuezujiage; //月租价
    private Integer yajin; //押金
    private String fangwusheshi; //房屋设施
    private String fangwuxiangqing; //房屋详情
    private Date faburiqi; //发布日期
    private String fangzhuzhanghao; //房主账号
    private String fangzhuxingming; //房主姓名

    public void settupian(String tupian) {
        this.tupian = tupian;
    }
}
