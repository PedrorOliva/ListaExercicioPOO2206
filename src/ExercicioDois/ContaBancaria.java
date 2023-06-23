package ExercicioDois;

public abstract class ContaBancaria {
  private Integer conta;
  private Double saldo;

  public ContaBancaria(Integer conta, Double saldo) {
    this.conta = conta;
    this.saldo = saldo;
  }

  public Integer getConta() {
    return conta;
  }

  public void setConta(Integer conta) {
    this.conta = conta;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public abstract void verSaldo();
}
