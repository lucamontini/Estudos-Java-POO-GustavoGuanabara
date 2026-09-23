package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Luca");
        p2.setNome("Ana");
        p3.setNome("Coral");
        p4.setNome("Leonardo");

        p2.setSexo("F");
        p2.setIdade(24);
        p2.setCurso("Psicologia");

        p3.setSexo("M");
        p3.setIdade(50);
        p3.setSalario(33547.00f);
        p3.setEspecialidade("Programação");

        p4.setSexo("M");
        p4.setIdade(24);
        p4.setSetor("Entregas");

        p3.receberAumento(1548.00f);

        System.out.println(p2.toString());
    }
}
