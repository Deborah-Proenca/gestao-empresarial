package com.gestaoempresarial.gestaoempresarial.repository;

import com.gestaoempresarial.gestaoempresarial.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
}
