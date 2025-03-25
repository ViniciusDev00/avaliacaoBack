package com.example.demo.view;

import com.example.demo.controller.LivroController;
import com.example.demo.model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class LivroView {

    LivroController lc = new LivroController();

    @GetMapping("/livro")
    public List<Livro> getAllLivros(){
        return lc.getAllLivros();
    }

    @PostMapping("/livro")
    public Boolean postLivro(@RequestBody Livro l){
        return lc.save(l);
    }
}
