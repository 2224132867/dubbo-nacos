package com.example.dubbobase.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * RPC接口DTO
 * 注意这里要实现序列化接口
 * @Author wangmx
 */
@Data
public class ProviderTestEntity implements Serializable {
    // ID
    private int id;
    // 名字
    private String name;
    // 序号
    private Integer number;
}