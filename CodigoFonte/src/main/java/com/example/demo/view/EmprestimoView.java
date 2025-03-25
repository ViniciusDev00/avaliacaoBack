package com.example.demo.view;

import com.example.demo.controller.EmprestimoController;
import com.example.demo.model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmprestimoView {


    EmprestimoController em = new EmprestimoController();

    @GetMapping("/emprestimo")
    public List<Emprestimo> getAllEmprestimos(){
        return em.getAllEmprestimos();
    }
    @PostMapping("/emprestimo")
    public Boolean postVendas(@RequestBody Emprestimo e){
        return em.save(e);
    }

    @PutMapping("/emprestimo")
    public Boolean putVendas(@RequestBody Emprestimo e){
        return em.save(e);
    }
    @DeleteMapping("/emprestimo")
    public Boolean deleteVendas(@RequestBody Emprestimo e){
        return em.save(e);
    }
}
