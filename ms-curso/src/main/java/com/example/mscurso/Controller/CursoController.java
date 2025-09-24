package com.example.mscurso.Controller;


import com.example.mscurso.Entity.Curso;
import com.example.mscurso.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Curso> buscarPorId(@PathVariable Integer id) {
        return cursoService.buscarPorId(id);
    }

    @PostMapping
    public Curso guardar(Curso categoria) {
        return cursoService.guardar(categoria);
    }

    @PutMapping
    public Curso actualizar(Curso categoria) {
        return cursoService.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        cursoService.borrarPorId(id);
        return "Categoria eliminada";
    }
}
