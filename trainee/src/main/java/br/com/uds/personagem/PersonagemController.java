package br.com.uds.personagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemServiceImpl personagemService;

    @PostMapping
    public ResponseEntity criar(@RequestBody Ryu ryu){
        // salvar Ryu
        return new ResponseEntity( personagemService.criar(ryu).toString(),HttpStatus.CREATED);
    }

    @GetMapping
    public Set<Personagem> listar(){
        return this.personagemService.listar();
    }
}
