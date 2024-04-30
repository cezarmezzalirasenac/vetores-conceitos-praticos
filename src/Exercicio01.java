import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

  /**
   * 1. Elaborar um programa que efetue a leitura
   * de dez nomes de pessoas em um vetor A do
   * tipo texto e apresentá-los em seguida;
   */

  public static void main(String[] args) {

    String[] nomes = new String[10];
    Scanner scanner = new Scanner(System.in);
    // alimentar a nossa lista, ou array ou vetor
    for (int i = 0; i < nomes.length; i++) {
      System.out.println("Informe um nome: ");
      nomes[i] = scanner.nextLine();
    }

    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }

    scanner.close();
  }
}