import java.util.Scanner;
public class Example15 {

    public static void main(String[] args) {
        float mark;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter mark");
        mark = input.nextFloat();

        if (mark < 3) {
            System.out.println("Muy Deficiente");
        } else {
            if (mark < 5) {
                System.out.println("Insuficiente");
            }else {
                if (mark < 6) {
                    System.out.println("Suficiente");
                }else {
                    if (mark < 7) {
                        System.out.println("Bien");
                    }else {
                        if (mark < 9) {
                            System.out.println("Notable");
                        }else {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
    }
}

