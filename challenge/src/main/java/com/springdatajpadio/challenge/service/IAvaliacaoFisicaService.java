package com.springdatajpadio.challenge.service;

import com.springdatajpadio.challenge.entity.AvaliacaoFisica;
import com.springdatajpadio.challenge.entity.form.AvaliacaoFisicaForm;
import com.springdatajpadio.challenge.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
