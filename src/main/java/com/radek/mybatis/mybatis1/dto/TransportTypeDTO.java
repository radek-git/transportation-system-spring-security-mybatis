package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransportTypeDTO implements Serializable {

    private String name;
}
