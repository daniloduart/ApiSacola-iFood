package me.dio.sacola.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor   // essa anotação cria um construtor com todos os atributos
@Builder    // essa anotação cria um componente que ajuda na hr da criação do objeto
@Data    // essa anotação cria todos os Get's e Set's
@Embeddable     // essa anotação nao cria uma tabela no banco de dados
@NoArgsConstructor    // essa anotação cria um construtor sem nenhum argumento (exigencia do Hibernate)

public class ItemDto {

    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
