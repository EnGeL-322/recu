package com.example.msmatricula.Service.Impl;


import com.example.msmatricula.Entity.Matricula;
import com.example.msmatricula.Respository.MatriculaRepository;
import com.example.msmatricula.Service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Override
    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }

    @Override
    public Optional<Matricula> buscarPorId(Integer id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public Matricula guardar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public Matricula actualizar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public void borrarPorId(Integer id) {
        matriculaRepository.deleteById(id);
    }
}
