package com.company.dto;

import com.company.domain.Pasek;
import com.company.domain.Sakiewka;
import lombok.Data;

@Data
public class PasekDTO {
    private int ilosc;
    private int cena;

    public static PasekDTO createNew(Pasek pasek) {
        PasekDTO pasekDTO = new PasekDTO();
        pasekDTO.ilosc = pasek.getCounter();
        pasekDTO.cena = pasek.getCena();
        return pasekDTO;
    }
}
