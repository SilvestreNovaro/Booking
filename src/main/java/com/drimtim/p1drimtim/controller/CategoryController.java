package com.drimtim.p1drimtim.controller;

import com.drimtim.p1drimtim.entitys.Category;
import com.drimtim.p1drimtim.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin
@RestControllerAdvice
@Validated
@RequestMapping("/categorys")
public class CategoryController {

 private final CategoryService categoryService;

 @GetMapping("/list")
 public List<Category> list() {
  return categoryService.list();
 }
 @PostMapping("/add")
  public ResponseEntity<String> add(@RequestBody Category category){
     categoryService.add(category);
     return ResponseEntity.ok("added category "+ category.getTitulo() + "succesfully");
 }

 @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Category category, @PathVariable Long id){
     Optional<Category> getId = categoryService.buscarPorId(id);
     if(getId.isPresent()){

     }
     categoryService.update(category, id);
     return ResponseEntity.ok("Updated " + category.getTitulo() + "succesfully");

 }

 @DeleteMapping("/delete/id")
    public ResponseEntity<String> delete(@PathVariable Long id){
     categoryService.delete(id);
     return ResponseEntity.ok("category deleted");
 }


}






