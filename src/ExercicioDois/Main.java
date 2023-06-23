package ExercicioDois;

public class Main {
  public static void main(String[] args) {
    ContaPoupanca conta1 = new ContaPoupanca(12345, 2200.00);
    System.out.println("Conta 1");
    System.out.println("Saldo: R$" + conta1.getSaldo());
    System.out.println("Tributos a pagar: R$" + conta1.tributacao());

    ContaCorrente conta2 = new ContaCorrente(67890, 3500.00);
    System.out.println("\nConta 2");
    System.out.println("Saldo: R$" + conta2.getSaldo());
    System.out.println("Tributos a pagar: R$" + conta2.tributacao());

    SeguroVida novoSeguro = new SeguroVida();
    System.out.println("\nSeguro de vida");
    System.out.println("Tributos a pagar: R$" + novoSeguro.tributacao());
  }
}
