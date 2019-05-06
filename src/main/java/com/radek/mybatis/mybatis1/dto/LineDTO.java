package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineDTO implements Serializable {

    private String name;
    private Long transportTypeId;

    private List<LineScheduleDTO> lineScheduleDTOList = new ArrayList<>();

}
