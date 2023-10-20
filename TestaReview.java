package Atividades;

public class TestaReview {
    public static void main(String[] args) {
        // Testando a crítica para o jogo Red Dead Redemption 2
        Jogo redDead2 = new RedDead2();
        redDead2.NomeJogo();
        redDead2.critica();
        redDead2.Design();
        redDead2.História();
        redDead2.GamePlay();

        // Testando a crítica para o jogo Undertale
        Jogo undertale = new Undertale();
        undertale.NomeJogo();
        undertale.critica();
        undertale.Design();
        undertale.História();
        undertale.GamePlay();

        // Testando a crítica para o jogo Sonic Superstars
        Jogo HollowKnight= new HollowKnight();
        HollowKnight.NomeJogo();
        HollowKnight.critica();
        HollowKnight.Design();
        HollowKnight.História();
        HollowKnight.GamePlay();
    }
}
