package com.drimtim.p1drimtim.controller;

import com.drimtim.p1drimtim.entity.Categoria;
import com.drimtim.p1drimtim.service.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService service;


    @GetMapping
    public List<Categoria> list(){return service.list();}

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Categoria categoria){
        service.add(categoria);
        return ResponseEntity.ok("La categoria" + categoria.getId() + categoria.getTitulo() + "ha sido creada");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateById(@PathVariable long id, @RequestBody Categoria categoria){
        service.updateById(categoria, id);
        return ResponseEntity.ok("La categoria" + categoria.getId() + "ha sido actualizada");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody long id){
        service.delete(id);
        return ResponseEntity.ok("La categoria con id:" + id + "ha sido eliminada");
    }
}
