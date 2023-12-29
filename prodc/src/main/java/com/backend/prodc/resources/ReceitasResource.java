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

import com.backend.prodc.dto.ReceitasDTO;
import com.backend.prodc.dto.ReceitasValoresDTO;
import com.backend.prodc.services.ReceitasService;

@RestController
@RequestMapping(value = "/receitas")
public class ReceitasResource {
    @Autowired
    public ReceitasService service;

    @PostMapping
    public ResponseEntity<ReceitasDTO> insertReceita(@RequestBody ReceitasDTO dto) {
        dto = service.insertReceita(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @GetMapping
    public ResponseEntity<List<ReceitasDTO>> findAll() {
        List<ReceitasDTO> list = service.findAllId();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<ReceitasValoresDTO>> findAllValores(@PathVariable Long id) {
        List<ReceitasValoresDTO> list = service.findAllValores(id);
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ReceitasValoresDTO> update(@PathVariable Long id,
            @RequestBody ReceitasValoresDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }
}
