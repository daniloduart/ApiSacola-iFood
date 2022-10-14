package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor   // essa anotação cria um construtor com todos os atributos (
@Builder    // essa anotação cria um componente que ajuda na hr da criação do objeto
@Data    // essa anotação cria todos os Get's e Set's
@Entity    //essa anotação indica que a classe precisa virar uma tabela
@JsonIgnoreProperties({"HibernateLazyInitializer", "handler"})
// essa anotação ajuda o Json a ignorar alguns erros no console por conta da fetch lazy no Hibernate
// se aparecer algum erro relacionado ao Hibernate trabalhando com atributos Lazy, basta colocar essa anotaçao
@NoArgsConstructor    // essa anotação cria um construtor sem nenhum argumento (exigencia do Hibernate)

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @Embedded
    private Endereco endereco;
}
