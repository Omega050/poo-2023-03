package t07.pooJavaMauro;  
public class SomaNaturais {
    public static long somarNaturais(int n){
        int c = 1;
        long s = 0; 
        while(c<=n){
            s = s+c;
            c++;
        }
        return s;
    }
}
