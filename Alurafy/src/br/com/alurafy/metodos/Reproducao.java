package br.com.alurafy.metodos;

public class Reproducao {
    private int contaReproducoes = 0;

    public void reproduzir(int reproducao) {
        contaReproducoes++;
        System.out.println("O número de vezes que o título foi reproduzido foi: " + contaReproducoes);
    }

    public void botaoReproduzir() {
        reproduzir(1);
    }

    public double getContaReproducoes() {
        return contaReproducoes;
    }

    public void setContaReproducoes(int contaReproducoes) {
        this.contaReproducoes = contaReproducoes;
    }
}
