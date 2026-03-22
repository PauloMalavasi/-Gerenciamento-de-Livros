package com.gerenciamento.Livros.Controllers;

import com.gerenciamento.Livros.Entity.LivroEntity;
import com.gerenciamento.Livros.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/livros")
public class LivroController {

    @Autowired
    public LivroService livroService;

    @PostMapping
    public LivroEntity creteLivro(@RequestBody LivroEntity livroEntity){
        return livroService.create(livroEntity);
    }

    @GetMapping
    public List<LivroEntity> findAll(){
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<LivroEntity> findById(@PathVariable Long id){
        return livroService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteLirvro(@PathVariable Long id){
        livroService.delete(id);
    }

}
