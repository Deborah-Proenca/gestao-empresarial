package com.gestaoempresarial.gestaoempresarial.service;

import com.gestaoempresarial.gestaoempresarial.model.Empresa;
import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import com.gestaoempresarial.gestaoempresarial.repository.EmpresaRepository;
import com.gestaoempresarial.gestaoempresarial.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;

    public Funcionario save(Funcionario funcionario){
        Integer idEmpresa = funcionario.getEmpresa().getId();
        Empresa empresa = empresaRepository.findById(idEmpresa).orElseThrow();
        empresa.setQuantidadeFuncionario(empresa.getQuantidadeFuncionario() + 1);
        Funcionario funcionarioSave = funcionarioRepository.save(funcionario);
        if(!ObjectUtils.isEmpty(funcionarioSave)) {
            empresaRepository.save(empresa);
        }
        return funcionarioSave;
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
