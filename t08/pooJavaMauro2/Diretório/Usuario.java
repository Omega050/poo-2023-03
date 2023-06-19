package t08.pooJavaMauro2.Diretório;
import java.util.List;
import java.util.ArrayList;
public class Usuario {
    public String name;
    private String email;
    private List<String> diretoriosPossuidos;
    private List<String> possuiAcesso;
    
    public Usuario(String n, String e){
        this.name = n;
        this.email = e;
        this.diretoriosPossuidos = new ArrayList<>(null);
        this.possuiAcesso = new ArrayList<>();
    }
    public String get_u_name(){
        return name;
    }
    public String get_u_email(){
        return email;
    }
        public void acesso(String diretorio) {
        this.possuiAcesso.add(diretorio);
    }

    public List<String> getDiretoriosPossuidos() {
        return diretoriosPossuidos;
    }

    public List<String> getPossuiAcesso() {
        return possuiAcesso;
    }
}