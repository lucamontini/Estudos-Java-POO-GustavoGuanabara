package aula12;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;

    // Métodos de Sobreposição-Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegatais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil.");
    }

    // Getter and Setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
