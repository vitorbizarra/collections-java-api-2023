package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numberList;

    public SomaNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numberList.add(numero);
    }

    public Integer calcularSoma() {
        Integer total = 0;

        for (Integer number : this.numberList) {
            total += number;
        }

        return total;
    }

    public Integer encontrarMaiorNumero() throws Exception {
        Integer greaterNumber = Integer.MIN_VALUE;

        if (this.numberList.isEmpty()) {
            throw new Exception("A lista está vazia");
        }

        for (Integer number : this.numberList) {
            if (number > greaterNumber) {
                greaterNumber = number;
            }
        }

        return greaterNumber;
    }

    public Integer encontrarMenorNumero() throws Exception {
        Integer lowestNumber = Integer.MAX_VALUE;

        if (this.numberList.isEmpty()) {
            throw new Exception("A lista está vazia");
        }

        for (Integer number : this.numberList) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }

        return lowestNumber;
    }

    public void exibirNumeros() {
        System.out.println(this.numberList);
    }

    public static void main(String[] args) throws Exception {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
