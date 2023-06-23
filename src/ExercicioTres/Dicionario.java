package ExercicioTres;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario = new HashMap<>();
  public boolean objetoExiste(String objeto) {
    return dicionario.containsKey(objeto);
  }

  public void acidionaCor(String objeto, String cor) {
    dicionario.put(objeto, cor);
  }

  public void imprimiDicionario() {
    for(String objeto : dicionario.keySet()){
      String cor = dicionario.get(objeto);
      System.out.println(objeto + " -> " + cor);
    }
  }

}
