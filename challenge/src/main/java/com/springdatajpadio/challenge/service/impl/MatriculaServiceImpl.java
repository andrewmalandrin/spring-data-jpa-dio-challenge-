package com.springdatajpadio.challenge.service.impl;


import com.springdatajpadio.challenge.entity.Aluno;
import com.springdatajpadio.challenge.entity.Matricula;
import com.springdatajpadio.challenge.entity.form.MatriculaForm;
import com.springdatajpadio.challenge.repository.AlunoRepository;
import com.springdatajpadio.challenge.repository.MatriculaRepository;
import com.springdatajpadio.challenge.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {

        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
