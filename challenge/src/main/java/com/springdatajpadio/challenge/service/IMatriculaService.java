package com.springdatajpadio.challenge.service;

import com.springdatajpadio.challenge.entity.Matricula;
import com.springdatajpadio.challenge.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

}
