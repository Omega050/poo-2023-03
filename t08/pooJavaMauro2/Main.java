package t08.pooJavaMauro2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        País país = new País();

        país.addCidade("Cidade 1");
        país.setCapital("Cidade 1");
        ArrayList<String> cidades = país.getCidades();
}
}