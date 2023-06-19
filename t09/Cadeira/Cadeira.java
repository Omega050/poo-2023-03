package t09.Cadeira;

public class Cadeira {
    String cor;
    float tam;
    String material;
    public Cadeira(String c, int t, String m){
        this.cor = c;
        this.tam = t;
        this.material = m;
    }
    public String getColor(){
        return cor;
    }
    public float getSize(){
        return tam;
    }
    public String getMat(){
        return material;
    }
}
