public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Testando ReprodutorMusical
        iphone.selecionarMusica("Mais Um Favelado “DJ GM” MC Lipi, Lele JP");
        iphone.tocar();
        iphone.pausar();

        // Testando AparelhoTelefonico
        iphone.ligar("(77) 7777-7777");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}