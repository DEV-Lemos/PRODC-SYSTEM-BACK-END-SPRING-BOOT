package com.backend.prodc.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.prodc.dto.ReceitasDTO;
import com.backend.prodc.dto.ReceitasValoresDTO;
import com.backend.prodc.entities.Receitas;
import com.backend.prodc.entities.ReceitasValores;
import com.backend.prodc.repositories.ReceitasRepository;
import com.backend.prodc.repositories.ReceitasValoresRepository;

@Service
public class ReceitasService {
    @Autowired
    private ReceitasRepository repository;

    @Autowired
    private ReceitasValoresRepository repositoryReceitasValores;

    public List<ReceitasDTO> findAllId() {
        List<Receitas> list = repository.findAll();
        return list.stream().map(x -> new ReceitasDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public ReceitasDTO insertReceita(ReceitasDTO dto) {
        Receitas entity = new Receitas();
        entity.setDescricao(dto.getDescricao());
        entity.setTipo(dto.getTipo());
        entity = repository.save(entity);

        ReceitasValores entityValores = new ReceitasValores();
        entityValores.setIdCustoDespesa(entity.getId());
        entityValores.setJan((float) 0.00);
        entityValores.setFev((float) 0.00);
        entityValores.setMar((float) 0.00);
        entityValores.setAbr((float) 0.00);
        entityValores.setMai((float) 0.00);
        entityValores.setJun((float) 0.00);
        entityValores.setJul((float) 0.00);
        entityValores.setAgo((float) 0.00);
        entityValores.setSete((float) 0.00);
        entityValores.setOutu((float) 0.00);
        entityValores.setNov((float) 0.00);
        entityValores.setDez((float) 0.00);

        entityValores = repositoryReceitasValores.save(entityValores);

        return new ReceitasDTO(entity);
    }

    @Transactional
    public ReceitasValoresDTO update(Long id, ReceitasValoresDTO dto) {
        ReceitasValores entity = repositoryReceitasValores.getReferenceById(id);
        entity.setJan(dto.getJan());
        entity.setFev(dto.getFev());
        entity.setMar(dto.getMar());
        entity.setAbr(dto.getAbr());
        entity.setMai(dto.getMai());
        entity.setJun(dto.getJun());
        entity.setJul(dto.getJul());
        entity.setAgo(dto.getAgo());
        entity.setSete(dto.getSete());
        entity.setOutu(dto.getOutu());
        entity.setNov(dto.getNov());
        entity.setDez(dto.getDez());
        entity = repositoryReceitasValores.save(entity);

        return new ReceitasValoresDTO(entity);

    }

    public List<ReceitasValoresDTO> findAllValores(Long id) {
        List<ReceitasValores> list = repositoryReceitasValores.findAll();
        return list.stream().map(x -> new ReceitasValoresDTO(x)).collect(Collectors.toList());
    }

}
