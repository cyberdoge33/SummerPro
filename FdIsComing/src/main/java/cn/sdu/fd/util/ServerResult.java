package cn.sdu.fd.util;


import lombok.Data;

@Data
public class ServerResult<T> {
    // 状态码
    private Integer code;
    // 提示信息
    private String message;
    // 数据
    private T data;
    /**
     * 针对查询数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ServerResult<T> ok(T data) {
        ServerResult<T> result = new ServerResult<>();
        result.setCode(200); // 操作成功
        result.setMessage("OK");
        result.setData(data);
        return result;
    }
    /**
     * 针对增删改
     * @return
     */
    public static ServerResult<Void> ok() {
        return ok(null);
    }
    /**
     * 针对操作失败
     * @param code
     * @param message
     * @return
     */
    public static ServerResult<Void> error(Integer code, String message) {
        ServerResult<Void> result = new ServerResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
