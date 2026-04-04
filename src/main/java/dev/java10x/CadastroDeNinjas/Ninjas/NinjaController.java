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
    public String criarNinja(){
        return " Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();

    }
    @GetMapping("todosId")
    public String mostrarPorId(){
        return "Mostrar todos Ninjas por ID";
    }

    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }

    @DeleteMapping("deletarPorID")
    public String deletarNinjaPorID(){
        return "Deletar Ninja Por ID";
    }

}


