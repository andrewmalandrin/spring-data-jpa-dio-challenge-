package com.springdatajpadio.challenge.service;

import com.springdatajpadio.challenge.entity.Aluno;
import com.springdatajpadio.challenge.entity.AvaliacaoFisica;
import com.springdatajpadio.challenge.entity.form.AlunoForm;
import com.springdatajpadio.challenge.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create (AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
