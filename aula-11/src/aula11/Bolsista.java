package aula11;

public class Bolsista extends Aluno {
    // Atributos
    private float bolsa;

    // Métodos
    public void renovarvolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
    }

    // Getters and Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
