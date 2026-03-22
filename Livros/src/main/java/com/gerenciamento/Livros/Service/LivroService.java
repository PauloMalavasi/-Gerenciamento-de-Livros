package com.gerenciamento.Livros.Service;

import com.gerenciamento.Livros.Entity.LivroEntity;
import com.gerenciamento.Livros.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    public LivroRepository livroRepository;

    public List<LivroEntity> findAll(){
        return livroRepository.findAll();
    }

    public LivroEntity create(LivroEntity livroEntity){
        return livroRepository.save(livroEntity);
    }

    public void delete(Long id){
        livroRepository.deleteById(id);
    }

    public Optional<LivroEntity> findId(Long id){
        return livroRepository.findById(id);
    }


}
