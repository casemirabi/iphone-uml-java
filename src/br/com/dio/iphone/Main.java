package br.com.dio.iphone;

public class Main {

    public static void main(String[] args) {
        iPhone iphone = new iPhone("iPhone (Desafio DIO)");
        // Reprodutor Musical
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        // Aparelho Telefônico
        iphone.ligar("+55 (11) 99999-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        // Navegador na Internet
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me");
        iphone.atualizarPagina();
    }
}
