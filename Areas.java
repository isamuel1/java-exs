import java.util.Scanner;
public class Areas{
    public static void main(String[] args){
        Scanner ed = new Scanner(System.in);

        System.out.println("Calculador de areas: \n1.-Cuadrado\n2.-Circulo");
         
        int op = ed.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el lado del circulo: ");
                double l = ed.nextDouble();
                System.out.println("El área es: "+AreaCuadrado.computearea(l));
                break;
            case 2:
                System.out.println("Ingrese el radio: ");
                double r = ed.nextDouble();
                System.out.println("El área es: "+AreaCirculo.computearea(r));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        ed.close();
    }
}
