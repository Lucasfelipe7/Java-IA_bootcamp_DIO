public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String musicaAtual;
    private String numeroTelefone;
    private String urlPagina;

    @Override
    public void ligar(String numero) {
        this.numeroTelefone = numero;
        System.out.println("Ligando para " + numeroTelefone );
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefonema");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        this.urlPagina = url;
        System.out.println("Exibindo página" + urlPagina );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página" + urlPagina );
    }

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando a música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Musica pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }
}
