package aparelho;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Iphone está ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Iphone atendeu a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone está iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Iphone está exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone adicionou nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone está atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone pausou música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Iphone selecioniou a música: " + musica);
    }
}
