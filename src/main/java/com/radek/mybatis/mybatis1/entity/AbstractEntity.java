package com.radek.mybatis.mybatis1.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class AbstractEntity implements Serializable {

    private Long id;
}
