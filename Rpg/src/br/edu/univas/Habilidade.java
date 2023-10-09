package br.edu.univas;

public class Habilidade {
    private String nome;
    private String descricao;
    private int custoEnergia;
    private Personagem personagem;
    public Habilidade(String nome, String descricao, int custoEnergia) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoEnergia = custoEnergia;
    }

    public void ativar() {
        System.out.println("A habilidade " + nome + " foi ativada.");
        int novaEnergia = personagem.getEnergia() - custoEnergia;
        personagem.setEnergia(novaEnergia);
    }

    // Getters e setters (caso necessário)
    
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(int custoEnergia) {
        this.custoEnergia = custoEnergia;
    }
    @Override
    public String toString() {
        return "Habilidade: " + nome;
    }
}

