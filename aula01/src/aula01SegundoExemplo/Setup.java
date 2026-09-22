package aula01SegundoExemplo;

public class Setup {

    String monitor;
    String mouse;
    String mousepad;
    String cpu;
    String teclado;
    boolean energiacpu;
    boolean energia;

    void status() {
        System.out.println("O monitor é da marca: " + this.monitor);
        System.out.println("O mouse é da marca: " + this.mouse);
        System.out.println("O mousepad é da marca: " + this.mousepad);
        System.out.println("A cpu é da marca: " + this.cpu);
        System.out.println("A cpu se encontra ligada? " + this.energiacpu);
        System.out.println("A energia geral se encontra ligada? " + this.energia);
    }

    void energialigada() {
        this.energia = true;
    }

    void energiadesligada() {
        this.energia = false;
    }

    void energiacpuligada() {
        this.energiacpu = true;
    }

    void energiacpudesligada() {
        this.energiacpu = false;
    }

    void possousar() {
        if (this.energia == true & this.energiacpu == true) {
            System.out.println("Tudo pronto para usar!");
        } else if (this.energia == true & this.energiacpu == false) {
            System.out.println("Energia está ligada, falta ligar a CPU!");
        } else {
            System.out.println("A energia está desligada!");
        }
    }

}
