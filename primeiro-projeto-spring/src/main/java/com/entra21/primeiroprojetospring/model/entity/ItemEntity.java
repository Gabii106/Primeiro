package com.entra21.primeiroprojetospring.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "item")

public abstract class ItemEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_venda")
    private Double valorVenda;

    @Column(name = "valor_locacao")
    private Double valorLocacao;

    @Column(name = "emprestado")
    private Boolean emprestado;

    //Muitos (item) para um (franquia) - na franquia é o contrário
    @ManyToOne
    @JoinColumn(name = "id_franquia", referencedColumnName = "id")
    private FranquiaEntity franquia;

    // Um (Item) para muitos (avaliações)
    @OneToMany(mappedBy = "item")
    private Set<AvaliacaoEntity> avaliacoes;

    //Muitos (item) para muitos (generos)
    @ManyToMany
    @JoinTable(
            name = "genero_item",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private Set<GeneroEntity> generos;
//@JsonProperty("Type")
//    public abstract String getType();
}
