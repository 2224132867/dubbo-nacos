package com.example.dubbobase.service;



import com.example.dubbobase.entity.ProviderTestEntity;

import java.util.List;

/**
 * RPC接口
 * @Author wangmx
 */
public interface IProviderService {
    List<ProviderTestEntity> queryList();
}