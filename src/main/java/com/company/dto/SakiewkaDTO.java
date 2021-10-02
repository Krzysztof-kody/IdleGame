package com.company.dto;

import com.company.domain.Pasek;
import com.company.domain.Sakiewka;
import lombok.Data;

@Data
public class SakiewkaDTO {
    private int kwota;
    private int buraki;
    private int kury;
    private int krowy;
    private int drzewa;

    public static SakiewkaDTO createNew(Sakiewka sakiewka){

        SakiewkaDTO sakiewkaDTO = new SakiewkaDTO();
        //TODO zmienić tak jak poniżej
        sakiewkaDTO.kwota = sakiewka.get().pieniadze();
        sakiewkaDTO.buraki = sakiewka.getBuraki();
        sakiewkaDTO.kury = sakiewka.getKury();
        sakiewkaDTO.krowy = sakiewka.getKrowy();
        sakiewkaDTO.drzewa = sakiewka.getDrzewa();
        return sakiewkaDTO;
    }

}
