package ExercicioQuatro;

public class Main {
  public static void main(String[] args) {
    Mamifero camelo = new Mamifero("Camelo", 3.45, 4, "Marron-escuro",
        "Deserto", 18, "Vegetais");

    Peixe tubarao = new Peixe("Tubarão", 4.9, 0, "Cinza", "Mar",
        15, "Barriga branca e costas cinza");

    Mamifero ursoCanada = new Mamifero("Urso do Canada", 1.60, 4, "marron",
        "Florestas", 28, "Frutas e pequenos animais");

    Mamifero leao = new Mamifero("Leão", 2.10, 4, "Marrom",
        "Savana", 22, "Carne");

    Mamifero micoLeao = new Mamifero("Mico-Leão-Dourado", 0.24, 4,
        "vemelho-dourado", "Floresta", 0, "Frutas");

    camelo.mostrarMamifer0();
    System.out.println();
    tubarao.mostrarPeixe0();
    System.out.println();
    ursoCanada.mostrarMamifer0();
    System.out.println();
    leao.mostrarMamifer0();
    System.out.println();
    micoLeao.mostrarMamifer0();
  }
}
