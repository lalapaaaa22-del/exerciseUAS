import java.util.Scanner;

public class yourscore  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] nameData = new String [3];
        int[] gradesData = new int [3];

        boolean availableData = false;
        boolean next = true;

        do {
        
        System.out.println("       MENU       "  );
        System.out.println("1.Student Data Input ");
        System.out.println("2.Display Student Data ");
        System.out.println("3.Graduation Recap");
        System.out.println("4.Exit The Program" );
        System.out.print("Enter Your Choice ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {

            case 1:
            for (int i = 0; i < nameData.length; i++) {
            System.out.print(" Enter Student Name Number-" + (i + 1) + ": ");
            nameData[i] = scanner.nextLine();

            System.out.print("Enter Student Grades :");
            gradesData[i] = scanner.nextInt();
            scanner.nextLine();

            }
            availableData = true;
            break;

            case 2:
            if (!availableData) {
            System.out.println("Data Not Available Yet");            
            } else {
                for (int i = 0; i < nameData.length; i++) {
            System.out.println((i + 1) + "." + nameData[i]+ ": " + gradesData[i]);
                }
            }
            break;

            case 3 :
            if (!availableData) {
            System.out.println("The data is empty, please input your data first");
            } else {
            int graduationRate = 0;
            int failureRate = 0;

            for (int i = 0; i < nameData.length; i++) {
                if (gradesData [i] >= 60) {
                    graduationRate++;
                } else {
                    failureRate++;
                }
            }

            System.out.println("Graduated Students : " + graduationRate);
            System.out.println("Failed Students :" + failureRate);
            }
            break;

            case 4: 
            next = false;
            break;

            default:
            System.out.println("Invalid Option");
            break;
        }

        System.out.println("Do you want to restart the program?");
        System.out.println("1. YES");
        System.out.println("2.NO");
        int nextOption = scanner.nextInt();

        if ( nextOption != 1){
            next = false;
        }
    } while (next);

        scanner.close();

System.out.println("May God make this major as easy as choosing between a boyfriend or money");
            }
        }
