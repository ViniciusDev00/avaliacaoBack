package com.example.demo.banco;

import com.example.demo.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class BancoLivro {


    private List<Livro> livro;

    public BancoLivro() {
        this.livro = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Livro l) {
        livro.add(l);
    }

    // Busca um produto pelo ID
    public Livro findOne(int id) {
        for (Livro l : livro) {
            if (l.getIdLivro() == id) {
                return l;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Livro> findAll() {
        return new ArrayList<>(livro);
    }

    // Atualiza um produto existente na lista
    public boolean update(Livro l) {
        for (int i = 0; i < livro.size(); i++) {
            if (livro.get(i).getIdLivro() == l.getIdLivro()) {
                livro.set(i, l);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return livro.removeIf(p -> p.getIdLivro() == id);
    }
}
