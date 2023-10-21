public class Iphone implements AparelhoTelefônico, NavegadorInternet, ReprodutorMusical{

    //Metodos de Aparelho telefonico
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero: " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }
    @Override
    public void iniciarCorreioVoz(int numero) {
        System.out.println("Deixando mensagem de voz para o numero: " + numero);
    }

    //Metodos de Navegador Internet
    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo pagina no navegador: " + pagina);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador.");
    }
    @Override
    public void atualizarPagina(String pagina) {
        System.out.println("Atualizando a pagina " + pagina + " no navegador: ");
    }

    //Metodos de Reprodutor Musical
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Ouvindo a música: " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println("Pausando a música: " + musica);
    }


}
