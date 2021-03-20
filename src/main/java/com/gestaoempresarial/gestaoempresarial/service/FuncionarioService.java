package com.gestaoempresarial.gestaoempresarial.service;

import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import com.gestaoempresarial.gestaoempresarial.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario save(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void deleteById(Integer id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario update(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }
}
