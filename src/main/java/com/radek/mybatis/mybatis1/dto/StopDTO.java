package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopDTO implements Serializable {

    private String name;
    private Long transportTypeId;

    private List<StopScheduleDTO> stopScheduleDTOList = new ArrayList<>();
}
