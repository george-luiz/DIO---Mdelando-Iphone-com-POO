package equipamentos.navegador;

public class Chrome implements NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma pagina pelo navegador de internet Chrome.");
    }
}
