package com.drimtim.p1drimtim.service;


import com.drimtim.p1drimtim.entity.Producto;
import com.drimtim.p1drimtim.repository.ProductoRepository;
import com.drimtim.p1drimtim.service.exception.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> list(){ return repository.findAll();}
    /**
     * Ojo con el orden en el cual pones lo que devuelva en el repo, siempre es <entidad, id>
     *     Preguntarle a alguien que sabe si es mejor trabajar con responseEntity o KISS mas simple devolviendo vos el mensaje nomas
     */

    public void add(Producto producto){ repository.save(producto); }

    public void update(long id, Producto producto) throws NotFoundException {
        repository.findById(id).orElseThrow(()-> new NotFoundException("Producto no encontrado"));
    }

    public void delete(Long id) {
        repository.deleteById(id);}


}
