/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package me.qlong.controller;

import com.alipay.sofa.ark.api.ArkClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URL;

/**
 * @author qilong.zql
 */
@RestController
public class InstallController {

    static {
        // IDEA 启动会默认添加一些 -D 参数
        // 参考 https://github.com/alipay/sofa-boot/issues/327
        System.setProperty("spring.application.admin.enabled", Boolean.FALSE.toString());
        System.getProperties().remove("spring.liveBeansView.mbeanDomain");
    }

    @RequestMapping("/install/{file}")
    public String install(@PathVariable String file) throws Throwable{
        URL url = this.getClass().getClassLoader().getResource(file);
        return ArkClient.installBiz(new File(url.getFile())).getMessage();
    }
}