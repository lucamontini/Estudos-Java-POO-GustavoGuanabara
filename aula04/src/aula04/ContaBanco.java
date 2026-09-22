package aula04;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // Getters and Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos
    public void estadoAtual() {
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50.00f);
        } else if (tipo == "CP") {
            this.setSaldo(150.00f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta está em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float saldo) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Deposito realizado.");
        } else {
            System.out.println("Conta fechada, erro.");
        }
    }

    public void sacar(float saldo) {
        if (this.isStatus()) {
            if (this.getSaldo() > saldo) {
                this.setSaldo(this.getSaldo() - saldo);
                System.out.println("Saque realizado.");
            }
        } else {
            System.out.println("Conta não está aberta.");
        }
    }

    public void pagarMensal() {
        float valor = 0f;
        if (this.getTipo() == "CC") {
            valor = 12f;
        } else if (this.getTipo() == "CP") {
            valor = 20f;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não aberta.");
        }
    }
}
