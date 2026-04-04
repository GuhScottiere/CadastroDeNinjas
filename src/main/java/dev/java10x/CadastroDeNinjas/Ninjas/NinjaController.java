package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return " Ninja criado";
    }

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os ninja";

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


