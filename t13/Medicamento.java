package t13;

import java.util.ArrayList;
import java.util.List;
public class Medicamento{
    public String nome;
    public String principioAtivo;
    public String descricao;
    private int quantidade;
    public List<Medicamento> similares;

    public Medicamento(String n, String p, String d, int qtde)
    {
        this.nome = n;
        this.principioAtivo = p;
        this.descricao = d;
        this.quantidade = qtde;
        this.similares = new ArrayList<Medicamento>();
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
    public void addEstoque(int qtde){
        this.quantidade += qtde;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void addSimilares(Medicamento m){
        similares.add(m);
    }

}