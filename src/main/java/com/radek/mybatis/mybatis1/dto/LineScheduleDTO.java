package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LineScheduleDTO {

    private Long line_id;
    private Long final_stop_id;
    private Long position;
    private Long stop_id;

}
