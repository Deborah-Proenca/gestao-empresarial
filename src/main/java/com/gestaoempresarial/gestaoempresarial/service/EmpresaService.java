package com.gestaoempresarial.gestaoempresarial.service;

import com.gestaoempresarial.gestaoempresarial.model.Empresa;
import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import com.gestaoempresarial.gestaoempresarial.repository.EmpresaRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public void deleteById(Integer id) {
        empresaRepository.deleteById(id);
    }

    public Empresa findById(Integer id) throws NotFoundException {
        return empresaRepository.findById(id).orElseThrow(() -> new NotFoundException("Empresa não cadastrada"));
    }

    public Empresa update(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}

