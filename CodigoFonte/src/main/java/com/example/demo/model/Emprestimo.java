package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private ArrayList<Livro> livro;
    private Cliente cliente;

    public Emprestimo(LocalDate dataInicio, LocalDate dataFim, ArrayList<Livro> livro, Cliente cliente) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.livro = livro;
        this.cliente = cliente;
    }

    public static void add(Emprestimo l) {
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}