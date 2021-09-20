package com.company.dto;


import com.company.domain.Pasek;
import com.company.domain.Sakiewka;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class GraDTO {
    private SakiewkaDTO sakiewka;
    private List<PasekDTO> paski = new ArrayList<>();

    public static GraDTO createNew(Sakiewka sakiewka, Pasek[] paski) {
        GraDTO graDTO = new GraDTO();
        graDTO.sakiewka = SakiewkaDTO.createNew(sakiewka);
        for (Pasek pasek : paski) {
            graDTO.paski.add(PasekDTO.createNew(pasek));
        }

        return graDTO;
    }

}
