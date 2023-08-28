package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numbersList;

    public OrdenacaoNumeros(){
        this.numbersList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numbersList.add(numero);
    }

    public List<Integer> ordenarAscendente() throws Exception {
        if (numbersList.isEmpty()) {
            throw new Exception("A lista está vazia.");
        }

        List<Integer> numbersAsc = new ArrayList<>(this.numbersList);
        Collections.sort(numbersAsc);
        return numbersAsc;
    }

    public List<Integer> ordenarDescendente() throws Exception {
        if (numbersList.isEmpty()) {
            throw new Exception("A lista está vazia.");
        }

        List<Integer> numbersDesc = new ArrayList<>(this.numbersList);
        numbersDesc.sort(Collections.reverseOrder());
        return numbersDesc;
    }

    public void exibirNumeros() {
        if (!numbersList.isEmpty()) {
          System.out.println(this.numbersList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      public static void main(String[] args) throws Exception {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }
}
