package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private List<Habilidade> habilidades;
    private List<Item> itens;

    public Personagem(String nome, int nivel, int saude, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.habilidades = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.itens = new ArrayList<>();
    }
    public void atacar(Inimigo inimigo) {
    	System.out.println("O inimigo " + nome + " atacou o personagem " + inimigo.getNome());
        int energiaAtaque = nivel * 2; 
        int novaEnergiainimigo = inimigo.getEnergia() - energiaAtaque;
        inimigo.setEnergia(novaEnergiainimigo);
    }

    public void pegarItem(Item item) {
        System.out.println("Você pegou o item " + item);
        itens.add(item);
    }

    public void caminhar(double x, double y) {
        System.out.println("Você foi para o ponto (" + x + ", " + y + ")");
    }

    public void usarHabilidade(Habilidade habilidade) {
        if (habilidades.contains(habilidade)) {
            System.out.println("Você usou a habilidade " + habilidade);
            habilidade.ativar();
        } else {
            System.out.println("Você não possui a habilidade " + habilidade);
        }
    }

    public void usarItem(Item item) {
        if (itens.contains(item)) {
            System.out.println("Você usou o item " + item);
            item.usar();
        } else {
            System.out.println("Você não possui o item " + item);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Saúde: " + saude);
        System.out.println("Energia: " + energia);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Itens: " + itens);
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

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    @Override
    public String toString() {
        return "Personagem: " + nome;
    }
	
}
