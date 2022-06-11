package com.springdatajpadio.challenge.controller;

import com.springdatajpadio.challenge.entity.AvaliacaoFisica;
import com.springdatajpadio.challenge.entity.form.AvaliacaoFisicaForm;
import com.springdatajpadio.challenge.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }
}
