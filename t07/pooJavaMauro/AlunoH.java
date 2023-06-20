package t07.pooJavaMauro;
public class AlunoH extends Aluno{
    int id;

    public AlunoH(Curso c, int id){
        super(c);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}


