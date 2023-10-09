package br.edu.univas;

import java.util.List;

public class Inimigo {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private List<String> habilidadesDeCombate;

    public Inimigo(String nome, int nivel, int saude, int energia, List<String> habilidadesDeCombate) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.habilidadesDeCombate = habilidadesDeCombate;
    }

    public void atacar(Personagem personagem) {
        System.out.println("O inimigo " + nome + " atacou o personagem " + personagem.getNome());
        int energiaAtaque = nivel * 2; 
        int novaEnergiaPersonagem = personagem.getEnergia() - energiaAtaque;
        personagem.setEnergia(novaEnergiaPersonagem);
    }

    // Getters e setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public List<String> getHabilidadesDeCombate() {
        return habilidadesDeCombate;
    }

    public void setHabilidadesDeCombate(List<String> habilidadesDeCombate) {
        this.habilidadesDeCombate = habilidadesDeCombate;
    }
    @Override
    public String toString() {
        return "Inimigo: " + nome;
    }
}

