package com.example.demo.controller;

import com.example.demo.banco.BancoCliente;
import com.example.demo.model.Cliente;

import java.util.List;

public class ClienteController {

        BancoCliente bc = new BancoCliente();
        public List<Cliente> getAllClientes() {
            return bc.findAll();
        }

        public Boolean save(Cliente c) {
            bc.insert(c);
            return true;
        }
}
