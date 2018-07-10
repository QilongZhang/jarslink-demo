/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package me.qlong.tech.service.bean;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import me.qlong.tech.service.SampleJvmService;
import org.springframework.stereotype.Component;

/**
 * @author qilong.zql 18/7/11-上午12:25
 */
@Component
@SofaService
public class SampleServiceImpl implements SampleJvmService{
    @Override
    public String service() {
        return "app-two";
    }
}