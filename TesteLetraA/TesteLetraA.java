package TesteLetraA;

public class TesteLetraA {

    public static int tamanhoA(String valor) {
        int contador = 0;
        for (char caracter : valor.toCharArray()) {
            if (Character.toLowerCase(caracter) == 'a') {
                contador++;
            }
        }
        return contador;
    }

    public static boolean temA(String valor) {
        return valor.toLowerCase().contains("a");
    }
}
