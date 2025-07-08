import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message + ":");
            try {
                int value = scanner.nextInt();
                return (byte) value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid byte number!");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message + ":");
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer number!");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message + ":");
            try {
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid decimal number (float)!");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message + ":");
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid decimal number (double)!");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message + ":");
            String input = scanner.nextLine();
            try {
                if (input.length() != 1) {
                    System.out.println("Error, a char must be exactly one character.");
                } else {
                    return input.charAt(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message + ":");
            String input = scanner.nextLine();
            try {
                if (input.trim().isEmpty()) {
                    System.out.println("Error, you didn't enter any text!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static Boolean readYesNo(String message) {
        while (true) {
            System.out.println(message + " (y/n):");
            String input = scanner.nextLine();
            try {
                if (input.equalsIgnoreCase("y")) {
                    return true;
                } else if (input.equalsIgnoreCase("n")) {
                    return false;
                } else {
                    System.out.println("Error, please enter either `y` or `n`!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
