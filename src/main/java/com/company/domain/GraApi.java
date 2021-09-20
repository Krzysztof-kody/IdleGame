package com.company.domain;

import com.company.dto.GraDTO;

public class GraApi {

    public void kup(int nrPaska, long idGra){
          Gra.getInstance(idGra).kup(nrPaska);
    }

    public GraDTO getStatus(long idGra){
        return Gra.getInstance(idGra).getStatus();
    }

    // get_status
    // startGry - zwraca longa (jako identyfikator)

}
