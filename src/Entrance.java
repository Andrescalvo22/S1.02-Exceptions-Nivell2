import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte leerByte(String mensaje) {

        while (true) {
            System.out.println(mensaje + " : ");
            try {
                int valor= scanner.nextInt();
                return(byte) valor;
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número Byte válido por favor!");
                scanner.nextLine();
            }
        }
    }

    public static int leerInt(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                int valor= scanner.nextInt();
                scanner.nextLine();
                return(int) valor;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero válido por favor!");
                scanner.nextLine();
            }
        }
    }

    public static float leerFloat(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                float valor= scanner.nextFloat();
                scanner.nextLine();
                return(float) valor;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número decimal válido por favor!");
                scanner.nextLine();
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                double valor= scanner.nextDouble();
                scanner.nextLine();
                return(double) valor;
            } catch (InputMismatchException e){
                System.out.println("Ingresa un número decimal válido por favor!");
                scanner.nextLine();
            }
        }
    }
    public static char leerChar(String mensaje){
        while(true){
            System.out.println(mensaje + ":");
            String input= scanner.nextLine();
                try{
            if(input.length() != 1){
                System.out.println("Error, un char es solo un carácter");
                }else {
                return input.charAt(0);
            }
            }catch(Exception e){
                    System.out.println(e.getMessage());
                scanner.nextLine();
                }
        }
    }
    public static String leerString(String mensaje){
        while(true){
            System.out.println(mensaje + ":");
            String input= scanner.nextLine();
            try{
                if(input.trim().isEmpty()){
                    System.out.println("Error, no has introducido ningún texto!");
                }else{
                    return input;
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            scanner.nextLine();
            }
        }
    }
    public static Boolean leerSiNo(String mensaje){
        while(true){
            System.out.println(mensaje + "(s/n):");
            String input= scanner.nextLine();
            try{
                if(input.equals("s")){
                    return true;
                }else if(input.equals("n")){
                return false;
            }else{
               System.out.println("Error, Introduce o  `s´ o `n´!");
            }

            }catch(Exception e){
               System.out.println(e.getMessage());
            }
        }
    }
}
