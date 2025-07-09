package cn.sdu.fd.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("yuyuekanfang")
public class Yuyuekanfang {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Date addtime;//添加时间,默认当前
    private String yuyuebianhao;//前端生成

    private String fangwumingcheng;//房间名称
    private String fangwuleixing;//房间类型
    private String fangwuzhuangtai;//房屋状态
    private String xiaoqu;//小区名称
    private Integer yuezujiage;//月租价格
    private String yajin;//押金
    private String zuyongjine;//租用金额
    private String fangzhuzhanghao;//房主账号
    private String fangzhuxingming;//房主姓名


    private Integer zuyongyueshu;//租用月数
    private String yuyueshijian;//预约时间

    private String yonghuming;//用户名
    private String xingming;// 姓名
    private String shenfenzheng;//身份证
    private String lianxidianhua;//手机号



    private String sfsh;//是否审核
    private String shhf;//审核回复
}