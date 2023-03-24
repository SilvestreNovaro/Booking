package com.drimtim.p1drimtim.repository;

import com.drimtim.p1drimtim.entitys.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

    @Query("select c FROM Caracteristicas c where c.nombre = ?1")
    public Optional<Category> findByNombre(String nombre);
}
