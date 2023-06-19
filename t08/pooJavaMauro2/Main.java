package t08.pooJavaMauro2;

public class Main {
    public static void main(String[] args) {
        País país = new País();

        país.addCidade("Brasília");
        país.setCapital("Brasília");
        país.addCidade("Goiânia");
        país.addCidade("Rio de Janeiro");

        System.out.println("Capital: " + país.getCapital());
        System.out.println("Cidades:");
        for (String cidade : país.getCidades()) {
            System.out.println(cidade);
        }
    }
}