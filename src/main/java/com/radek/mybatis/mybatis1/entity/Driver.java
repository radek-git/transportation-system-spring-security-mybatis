package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends AbstractEntity {

    private String name;
    private String surname;
    private String pesel;
}
