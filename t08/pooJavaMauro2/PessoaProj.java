package t08.pooJavaMauro2;
import java.util.List;
import java.util.ArrayList;
public class PessoaProj {
    public String nome;
    private List<PessoaProj> integrantes;

    public ProjPessoa(String nome){
        this.nome = nome;
        this.integrantes = new ArrayList<>();
    }
    public void adicionarPessoa(PessoaProj pessoa) {
        integrantes.add(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public List<PessoaProj> getPessoas() {
        return integrantes;
    }
}

