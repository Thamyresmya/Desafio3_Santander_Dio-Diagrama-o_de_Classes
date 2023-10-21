public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("<-----Menu-------->");
        System.out.println("Aparelho Telefonico");
        System.out.println("Navegador internet");
        System.out.println("Reprodutor Musical");
        System.out.println("<----------------->");

        System.out.println("<----------------->");
        System.out.println("Aparelho Telefonico");
        iphone.atender();
        iphone.iniciarCorreioVoz(123456789);
        iphone.ligar(987654321);

        System.out.println("<----------------->");
        System.out.println("Navegador internet");
        iphone.exibirPagina("www.pagina1.com.br");
        iphone.atualizarPagina("www.pagina1.com.br");
        iphone.adicionarNovaAba();

        System.out.println("<----------------->");
        System.out.println("Reprodutor Musical");
        iphone.selecionarMusica("Frei Gilson - Teus Planos");
        iphone.tocar("Teus Planos");
        iphone.pausar("Teus Planos");
        System.out.println("<----------------->");

    }

}
