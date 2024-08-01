package Policy_Management;
import java.util.*;
public class Policy_main {
    public static void main(String[] args) {
        Policy_management PM=new Policy_management();
        System.out.println("Welcome to Policy Management System");
        do {
            System.out.println("\n1. Add a new Policy\n2. Delete Policy\n3. Update Policy details\n4. List all Policies\n5. Exit");
            System.out.println("Enter Your option:");
            Scanner s = new Scanner(System.in);
            int option = s.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter Policy number: ");
                    int policy_no=s.nextInt();
                    s.nextLine();
                    System.out.println("Enter Policy holder Name: ");
                    String name=s.nextLine();
                    System.out.println("Type of Insurance(Health, Life , Auto)");
                    String type=s.next();
                    System.out.println("Coverage Amount");
                    double amount=s.nextDouble();
                    Policy p=new Policy(policy_no,name,type,amount);
                    PM.addPolicy(p);
                    break;

                case 2:
                    System.out.println("Enter Policy number: ");
                    PM.delete_policy(s.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Policy number: ");
                    PM.Edit_policy(s.nextInt());
                    break;
                case 4:
                    System.out.println("Enter type of Insurance:");
                    PM.display(s.next());
                    break;


                case 5:
                    return;
                default:
                    System.out.println("Invalid Input!");
                    break;

            }
        }while(true);

    }


}


