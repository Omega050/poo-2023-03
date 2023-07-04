package t12.Grafo;


public class Nó<T> {
        T val;
        Aresta a;  
        public Nó(T val){
            this.val = val;
        }
        public void setVal(T val) {
            this.val = val;
        }
        public T getVal() {
            return val;
        }
}
