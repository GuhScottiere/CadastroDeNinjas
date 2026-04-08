package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }

    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();

    }
    @GetMapping("lista/{id}")
     public NinjaDTO listarninjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);

    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorId(@PathVariable Long id,@RequestBody NinjaDTO ninjaAtualizado ){
        return ninjaService.atualizarNinja(id,ninjaAtualizado);
    }

    @DeleteMapping("deletarPor/{id}")
    public String deletarNinjaPorID(@PathVariable Long id){
        return "Deletar Ninja Por ID";
    }

}


