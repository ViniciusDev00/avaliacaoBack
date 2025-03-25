package com.example.demo.banco;

import com.example.demo.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {

    private List<Cliente> clientes;

    public BancoCliente() {
        this.clientes = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Cliente l) {
        clientes.add(l);
    }

    // Busca um produto pelo ID
    public Cliente findOne(int id) {
        for (Cliente l : clientes) {
            if (l.getIdCliente() == id) {
                return l;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    // Atualiza um produto existente na lista
    public boolean update(Cliente l) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == l.getIdCliente()) {
                clientes.set(i, l);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return clientes.removeIf(l -> l.getIdCliente() == id);
    }
}
