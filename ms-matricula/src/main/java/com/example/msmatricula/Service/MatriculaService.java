package com.example.msmatricula.Service;


import com.example.msmatricula.Entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface MatriculaService {
    List<Matricula> listar();
    Optional<Matricula> buscarPorId(Integer id);
    Matricula guardar(Matricula categoria);
    Matricula actualizar(Matricula categoria);
    void borrarPorId(Integer id);
}
