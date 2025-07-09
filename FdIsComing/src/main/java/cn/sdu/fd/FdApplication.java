package cn.sdu.fd;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 项目启动类
 * @author Administrator
 * @SpringBootApplication 声明这是一个启动类
 * @MapperScan("cn.sdu.fd.mapper") 声明到哪个包下Mapper接口
 */
@SpringBootApplication
@MapperScan("cn.sdu.fd.mapper")
public class FdApplication {
    public static void main(String[] args) {
// 启动Spring Boot项目
        SpringApplication.run(FdApplication.class, args);
    }
}