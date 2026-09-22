package aula04;

public class Aula04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Luca");
        p1.abrirConta("CC");
        p1.depositar(100f);
        p1.sacar(149f);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1111);
        p2.setDono("Júlio");
        p2.abrirConta("CP");
        p2.depositar(500f);
        p2.sacar(100f);
        p2.estadoAtual();
    }
}
