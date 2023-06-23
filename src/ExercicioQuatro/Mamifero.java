package ExercicioQuatro;

public class Mamifero extends Animal{

  private String calimento;

  public Mamifero(String nome, Double comprimento, Integer numPatas, String cor, String ambiente,
                  Integer velocidade, String alimento) {
    super(nome, comprimento, numPatas, cor, ambiente, velocidade);

  }

  public void mostrarMamifer0() {
    System.out.println("Nome: " + getNome());
    System.out.println("Comprimento: " + getComprimento());
    System.out.println("Quantidade de patas: " + getNumPatas());
    System.out.println("Cor: " + getCor());
    System.out.println("Ambiente: " + getAmbiente());
    System.out.println("Velocidade: " + getVelocidade()+"m/s");
    System.out.println("Alimento: " + getAmbiente());
  }

  public String getCalimento() {
    return calimento;
  }

  public void setCalimento(String calimento) {
    this.calimento = calimento;
  }
}
