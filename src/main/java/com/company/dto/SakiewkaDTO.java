package com.company.dto;

import com.company.domain.Pasek;
import com.company.domain.Sakiewka;
import lombok.Data;

@Data
public class SakiewkaDTO {
    private int kwota;

    public static SakiewkaDTO createNew(Sakiewka sakiewka){

        SakiewkaDTO sakiewkaDTO = new SakiewkaDTO();
        sakiewkaDTO.kwota = sakiewka.get();
        return sakiewkaDTO;
    }

}
