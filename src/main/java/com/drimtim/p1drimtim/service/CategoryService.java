package com.drimtim.p1drimtim.service;


import com.drimtim.p1drimtim.entitys.Category;
import com.drimtim.p1drimtim.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List <Category> list (){
        return categoryRepository.findAll();
    }

    public Category add (Category category){
        return categoryRepository.save(category);
    }

    public void update(Category category, Long id){

        var category1 = categoryRepository.findById(id);

        if(category1.isPresent()){
            var category2 = category1.get();

            category2.setTitulo(category.getTitulo());
            category2.setDescripcion(category.getDescripcion());
            category2.setUrlImagen(category.getUrlImagen());
        }
        categoryRepository.save(category);

    }

    public void delete(Long id){
        categoryRepository.deleteById(id);
    }

    public Optional<Category> buscarPorId(Long id){
    return categoryRepository.findById(id);
    }

}
