package equipamentos.classes;

import equipamentos.interfaces.AparelhoTelefonico;
import equipamentos.interfaces.NavegadorInternet;
import equipamentos.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando via iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação via iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet via iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de página da internet via iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet via iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via iPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música via iPhone");
    }
}
