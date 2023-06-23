package ExercicioTres;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    Dicionario dicionario = new Dicionario();

    System.out.println("Objeto: ");
    String objeto = inputUsuario.next();

    if(dicionario.objetoExiste(objeto)){
      System.out.println("O objeto já foi adicionado");
    } else {
      System.out.println("Cor: ");
      String cor = inputUsuario.next();
      dicionario.acidionaCor(objeto, cor);
    }

    dicionario.imprimiDicionario();
  }
}
