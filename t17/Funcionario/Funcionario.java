package t17.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    private Funcionario gerente;

    public Funcionario(String n, double s, Funcionario g){
        this.nome = n;
        this. salario = s;
        this.gerente = g;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
