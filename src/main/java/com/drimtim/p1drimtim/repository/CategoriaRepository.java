package com.drimtim.p1drimtim.repository;

import com.drimtim.p1drimtim.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Recordar que siempre es una interface y no una clase
// el long lo puse en minuscula nose si cambia algo

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
