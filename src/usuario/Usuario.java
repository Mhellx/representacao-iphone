package usuario;

import equipamentos.classes.IPhone;

public class Usuario {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        // Reprodutor Musical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        // Aparelho Telefônico
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        // Navegador da Internet
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    }
}
