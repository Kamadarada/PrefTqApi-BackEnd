package com.PrefTqApi.rga.Controller;


import com.PrefTqApi.rga.Models.Aluno;
import com.PrefTqApi.rga.Repository.AlunoRepository;
import com.PrefTqApi.rga.RequestDto.DadosAluno;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aluno")
@RestController
@CrossOrigin("http://localhost:3000")
public class AlunoController {


    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity CriarAluno(@RequestBody DadosAluno dados){
        alunoRepository.save(new Aluno(dados));
        System.out.println("Aluno Cadastrado com sucesso!");
        return ResponseEntity.ok("Aluno Cadastrado com sucesso!");
    }


    @GetMapping
    public List<Aluno> GetAluno(){
        return alunoRepository.findAll();
    }

}
