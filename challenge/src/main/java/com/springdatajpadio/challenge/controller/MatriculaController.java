package com.springdatajpadio.challenge.controller;

import com.springdatajpadio.challenge.entity.Matricula;
import com.springdatajpadio.challenge.entity.form.MatriculaForm;
import com.springdatajpadio.challenge.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }


}
