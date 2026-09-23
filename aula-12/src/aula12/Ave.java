package aula12;

public class Ave extends Animal {
    // Atributos
    private String corPena;

    // Método
    public void fazerNinho() {
        System.out.println("Construindo Ninho.");
    }

    // Métodos de Sobreposição-Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.");
    }

    // Getter and Setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
