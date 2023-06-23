package ExercicioDois;

public class ContaPoupanca extends ContaBancaria implements Tributos{

  public ContaPoupanca(Integer conta, Double saldo) {
    super(conta, saldo);
  }

  @Override
  public void verSaldo() {
    System.out.println("Saldo atual: " + getSaldo());
  }

  @Override
  public double tributacao() {
    return 0;
  }
}
