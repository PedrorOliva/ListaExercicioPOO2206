package ExercicioUm;

public class Teste {
  public static void main(String[] args) {
    ContaPoupanca conta1 = new ContaPoupanca("Cliente Teste", 12345, 100.00,
        2);

    // Saque
    System.out.println("Saldo atual: R$" + conta1.getSaldo());
    conta1.sacar(50.00);
    System.out.println("Saldo após o saque: R$" + conta1.getSaldo());

    // Deposito
    System.out.println("Saldo atual: R$" + conta1.getSaldo());
    conta1.depositar(100.00);
    System.out.println("Saldo após depósito: R$" + conta1.getSaldo());

    // Rendimento
    conta1.calcularNovoSaldo(5);

    // Dados da conta
    System.out.println("Nome: " + conta1.getNomeCliente());
    System.out.println("Nº conta: " +conta1.getNumConta());
  }
}
