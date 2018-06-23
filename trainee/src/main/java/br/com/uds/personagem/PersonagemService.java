package br.com.uds.personagem;


import java.util.Set;
import java.util.UUID;

public interface PersonagemService {

    Personagem criar(Ryu ryu);

    Set<Personagem> listar();

    Personagem obter(UUID id);

    void remover(UUID id);
}
