package PR1;

public class Harmonic {
    public static void main(String[] args) {
        System.out.print("    ");
        for (int i=0; i < 5; i ++){
            System.out.print("1   ");
        }

        System.out.println("");
        System.out.print("1");
        for (int i=0; i < 5; i++){
            System.out.print(" + -");
        }

        System.out.println("-");

        System.out.print("    ");
        for (int i=2; i < 7; i++){
            System.out.print(i + "   ");
        }
    }
}
