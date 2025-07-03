
public class Main {
    public static void main(String[] args) {

       byte age= Entrance.readByte("Write your age");
       int year= Entrance.readInt("Write your year of birth");
       float month= Entrance.readFloat("Write your month of birth in numbers");
       double salary= Entrance.readDouble("Write your monthly salary only in numbers");
       char letter= Entrance.readChar("Write the last letter of your DNI");
       String name= Entrance.readString("Write your name");
       boolean register= Entrance.readYesNo("Do you want to register with the given data?");

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
