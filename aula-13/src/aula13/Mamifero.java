package aula13;

public class Mamifero extends Animal {
    protected String corPelo;

    // Método de Polimorfismo - Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }
}
