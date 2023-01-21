import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        gui();
    }

    public static void gui(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Crear un triangulo \n2. Crear un rectangulo \nEscoge una opcion: ");
        String opcion = scanner.nextLine();
        while(true){
            if(opcion.equals("1") || opcion.equals("2")){
                break;
            }
            else{
                System.out.println("Has introducido un numero incorrecto porfavor intentelo de nuevo: ");
                opcion = scanner.nextLine();
            }
        }
        if(opcion.equals("1")){
            Triangulo miTriangulo = new Triangulo("miTringulo", "rojo", 8, 8, 8, 6.93);
            miTriangulo.dimeCaracteristicas(miTriangulo);
            scanner.close();
        }
        else if(opcion.equals("2")){
            try {
                System.out.println("Elija un color: ");
                String color = scanner.nextLine();
                System.out.println("Elija la medida del lado izquierdo: ");
                double ladoIzquierdo = scanner.nextDouble();
                System.out.println("Elija las medidas del lado alto: ");
                double ladoAlto = scanner.nextDouble();
                System.out.println("Elija las medidas del lado derecho: ");
                double ladoDerecho = scanner.nextDouble();
                System.out.println("Elija las medidas del lado bajo: ");
                double ladoBajo = scanner.nextDouble();
                Rectangulo miRectangulo = new Rectangulo("miRectangulo", color, ladoIzquierdo, ladoAlto, ladoDerecho, ladoBajo);
                scanner.close();
                System.out.println("Perimetro: " + miRectangulo.getPerimetro() + "\nArea: " + miRectangulo.getArea());
                if(miRectangulo.comprobarCuadrado(miRectangulo) == true){
                    System.out.println("Es un cuadrado");
                }
                else{
                    System.out.println("Es un rectangulo");
                }
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un numero. \nPorfavor introduzca un numero");
                gui();
            }
            
        }
    }
    
}