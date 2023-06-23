package ExercicioUm;

public abstract class ContaBancaria {
  private String nomeCliente;
  private Integer numConta;
  private Double saldo;

  public ContaBancaria(String nomeCliente, Integer numConta, Double saldo) {
    this.nomeCliente = nomeCliente;
    this.numConta = numConta;
    this.saldo = saldo;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public Integer getNumConta() {
    return numConta;
  }

  public void setNumConta(Integer numConta) {
    this.numConta = numConta;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public void sacar(double valor){
    if(valor > this.saldo){
      System.out.println("Saldo insuficiente!!");
    } else {
      this.saldo = this.saldo - valor;
    }
  }

  public void depositar(double valor){
    this.saldo += valor;
  }
}
