/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package me.qlong.controller;

import com.alipay.sofa.ark.api.ArkClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author qilong.zql 19/1/7-ÉÏÎç11:38
 */
@RestController
public class UninstallController {
    @RequestMapping("/uninstall/{name}/{version}")
    public String uninstall(@PathVariable String name, @PathVariable  String version) throws Throwable{
        return ArkClient.uninstallBiz(name, version).getMessage();
    }
}