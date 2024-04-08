package com.antamstoreapi.antamstorespbapi.domain.dto.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UnitResDTO {
    private String nameUnit;

    public UnitResDTO(String name) {
        this.nameUnit = name;
    }
}
