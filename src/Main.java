
public class Main {
    public static void main(String[] args) {

       byte Edad= Entrada.leerByte("Introduce tu edad");
       int Año= Entrada.leerInt("Introduce tu año de nacimiento");
       float Mes= Entrada.leerFloat("Introduce tu mes de nacimiento en formato numérico");
       double Salario= Entrada.leerDouble("Introduce tu salario mensual solo con números");
       char Letra= Entrada.leerChar("Introduce la última letra de tu DNI");
       String Nombre= Entrada.leerString("Introduce tu nombre");
       boolean Registro= Entrada.leerSiNo("¿Quieres realizar el registro con los datos dados?");

      System.out.println("Número de datos Introducidos:");
      System.out.println("Edad: " + Edad);
      System.out.println("Año de Nacimiento: " + Año);
      System.out.println("Mes de nacimiento: " + Mes);
      System.out.println("Salario mensual " + Salario);
      System.out.println("Última letra del DNI: " + Letra);
      System.out.println("Nombre del usuario: " + Nombre);
      System.out.println("¿Continua? " + Registro );
    }
    }
