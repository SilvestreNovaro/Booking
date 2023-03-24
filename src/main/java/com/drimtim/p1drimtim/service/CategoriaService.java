package com.drimtim.p1drimtim.service;
import com.drimtim.p1drimtim.entity.Categoria;
import com.drimtim.p1drimtim.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
// cuando va void no va con return
public class CategoriaService {

    private final CategoriaRepository repository;

    public List<Categoria> list(){
        return repository.findAll();
    }

    public void add(Categoria categoria){
        repository.save(categoria);
    }

    public void update(Categoria categoria, long id){
        // acá va con exception porque te puede devolver un categoria o un exception, no estas
        // seguro si te va devolver una Categoría.
        repository.findById(id).orElseThrow(()-> new RuntimeException());
        var cat = repository.findById(id).get();
        cat.setTitulo(categoria.getTitulo());
        cat.setDescripcion(categoria.getDescripcion());
        cat.setUrlImagen(categoria.getUrlImagen());
        repository.save(cat);
    }

    public void delete(long id){
        repository.findById(id).orElseThrow(()-> new RuntimeException());
        repository.deleteById(id);
    }

}
