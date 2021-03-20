package com.gestaoempresarial.gestaoempresarial.controller;

import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import com.gestaoempresarial.gestaoempresarial.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario save(@RequestBody Funcionario funcionario){
        return funcionarioService.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        funcionarioService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Funcionario update(@RequestBody Funcionario funcionario){
        return funcionarioService.update(funcionario);

    }

    @GetMapping
    public List<Funcionario> findAll() {
        return funcionarioService.findAll();
    }
}
