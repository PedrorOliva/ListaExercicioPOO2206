package ExercicioQuatro;

public abstract class Animal {
  private String nome;
  private Double comprimento;
  private Integer numPatas;
  private String cor;
  private String ambiente;
  private Integer velocidade;

//  public Animal() {
//
//  }

  public Animal(String nome, Double comprimento, Integer numPatas, String cor, String ambiente, Integer velocidade) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.numPatas = 4;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocidade = velocidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getComprimento() {
    return comprimento;
  }

  public void setComprimento(Double comprimento) {
    this.comprimento = comprimento;
  }

  public Integer getNumPatas() {
    return numPatas;
  }

  public void setNumPatas(Integer numPatas) {
    this.numPatas = numPatas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public Integer getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(Integer velocidade) {
    this.velocidade = velocidade;
  }
}
