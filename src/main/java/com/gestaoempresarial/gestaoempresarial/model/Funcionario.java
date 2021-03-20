package com.gestaoempresarial.gestaoempresarial.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Funcionario {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nomeCompleto;

    @Column
    private String cpf;

    @Column
    private String cargo;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    @JsonBackReference
    private Empresa empresa;
}
