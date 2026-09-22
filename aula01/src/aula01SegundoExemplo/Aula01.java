package aula01SegundoExemplo;

public class Aula01 {
    public static void main(String[] args) {
        Setup meupc = new Setup();

        meupc.cpu = "Dell";
        meupc.monitor = "Dell";
        meupc.mouse = "Dell";
        meupc.mousepad = "Dell";
        meupc.teclado = "Dell";
        meupc.energiacpudesligada();
        meupc.energialigada();
        meupc.possousar();
        meupc.status();

    }
}
