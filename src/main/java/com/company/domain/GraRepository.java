package com.company.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Primary
public class GraRepository {
    private final Map<Long, Gra> graMapa = new HashMap<>();

    public Gra getGra(Long graId) {
        return graMapa.computeIfAbsent(graId, this::nowa);
    }

    private Gra nowa(long id) {
        Gra gra = new Gra();


        return gra;
    }
}
