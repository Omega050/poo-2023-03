package t07.pooJavaMauro;
public class Prova implements Ident {
    private byte nQuest;
    public byte get_nQuest(){
        return nQuest;
    }
    public void set_nQuest(byte n){
        if(n>0)
        nQuest = n;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
