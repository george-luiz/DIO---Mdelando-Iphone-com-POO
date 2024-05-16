import equipamentos.multifuncional.IphoneMultifuncional;
import equipamentos.musica.Radio;
import equipamentos.navegador.Chrome;
import equipamentos.navegador.Firefox;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.telefone.Iphone_10;

public class Main {
    public static void main(String[] args) {
        NavegadorInternet navegadorInternet = new Chrome();
        navegadorInternet.exibirPagina();

        NavegadorInternet navegadorInternet1 = new Firefox();
        navegadorInternet1.exibirPagina();

        Iphone_10 iphone_10 = new Iphone_10();
        iphone_10.ligar();

        Radio radio = new Radio();
        radio.tocar();

        IphoneMultifuncional iphoneMultifuncional = new IphoneMultifuncional();
        iphoneMultifuncional.ligar();
        iphoneMultifuncional.tocar();
        iphoneMultifuncional.exibirPagina();


    }
}