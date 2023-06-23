package ExercicioUm;

public class ContaEspecial extends ContaBancaria{
  private Double limite;
  public ContaEspecial(String nomeCliente, Integer numConta, Double saldo, Double limite) {
    super(nomeCliente, numConta, saldo);
    this.limite = limite;
  }

  public Double getLimite() {
    return limite;
  }

  public void setLimite(Double limite) {
    this.limite = limite;
  }

  @Override
  public void sacar(double valor) {
    if(valor > this.limite || valor > getSaldo()){
      System.out.println("Saldo insuficiente!!");
    }
  }
}
