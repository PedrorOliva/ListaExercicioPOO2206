package ExercicioUm;

public class ContaPoupanca extends ContaBancaria{

  private Integer diaRendimento;
  public ContaPoupanca(String nomeCliente, Integer numConta, Double saldo, Integer diaRendimento) {
    super(nomeCliente, numConta, saldo);
    this.diaRendimento = diaRendimento;
  }

  public int getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(double taxaRendimento){
      double novoSaldo = taxaRendimento * getSaldo();
      setSaldo(novoSaldo);
    System.out.println("Saldo atual: " + getSaldo());
  }

  @Override
  public String toString() {
    return "ContaPoupanca{" +
        "diaRendimento=" + diaRendimento +
        '}';
  }
}
