package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
//criacao da entidade  e tabela
@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    //gerando o id e a estrategia que geração do id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nomeDaMissao;
    private String dificuldade;


    //uma missão pode ter uma lista de ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
