package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class MundoVirtual {
    private String[][] mapa;
    private List<Personagem> personagens;
    private List<Missao> missoesAtivas;
    private List<Inimigo> inimigos;

    public MundoVirtual(String[][] mapa) {
        this.mapa = mapa;
        this.personagens = new ArrayList<>();
        this.missoesAtivas = new ArrayList<>();
        this.inimigos = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void adicionarMissaoAtiva(Missao missao) {
        missoesAtivas.add(missao);
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    public void interagir() {
        for (Personagem personagem : personagens) {
            for (Inimigo inimigo : inimigos) {
                personagem.atacar(inimigo);
            }

            List<InterfaceItem> itensNoLocal = personagem.getItens();
            for (InterfaceItem item : itensNoLocal) {
                personagem.pegarItem(item);
            }
        }
    }

   

    // Getters e setters

    public String[][] getMapa() {
        return mapa;
    }

    public void setMapa(String[][] mapa) {
        this.mapa = mapa;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public List<Missao> getMissoesAtivas() {
        return missoesAtivas;
    }

    public void setMissoesAtivas(List<Missao> missoesAtivas) {
        this.missoesAtivas = missoesAtivas;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(List<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }
}

