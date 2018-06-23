package br.com.uds.personagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PersonagemServiceImpl implements PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    @Override
    public Personagem criar(Ryu ryu) {
        return this.repository.save(ryu);
    }

    @Override
    public Set<Personagem> listar() {
        return this.repository.findAll();
    }

    @Override
    public Personagem obter(UUID id) {
        return this.repository.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repository.delete(id);
    }
}
