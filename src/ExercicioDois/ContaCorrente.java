package ExercicioDois;

public class ContaCorrente extends ContaBancaria implements Tributos{
  public ContaCorrente(Integer conta, Double saldo) {
    super(conta, saldo);
  }

  @Override
  public void verSaldo() {
    System.out.println("Saldo atual: " + getSaldo());
  }

  @Override
  public double tributacao() {
    return getSaldo() * 0.01;
  }
}
