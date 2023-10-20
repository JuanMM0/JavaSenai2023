package Atividades;

// Classe abstrata para a Crítica
abstract class Crítica {
    abstract void critica();
}

// Interface Jogo
interface Jogo {
    void Design();
    void História();
    void GamePlay();
	void critica();
    void NomeJogo();
}

// Classe abstrata que implementa a interface Jogo
abstract class JogoBase extends Crítica implements Jogo {
    @Override
    public
    void critica() {
        System.out.println("\nCrítica do jogo\n");
    }
}

// Classe RedDead2 que herda de JogoBase
class RedDead2 extends JogoBase {
    @Override
    public void NomeJogo() {
        System.out.println("\nRed Dead Redempition 2\n");
    }

    @Override
    public void Design() {
        System.out.println("\nO melhor jogo que já joguei e vi na minha vida, gráficos espetaculares, detalhes mínimos, mas que fazem a diferença.\n");
    }

    @Override
    public void História() {
        System.out.println("\nHistória do jogo é excelente e o final é lindo.\n");
    }

    @Override
    public void GamePlay() {
        System.out.println("\nUm jogo absurdo com várias horas de gameplay, mundo aberto para explorar, uma experiência incrível de velho oeste que supera o primeiro.\n");
    }
}

// Classe Undertale que herda de JogoBase
class Undertale extends JogoBase {
    @Override
    public void NomeJogo() {
        System.out.println("\nUndertale\n");
    }

    @Override
    public void Design() {
        System.out.println("\nO estilo de arte do jogo é lindo.\n");
    }

    @Override
    public void História() {
        System.out.println("\n A história consegue lhe proporcionar momentos de alegria, tristeza, raiva e etc.\n");
    }

    @Override
    public void GamePlay() {
        System.out.println("\nA jogabilidade é ótima, os personagens também têm personalidades bem marcantes que vai ser difícil esquecer.\n");
    }
}

// Classe SonicSuperstars que herda de JogoBase
class HollowKnight extends JogoBase {
    @Override
    public void NomeJogo() {
        System.out.println("\nHollow Knight\n");
    }
    @Override
    public void Design() {
        System.out.println("\nJogo com artes maravilhosas, com cada disingn sendo unico e contando uma história do mundo, tanto com inimigos ou arenas de boss\n.");
    }

    @Override
    public void História() {
        System.out.println("\nA história é magica, com a exploração e o desafio sendo recompasados por pedações da história do jogo, fazendo com que os corajosos desbravadores tenham uma ótima experiência.\n");
    }

    @Override
    public void GamePlay() {
        System.out.println("\nMe perdi :)\n");
    }
}
