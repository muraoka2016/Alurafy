import br.com.alurafy.metodos.Reproducao;
import br.com.alurafy.modelos.Musica;
import br.com.alurafy.metodos.Curtidas;

public class Principal {
    public static void main(String[] args) {
        Musica nirvanaNevermind1 = new Musica();
        nirvanaNevermind1.setArtista("Nirvana");
        nirvanaNevermind1.setAlbum("Nevermind");
        nirvanaNevermind1.setDuracao(4.20);
        nirvanaNevermind1.setTitulo("Smells like teen spirit");

        nirvanaNevermind1.avalia(8);
        nirvanaNevermind1.avalia(10);
        nirvanaNevermind1.avalia(9);

        System.out.println(nirvanaNevermind1.getTotalDeAvaliacoes());
        System.out.println(nirvanaNevermind1.getSomaDasAvaliacoes());
        System.out.println(nirvanaNevermind1.mediaNota());
        System.out.println(nirvanaNevermind1.classificacao(nirvanaNevermind1.mediaNota()));

        Curtidas nirvanaNevermind2 = new Curtidas();
        nirvanaNevermind2.clicarCurtir();
        nirvanaNevermind2.clicarCurtir();
        nirvanaNevermind2.clicarCurtir();
        nirvanaNevermind2.clicarCurtir();

        nirvanaNevermind2.getTotalDeCurtidas();

        Reproducao nirvanaNevermind3 = new Reproducao();
        nirvanaNevermind3.botaoReproduzir();
        nirvanaNevermind3.botaoReproduzir();
        nirvanaNevermind3.botaoReproduzir();

        nirvanaNevermind3.getContaReproducoes();
    }
}
