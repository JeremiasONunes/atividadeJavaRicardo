package br.edu.univas;


public class Missao {
    private String titulo;
    private String descricao;
    private Item recompensa;
    private String objetivos;
    private boolean completada;

    public Missao(String titulo, String descricao, Item recompensa, String objetivos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensa = recompensa;
        this.objetivos = objetivos;
        this.completada = false;
    }

    public void iniciar(Personagem personagem) {
        System.out.println("A missão " + titulo + " foi iniciada por " + personagem.getNome());
    }

    public void completar(Personagem personagem) {
        System.out.println("A missão " + titulo + " foi completada.");
        personagem.pegarItem(recompensa);;
        completada = true;
    }

    public void atualizarProgresso(String progresso) {
        this.objetivos = progresso;
    }

    // Getters e setters 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Item getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Item recompensa) {
        this.recompensa = recompensa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    @Override
    public String toString() {
        return "Missão: " + titulo;
    }
}

