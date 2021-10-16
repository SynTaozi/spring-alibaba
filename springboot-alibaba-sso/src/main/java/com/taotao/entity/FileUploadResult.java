package com.taotao.entity;

/**
 * @version 1.0
 * @Author zhangtaotao
 * @date 2021-10-15 21:30
 * @注解：
 */

import lombok.Data;

/**
 * @author 巅峰小词典
 * @description 用于前后端交互的返回值
 * @date 2021/5/20
 * @project springboot_oss
 */
@Data
public class FileUploadResult {

    // 文件唯一标识
    private String uid;
    // 文件名
    private String name;
    // 状态有：uploading done error removed
    private String status;
    // 服务端响应内容，如：'{"status": "success"}'
    private String response;

}