package com.example.escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name="escola")

@Getter
@Setter

@NoArgsConstructor
public class AlunosModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public void setId(Long _id) {
        this.id = _id;
    }

    @Column(nullable=false)
    private String nome;

    @Column
    private String email;
}