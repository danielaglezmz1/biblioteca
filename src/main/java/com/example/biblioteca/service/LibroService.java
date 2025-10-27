package com.example.biblioteca.service;

import com.example.biblioteca.entity.Libro;

import java.util.*;

public interface LibroService {
    List<Libro> getLibros();

    Optional<Libro> getLibro(Long id);

    void guardarOActualizarLibro(Libro libro);

    void eliminarLibro(Long id);
}
