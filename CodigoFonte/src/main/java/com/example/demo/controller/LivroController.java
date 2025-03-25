package com.example.demo.controller;

import com.example.demo.banco.BancoLivro;
import com.example.demo.model.Livro;

import java.util.List;

public class LivroController {


    BancoLivro bl = new BancoLivro();

    public List<Livro> getAllLivros() {
        return bl.findAll();
    }

    public Boolean save(Livro l) {
        bl.insert(l);
        return true;
    }

}
