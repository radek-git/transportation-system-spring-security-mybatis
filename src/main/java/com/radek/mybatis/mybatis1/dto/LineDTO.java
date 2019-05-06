package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class LineDTO {

    private String name;
    private Long transport_type_id;

    private List<LineScheduleDTO> lineScheduleDTOList = new ArrayList<>();

}
