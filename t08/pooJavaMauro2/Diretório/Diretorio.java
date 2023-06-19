package t08.pooJavaMauro2.Diretório;
import java.util.List;
public class Diretorio {
    String nomeDiretorio;
    Usuario dono;
    List<Usuario> uPermitidos;

    public Diretorio(String nome, Usuario dono){
        this.nomeDiretorio = nome;
        this.dono = dono;
    }
    public void addUsuario(Usuario u){
        uPermitidos.add(u);
        u.acesso(this.nomeDiretorio);
    }
}
