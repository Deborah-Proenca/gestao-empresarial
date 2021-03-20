package com.gestaoempresarial.gestaoempresarial.controller;

import com.gestaoempresarial.gestaoempresarial.model.Empresa;
import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import com.gestaoempresarial.gestaoempresarial.service.EmpresaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")

public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public Empresa save(@RequestBody Empresa empresa){
        return empresaService.save(empresa);

    }

    @GetMapping ("/recuperar-todos")
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        empresaService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Empresa findById(@PathVariable Integer id) throws NotFoundException {
        return empresaService.findById(id);
    }

    @PutMapping("/{id}")
    public Empresa update(@RequestBody Empresa empresa) {
        return empresaService.update(empresa);
    }
}

