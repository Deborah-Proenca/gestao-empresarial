package com.gestaoempresarial.gestaoempresarial.repository;

import com.gestaoempresarial.gestaoempresarial.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
}
