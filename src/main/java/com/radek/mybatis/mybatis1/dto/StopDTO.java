package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopDTO implements Serializable {

    private String name;
    private String transportType;

//    private List<StopLineDTO> stopLineDTOList = new ArrayList<>();
}
