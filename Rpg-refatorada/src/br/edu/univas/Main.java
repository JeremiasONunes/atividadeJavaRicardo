package br.edu.univas;

public class Main {
    public static void main(String[] args) {
        // Criando um mapa
        String[][] mapa = {
            { ".", ".", ".", ".", "." },
            { ".", "X", ".", ".", "." },
            { ".", ".", ".", "X", "." },
            { ".", ".", ".", ".", "." },
            { ".", ".", ".", ".", "." }
        };

        // Criando um mundo virtual com o mapa
        MundoVirtual mundo = new MundoVirtual(mapa);

        // Criando personagem
        Personagem personagem = new Personagem("Herói", 1, 100, 100);
        
        // Criando habilidade
        
        HabilidadeAtaqueFeroz habilidade = new HabilidadeAtaqueFeroz();
        //criando item
        Item item = new Item("Espada de cristal", "Espada épica", "lendario", "Dano extra");
        
        // Adicionando habilidade ao personagem
        
        personagem.addHabilidade(habilidade);
        
        //pegando item
        personagem.pegarItem(item);
        
        // Criando inimigo
        Inimigo inimigo = new Inimigo("Monstro", 1, 50, 50, null);

        // Adicionando inimigo ao mundo virtual
        mundo.adicionarInimigo(inimigo);

        // Iniciando missão
        Item recompensa = new Item("Espada Mágica", "Uma espada poderosa", "Arma", "Aumenta o dano em 50%");
        Missao missao = new Missao("Derrotar o Monstro", "Derrote o monstro para salvar a cidade", recompensa, "Derrotar o Monstro");
        missao.iniciar(personagem);

        // Simulando ataque do personagem ao inimigo
        inimigo.atacar(personagem);

        // Exibindo informações do personagem após o ataque
        System.out.println("\nInformações do Personagem após o Ataque:");
        personagem.exibirInformacoes();

        // Completando a missão
        missao.completar(personagem);

        // Exibindo informações do personagem após a missão
        System.out.println("\nInformações do Personagem após a Missão:");
        personagem.exibirInformacoes();
    }
}
