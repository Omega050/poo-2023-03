package t13;

public class Medicamento{
    public String nome;
    public String principioAtivo;
    public String descricao;

    public Medicamento(String n, String p, String d)
    {
        this.nome = n;
        this.principioAtivo = p;
        this.descricao = d;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getPrincipioAtivo() {
        return principioAtivo;
    }

}