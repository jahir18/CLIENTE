import java.util.Scanner;

public class ClienteControlador {
    Scanner teclado = new Scanner(System.in);

    String cliente[];
    int contador;

    public ClienteControlador(int contador) {

        this.contador = contador;

    }

    public void agregarCliente() {
        cliente = new String[contador];

        for (int i = 0; i < contador; i++) {
            System.out.print("cliente " + i);
            cliente[i] = teclado.next();

        }

    }

    public void mostrarCliente() {

        for (int i = 0; i < contador; i++) {
            System.out.print("cliente " + i);
            System.out.print(cliente[i]);

            System.out.println("");
        }
    }

}
