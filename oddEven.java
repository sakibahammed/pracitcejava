import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Enter an integer : ");
        a = input.nextInt();
        switch(a%2){
            case 0:
            {
                System.out.printf("%d is an integer\n",a);
                break;
            }

            case 1: 
            {
                System.out.printf("%d is an odd number\n",a);
                break;
            }
            default:{
                System.out.println("Not an integer");
            }
        }

    }
}
