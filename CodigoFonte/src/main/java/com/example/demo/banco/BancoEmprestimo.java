package com.example.demo.banco;

import com.example.demo.model.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BancoEmprestimo {


    private List<Emprestimo> emprestimo;

    public BancoEmprestimo() {
        this.emprestimo = new ArrayList<>();
    }

    // Insere um novo produto na lista
   public void insert(Emprestimo l) {
       emprestimo.add(l);
   }

    // Busca um produto pelo datafim
    public Emprestimo findOne(LocalDate dataFim) {
        for (Emprestimo l : emprestimo) {
            if (l.getDataFim() == dataFim) {
                return l;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimo);
    }

    // Atualiza um produto existente na lista
    public boolean update(Emprestimo l) {
        for (int i = 0; i < emprestimo.size(); i++) {
            if (emprestimo.get(i).getDataFim() == l.getDataFim()) {
                emprestimo.set(i, l);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(LocalDate dataFim) {
        return emprestimo.removeIf(l -> l.getDataFim() == dataFim);
    }
}
