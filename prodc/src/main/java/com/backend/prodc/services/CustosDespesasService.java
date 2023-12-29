package com.backend.prodc.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.prodc.dto.CustosDespesasDTO;
import com.backend.prodc.dto.CustosDespesasValoresDTO;
import com.backend.prodc.entities.CustosDespesas;
import com.backend.prodc.entities.CustosDespesasValores;
import com.backend.prodc.repositories.CustosDespesasRepository;
import com.backend.prodc.repositories.CustosDespesasValoresRepository;

@Service
public class CustosDespesasService {
    @Autowired
    private CustosDespesasRepository repository;

    @Autowired
    private CustosDespesasValoresRepository repositoryValores;

    @Transactional(readOnly = true)
    public List<CustosDespesasDTO> findAllPaged() {
        List<CustosDespesas> list = repository.findAll();
        return list.stream().map(x -> new CustosDespesasDTO(x)).collect(Collectors.toList());

    }

    @Transactional
    public CustosDespesasDTO insert(CustosDespesasDTO dto) {
        CustosDespesas entity = new CustosDespesas();
        entity.setNome(dto.getNome());
        entity.setNumero(dto.getNumero());
        entity = repository.save(entity);

        CustosDespesasValores entityValores = new CustosDespesasValores();
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

        entityValores = repositoryValores.save(entityValores);

        return (new CustosDespesasDTO(entity));
    }

    @Transactional
    public CustosDespesasValoresDTO update(Long id, CustosDespesasValoresDTO dto) {
        CustosDespesasValores entity = repositoryValores.getReferenceById(id);
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
        entity = repositoryValores.save(entity);

        return new CustosDespesasValoresDTO(entity);

    }

    public List<CustosDespesasValoresDTO> findAllValores(Long id) {
        Optional<CustosDespesasValores> list = repositoryValores.findById(id);
        return list.stream().map(x -> new CustosDespesasValoresDTO(x)).collect(Collectors.toList());
    }
}
