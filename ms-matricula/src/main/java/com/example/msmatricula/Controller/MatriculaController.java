package com.example.msmatricula.Controller;


import com.example.msmatricula.Entity.Matricula;
import com.example.msmatricula.Service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Matricula> buscarPorId(@PathVariable Integer id) {
        return matriculaService.buscarPorId(id);
    }

    @PostMapping
    public Matricula guardar(Matricula categoria) {
        return matriculaService.guardar(categoria);
    }

    @PutMapping
    public Matricula actualizar(Matricula categoria) {
        return matriculaService.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        matriculaService.borrarPorId(id);
        return "Categoria eliminada";
    }
}
