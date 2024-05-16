package equipamentos.musica;

public class Radio implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando uma musica pelo radio.");
    }
}
