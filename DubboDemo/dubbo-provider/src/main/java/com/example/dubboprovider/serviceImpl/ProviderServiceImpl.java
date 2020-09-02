package com.example.dubboprovider.serviceImpl;


import com.example.dubbobase.entity.ProviderTestEntity;
import com.example.dubbobase.service.IProviderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者Dubbo接口实现
 * @Author wangmx
 */
@Service
public class ProviderServiceImpl implements IProviderService {
    @Override
    public List<ProviderTestEntity> queryList() {
        // 初始化数据
        ProviderTestEntity testEntity1 = new ProviderTestEntity();
        testEntity1.setId(1);
        testEntity1.setName("张三");
        testEntity1.setNumber(100);

        ProviderTestEntity testEntity2 = new ProviderTestEntity();
        testEntity2.setId(2);
        testEntity2.setName("李四");
        testEntity2.setNumber(101);

        ProviderTestEntity testEntity3 = new ProviderTestEntity();
        testEntity3.setId(2);
        testEntity3.setName("王五");
        testEntity3.setNumber(102);

        // 组装数据
        List<ProviderTestEntity> list = new ArrayList<>();
        list.add(testEntity1);
        list.add(testEntity2);
        list.add(testEntity3);

        return list;
    }
}