package t11.Preço;

public class Preço {
    public String moeda;
    public double valor;

    public Preço(String m, double v){
        this.moeda = m;
        this.valor = v;
    }
    public String getMoeda() {
        return moeda;
    }
    public double getValor() {
        return valor;
    }
}
