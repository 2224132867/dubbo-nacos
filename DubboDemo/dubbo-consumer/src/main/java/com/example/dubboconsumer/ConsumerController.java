package com.example.dubboconsumer;


import com.example.dubbobase.entity.ProviderTestEntity;
import com.example.dubbobase.service.IProviderService;
import com.example.dubbobase.vo.R;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 消费测试接口
 * @Author wangmx
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    // Dubbo远程调用注解
    @Reference
    private IProviderService providerService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public R getList(){
        // 远程调用
        List<ProviderTestEntity> list = providerService.queryList();
        return R.ok().put("data",list);
    }
}