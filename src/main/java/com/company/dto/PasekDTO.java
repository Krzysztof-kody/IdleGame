package com.company.dto;

import com.company.domain.Pieniadze;
import com.company.domain.Pasek;
import lombok.Data;

@Data
public class PasekDTO {
    private int ilosc;
    private Pieniadze cena;

    public static PasekDTO createNew(Pasek pasek) {
        PasekDTO pasekDTO = new PasekDTO();
        pasekDTO.ilosc = pasek.getCounter();
        pasekDTO.cena = pasek.getCena();
        return pasekDTO;
    }
}
