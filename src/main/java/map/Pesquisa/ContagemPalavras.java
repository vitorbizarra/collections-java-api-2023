package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> words;

  public ContagemPalavras() {
    this.words = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    this.words.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    this.words.remove(palavra);
  }

  public Map<String, Integer> exibirContagemPalavras() {
    return this.words;
  }

  public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
    Map.Entry<String, Integer> frequentWord = Map.entry("", Integer.MIN_VALUE);

    for (Map.Entry<String, Integer> el : this.words.entrySet()) {
      if (el.getValue() > frequentWord.getValue()) {
        frequentWord = el;
      }
    }

    return frequentWord;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();
    contagemPalavras.adicionarPalavra("Palavra 1", 2);
    contagemPalavras.adicionarPalavra("Palavra 2", 8);
    contagemPalavras.adicionarPalavra("Palavra 3", 1);
    contagemPalavras.adicionarPalavra("Palavra 4", 6);
    System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + "palavras.");
    System.out.println("A palavra mais frequente é: " +
        contagemPalavras.encontrarPalavraMaisFrequente());
  }
}
