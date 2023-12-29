package com.backend.prodc.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.backend.prodc.dto.CustosDespesasDTO;
import com.backend.prodc.dto.CustosDespesasValoresDTO;
import com.backend.prodc.services.CustosDespesasService;

/**
 * CustosDepsesasResource
 */

@RestController
@RequestMapping(value = "/custosDespesas")
public class CustosDepsesasResource {
    @Autowired
    private CustosDespesasService service;

    @GetMapping
    public ResponseEntity<List<CustosDespesasDTO>> findAll() {
        List<CustosDespesasDTO> list = service.findAllPaged();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<CustosDespesasValoresDTO>> findAllValores(@PathVariable Long id) {
        List<CustosDespesasValoresDTO> list = service.findAllValores(id);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<CustosDespesasDTO> insert(@RequestBody CustosDespesasDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CustosDespesasValoresDTO> update(@PathVariable Long id,
            @RequestBody CustosDespesasValoresDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

}