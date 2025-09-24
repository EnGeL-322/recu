package com.example.mscurso.Service.Impl;


import com.example.mscurso.Entity.Curso;
import com.example.mscurso.Respository.CursoRepository;
import com.example.mscurso.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository categoriaRepository;
    @Override
    public List<Curso> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Curso guardar(Curso categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Curso actualizar(Curso categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void borrarPorId(Integer id) {
    categoriaRepository.deleteById(id);
    }
}
