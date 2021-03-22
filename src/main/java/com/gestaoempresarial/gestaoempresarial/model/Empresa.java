package com.gestaoempresarial.gestaoempresarial.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String razaoSocial;

    @Column
    private String nomeFantasia;

    @Column
    private Integer quantidadeFuncionario;

    @Column
    private Boolean situacao=true;


    @OneToMany(mappedBy = "empresa")
    @JsonManagedReference
    private List<Funcionario> funcionarios;
}
