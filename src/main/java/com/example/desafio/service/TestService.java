package com.example.desafio.service;

import com.example.desafio.domain.Test;
import com.example.desafio.repository.TestRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    @PostConstruct
    private void salvar(){
        Test entidade = new Test();
        entidade.setEmail("teste@email");
        entidade.setName("nome");
        testRepository.save(entidade);
    }
}
