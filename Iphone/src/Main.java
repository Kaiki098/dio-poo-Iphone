import aparelho.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = iphone;
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar("205443543");

        ReprodutorMusical reprodutorMusical = iphone;
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Voando pro Pará");
        reprodutorMusical.tocar();

        NavegadorNaInternet navegadorNaInternet = iphone;
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();
        navegadorNaInternet.exibirPagina("youtube.com");
    }
}