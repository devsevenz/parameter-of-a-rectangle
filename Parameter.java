import java.util.Scanner;
public class Parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double length;
        double width;
        double parameter;
        boolean Continue = true;
        String choice;

        System.out.println("PARAMETER CALCULATOR ");

        //loop start

        while (Continue) {

            //input

            System.out.print("Enter length: ");
            length = sc.nextDouble();

                if (!sc.hasNextDouble()) {
                    System.out.print("Invalid Input!");
                    sc.next();
                    return;
                }

                sc.nextLine();

            System.out.print("Enter width: ");
            width = sc.nextDouble();
                if (!sc.hasNextDouble()) {
                    System.out.print("Invalid Input!");
                    return;
                }

            //process

            parameter = (length + length) + (width + width);

            //output

            System.out.println("The parameters of the rectangle is: " + parameter);


            //loop end
            System.out.println("Do you wish to continue (y/n): ");
            choice = sc.nextLine().toLowerCase();
            Continue = choice.equals("y") ;
        }

    }
}