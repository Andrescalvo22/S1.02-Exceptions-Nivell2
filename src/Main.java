
public class Main {
    public static void main(String[] args) {

       byte age= Entrada.readByte("Write your age");
       int year= Entrada.readInt("Write your year of birth");
       float month= Entrada.readFloat("Write your month of birth in numbers");
       double salary= Entrada.readDouble("Write your monthly salary only in numbers");
       char letter= Entrada.readChar("Write the last letter of your DNI");
       String name= Entrada.readString("Write your name");
       boolean register= Entrada.readSiNo("Do you want to register with the given data?");

      System.out.println("Number of given data:");
      System.out.println("age: " + age);
      System.out.println("Year of birth: " + year);
      System.out.println("Month of Birth: " + month);
      System.out.println("Monthly salary " + salary);
      System.out.println("Last letter of the Dni: " + letter);
      System.out.println("Name of the user: " + name);
      System.out.println("Continue? " + register );
    }
    }
