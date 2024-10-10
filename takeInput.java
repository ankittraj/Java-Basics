import java.util.*;
public class takeInput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // for integer input

        //System.out.println("Enter the number: ");
        //int num = sc.nextInt();

        //for(int i = 0; i <= num; i++){
        //    System.out.println(i);
        //}
       

        // for string input
        //System.out.println("Enter Your Name");
        //String name = sc.nextLine();
        //System.out.println(name);

        //sc.close();


        // for int and string both input

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Dear "+ name + " Here is your counting number");

        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }

        sc.close();

    }
}
