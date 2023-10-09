package br.edu.univas;

public class HabilidadeAtaqueFeroz implements interfaceHabilidade{
    private String nome;
    private String descricao;
    private int custoEnergia;
    private Personagem personagem;
    public HabilidadeAtaqueFeroz() {
        this.nome = "Ataque Feroz";
        this.descricao =  "Ataque poderoso";
        this.custoEnergia = 10;
    }
    @Override
    public void ativar() {
        System.out.println("A habilidade " + nome + " foi ativada.");
        int novaEnergia = personagem.getEnergia() - custoEnergia;
        personagem.setEnergia(novaEnergia);
    }

    // Getters e setter
    
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

