package me.dio.sacola.repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     // essa anotação cria um vinculo dessa interface com o banco de dados
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
