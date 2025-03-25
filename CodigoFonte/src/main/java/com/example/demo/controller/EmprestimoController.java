package com.example.demo.controller;

import com.example.demo.banco.BancoCliente;
import com.example.demo.banco.BancoEmprestimo;
import com.example.demo.banco.BancoLivro;
import com.example.demo.model.Cliente;
import com.example.demo.model.Emprestimo;
import com.example.demo.model.Livro;

import java.util.List;

public class EmprestimoController {

    BancoEmprestimo bcoEmprestimos = new BancoEmprestimo();
    BancoCliente bcoClientes = new BancoCliente();
    BancoLivro bcoLivros = new BancoLivro();

    public List<Emprestimo> getAllEmprestimos() {
        return bcoEmprestimos.findAll();
    }

    public Boolean save(Emprestimo e) {
        List<Cliente> clientesCadastrados = bcoClientes.findAll();
        List<Livro> livrosCadastrados = bcoLivros.findAll();

        Cliente clienteEnviado = e.getCliente();
        List<Livro> LivrosEnviados = e.getLivro();

        if (bcoClientes.findOne(clienteEnviado.getIdCliente()) == null){
            return false;
        }

        // verifica se os produtos enviados estão dentro da lista
        for (Livro l : LivrosEnviados){
            if (bcoLivros.findOne(l.getIdLivro()) == null){
                return false;
            }
        }

        bcoEmprestimos.insert(e);
        return true;
    }
}
