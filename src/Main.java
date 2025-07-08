
public class Main {
    public static void main(String[] args) {

       byte age= Entrance.readByte("Introduce your age");
       int year= Entrance.readInt("Introduce your year of birth");
       float month= Entrance.readFloat("Introduce your month of birth only with numbers");
       double salary= Entrance.readDouble("Introduce your monthly salary only in numeric format");
       char letter= Entrance.readChar("Introduce the last letter of your DNI");
       String name= Entrance.readString("Introduce your name");
       boolean register= Entrance.readYesNo("Do you want to register with the given data?");

      System.out.println("Number of data introduced:");
      System.out.println("Age: " + age);
      System.out.println("Year of birth: " + year);
      System.out.println("Month of birth: " + month);
      System.out.println("Monthly salary " + salary);
      System.out.println("Last letter of the DNI: " + letter);
      System.out.println("Username: " + name);
      System.out.println("¿Continue? " + register );
    }
    }
