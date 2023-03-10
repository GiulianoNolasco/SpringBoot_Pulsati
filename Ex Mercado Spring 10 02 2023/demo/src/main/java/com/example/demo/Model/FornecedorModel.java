package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
@Table(name = "A_GIU_FORNECEDORES")
public class FornecedorModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,generator= "giu_for")
    @SequenceGenerator(name="SEQ_A_GIU_FORNECEDORES", sequenceName="SEQ_A_GIU_FORNECEDORES")
    @Column(name = "id_fornecedor")
    private int idFornecedor;
    @Size(min = 2, max = 100, message = "Tamanho fora do padrao.")
    @Column(name = "nome")
    private String nome;
    @NotBlank
    @Column(name = "endereco")
    private String endereco;
    @NotBlank
    @Column(name = "telefone")
    private String telefone;

}
