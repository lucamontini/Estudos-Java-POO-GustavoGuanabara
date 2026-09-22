package ultraemojicombat;

import java.util.concurrent.ThreadLocalRandom;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            System.out.println("Luta inválida.");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiado().status();
            System.out.println("  ");
            this.getDesafiante().apresentar();
            this.getDesafiante().status();

            int numaleatorio = ThreadLocalRandom.current().nextInt(0, 3);
            switch (numaleatorio) {
                case 0:
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(getDesafiado().getNome() + " Ganhou");
                    this.getDesafiado().ganharLutar();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(getDesafiante().getNome() + " Ganhou");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLutar();
                    break;
            }

        } else {
            System.out.println("A luta não foi aprovada.");
        }
    }

    // Getters and Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
