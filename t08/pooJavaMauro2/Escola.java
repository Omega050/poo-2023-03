package t08.pooJavaMauro2;

public class Escola {
     String Nome;
     int capAlunos;
     String endereço;
     long CEP;
     
     public Escola(String n, int l, String end, long c){
          this.Nome = n;
          this.capAlunos = l;
          this.endereço = end;
          this.CEP = c;
     }
     public String getNome() {
         return Nome;
     }
     public int getCapAlunos() {
         return capAlunos;
     }
     public String getEndereço() {
         return endereço;
     }
     public long getCEP() {
         return CEP;
     }

}
