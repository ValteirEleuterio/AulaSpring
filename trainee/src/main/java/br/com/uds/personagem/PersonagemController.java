package br.com.uds.personagem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {

    @PostMapping
    @GetMapping
    @DeleteMapping
    @PutMapping
    public ResponseEntity criar(@RequestBody Ryu ryu){
        // salvar Ryu
        return new ResponseEntity(ryu.toString(), HttpStatus.CREATED);
    }

}
