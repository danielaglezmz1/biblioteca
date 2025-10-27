package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Data //Evita definir los getters y setters, los genera implicitamente
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column
    private String autor;
}