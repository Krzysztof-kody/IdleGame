package com.company.domain;

import com.company.dto.GraDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GraApi {

    private final GraRepository repository;

    public GraApi(GraRepository repository) {
        this.repository = repository;
    }


    public void kup(int nrPaska, long idGra) {
        repository.getGra(idGra).kup(nrPaska);
    }

    public GraDTO getStatus(long idGra) {
        return repository.getGra(idGra).getStatus();
    }

    // get_status
    // startGry - zwraca longa (jako identyfikator)

}
