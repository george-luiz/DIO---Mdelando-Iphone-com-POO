package equipamentos.multifuncional;

import equipamentos.musica.ReprodutorMusical;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.telefone.AparelhoTelefonico;

public class IphoneMultifuncional implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma nova pagina pelo Iphone Multifuncional.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando pelo Iphone Multifuncional.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo Iphone Multifuncional.");
    }
}
