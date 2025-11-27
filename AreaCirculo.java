import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = ed.nextDouble();
        System.out.println("El area es:"+Areas.computearea(0,radio));
        ed.close();
    }
}