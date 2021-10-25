import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value : ");
        double input = in.nextDouble();

        if(input > 0){
            if(input < 1){
                System.out.println("Positive Small number");
            }

        }
    }
}
