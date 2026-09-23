package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Luca");
        a1.setMatricula(145488);
        a1.setCurso("Ciências da Computação");
        a1.setIdade(24);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(145490);
        b1.setNome("Ana");
        b1.setSexo("F");
        b1.setIdade(23);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}
