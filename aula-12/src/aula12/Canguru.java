package aula12;

public class Canguru extends Mamifero {
    // Métodos de Sobreposição-Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Saltando.");
    }

    // Métodos
    public void usarBolsa() {
        System.out.println("Usando bolsa.");
    }
}
