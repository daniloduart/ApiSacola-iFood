package me.dio.sacola.resource;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value="/ifood-devweek/sacola")
@RestController     // essa anotação informa que essa classe é que vai conter os EndPoints
@RequestMapping("/ifood-devweek/sacolas")    // essa anotação define como serão escritos os EndPoints
@RequiredArgsConstructor // essa anotação cria um construtor
public class SacolaResource {
    private final SacolaService sacolaservice;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemdto) {
        return sacolaservice.incluirItemNaSacola(itemdto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id) {
        return sacolaservice.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")  //essa anotação atualiza e finaliza a sacola
    public Sacola fecharSacola(@PathVariable ("sacolaId")Long sacolaId, @RequestParam("formaPagamento") int formaPagamento){
        return sacolaservice.fecharSacola(sacolaId, formaPagamento);
    }

}
