package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//tabela pokazująca przystanki dla danej linii (z poziomu pojazdu)

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineStop extends AbstractEntity {

    private Line line;
    private Stop stop;

    private Stop finalStop;
    private Long position;

}
