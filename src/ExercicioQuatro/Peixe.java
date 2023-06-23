package ExercicioQuatro;

public class Peixe extends Animal{
  private String caracteristicas;
  public Peixe(String nome, Double comprimento, Integer numPatas, String cor, String ambiente,
               Integer velocidade, String caracteristicas) {
    super(nome, comprimento, numPatas, cor, ambiente, velocidade);
    this.caracteristicas = caracteristicas;
  }

  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  public void mostrarPeixe0() {
    System.out.println("Nome: " + getNome());
    System.out.println("Comprimento: " + getComprimento());
    System.out.println("Quantidade de patas: " + getNumPatas());
    System.out.println("Cor: " + getCor());
    System.out.println("Ambiente: " + getAmbiente());
    System.out.println("Velocidade: " + getVelocidade()+"m/s");
    System.out.println("Caracteristicas: " + getCaracteristicas());
  }
}
