package com.company.domain;

import com.company.dto.GraDTO;

public class KupPasek {

    private GraRepository graRepository;

    public KupPasek(GraRepository graRepository){
        this.graRepository = graRepository;
    }

    public boolean kup(long idGame, int nrPaska){
       return graRepository.getGra(idGame).kup(nrPaska);
    }


}
