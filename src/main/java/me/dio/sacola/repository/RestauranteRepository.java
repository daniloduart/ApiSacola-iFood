package me.dio.sacola.repository;

import me.dio.sacola.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository    // essa anotação cria um vinculo dessa interface com o banco de dados
public interface RestauranteRepository extends JpaRepository<Restaurante,Long> {
}
