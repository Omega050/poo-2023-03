package t07.pooJavaMauro;
import java.util.TreeSet;
public class Festa {
    private TreeSet<Convidado> convidados;
    public Festa(){
        this.convidados = new TreeSet<Convidado>();
    }
    public void novoConvidado(Convidado c){
        convidados.add(c);
    }
    public Festa(Convidado c){
        convidados.add(c);
    }
}
