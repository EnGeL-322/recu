package com.example.msmatricula.Respository;


import com.example.msmatricula.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {
}
