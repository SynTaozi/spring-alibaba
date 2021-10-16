package com.taotao.config;

/**
 * @version 1.0
 * @Author zhangtaotao
 * @date 2021-10-15 21:29
 * @注解：
 */
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 巅峰小词典
 * @description
 * @date 2021/5/20
 * @project springboot_oss
 */
@Configuration
@PropertySource(value = {"classpath:application-oss.properties"})
@ConfigurationProperties(prefix = "aliyun")
@Data
public class AliyunConfig {

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String urlPrefix;

    @Bean
    public OSS oSSClient() {
        return new OSSClient(endpoint, accessKeyId, accessKeySecret);
    }

}