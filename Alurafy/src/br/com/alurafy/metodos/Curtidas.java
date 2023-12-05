package br.com.alurafy.metodos;

public class Curtidas {
    private int totalDeCurtidas = 0;

    public void totalCurtidas(int i) {
        totalDeCurtidas++;
        System.out.println("O total de curtidas é " + totalDeCurtidas);
    }

    public void clicarCurtir() {
        // Simula o clique em curtir
        System.out.println("Curtiu!");
        totalCurtidas(1); // Incrementa o contador de curtidas
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }
}
