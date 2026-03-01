package br.com.dio.iphone;

import br.com.dio.iphone.interfaces.AparelhoTelefonico;
import br.com.dio.iphone.interfaces.NavegadorInternet;
import br.com.dio.iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private final String modelo;

    // Estado simples (só para demonstrar comportamento)
    private String musicaAtual;
    private int abaCount;
    private String paginaAtual;

    public iPhone(String modelo) {
        this.modelo = (modelo == null || modelo.isBlank()) ? "iPhone" : modelo;
        this.abaCount = 1; // começa com 1 aba “aberta”
    }

    public String getModelo() {
        return modelo;
    }

    // =========================
    // ReprodutorMusical
    // =========================
    @Override
    public void tocar() {
        if (musicaAtual == null || musicaAtual.isBlank()) {
            System.out.println("[MÚSICA] Nenhuma música selecionada. Selecione uma música antes de tocar.");
            return;
        }
        System.out.println("[MÚSICA] Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("[MÚSICA] Pausado.");
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null || musica.isBlank()) {
            System.out.println("[MÚSICA] Música inválida.");
            return;
        }
        this.musicaAtual = musica.trim();
        System.out.println("[MÚSICA] Música selecionada: " + this.musicaAtual);
    }

    // =========================
    // AparelhoTelefonico
    // =========================
    @Override
    public void ligar(String numero) {
        if (numero == null || numero.isBlank()) {
            System.out.println("[TEL] Número inválido.");
            return;
        }
        System.out.println("[TEL] Ligando para: " + numero.trim());
    }

    @Override
    public void atender() {
        System.out.println("[TEL] Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("[TEL] Iniciando correio de voz...");
    }

    // =========================
    // NavegadorInternet
    // =========================
    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isBlank()) {
            System.out.println("[WEB] URL inválida.");
            return;
        }
        this.paginaAtual = url.trim();
        System.out.println("[WEB] Exibindo página: " + this.paginaAtual + " (abas abertas: " + abaCount + ")");
    }

    @Override
    public void adicionarNovaAba() {
        abaCount++;
        System.out.println("[WEB] Nova aba adicionada. Total de abas: " + abaCount);
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual == null || paginaAtual.isBlank()) {
            System.out.println("[WEB] Nenhuma página para atualizar. Abra uma página primeiro.");
            return;
        }
        System.out.println("[WEB] Atualizando página: " + paginaAtual);
    }
}