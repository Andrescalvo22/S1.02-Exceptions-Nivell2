import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String mensaje) {

        while (true) {
            System.out.println(mensaje + " : ");
            try {
                int valor= scanner.nextInt();
                return(byte) valor;
            } catch (InputMismatchException e) {
                System.out.println("Please add a Byte number!");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                int valor= scanner.nextInt();
                scanner.nextLine();
                return(int) valor;
            } catch (InputMismatchException e) {
                System.out.println("Please add a real number!");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                float valor= scanner.nextFloat();
                scanner.nextLine();
                return(float) valor;
            } catch (InputMismatchException e) {
                System.out.println("Please add a valid decimal number!");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String mensaje) {
        while (true) {
            System.out.println(mensaje + ":");
            try {
                double valor= scanner.nextDouble();
                scanner.nextLine();
                return(double) valor;
            } catch (InputMismatchException e){
                System.out.println("Please add a valid decimal number!");
                scanner.nextLine();
            }
        }
    }
    public static char readChar(String mensaje){
        while(true){
            System.out.println(mensaje + ":");
            String input= scanner.nextLine();
                try{
            if(input.length() != 1){
                System.out.println("Please add only one char");
                }else {
                return input.charAt(0);
            }
            }catch(Exception e){
                    System.out.println(e.getMessage());
                scanner.nextLine();
                }
        }
    }
    public static String readString(String mensaje){
        while(true){
            System.out.println(mensaje + ":");
            String input= scanner.nextLine();
            try{
                if(input.trim().isEmpty()){
                    System.out.println("Error, text expected!");
                }else{
                    return input;
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            scanner.nextLine();
            }
        }
    }
    public static Boolean readSiNo(String mensaje){
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
