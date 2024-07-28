package CustomerInfoManagement;

import javax.naming.directory.SearchControls;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerInfoManagementMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        CustomerInfo CIM=new CustomerInfo();
        System.out.println("Welcome to Customer Information Management");
        do{
            System.out.println("\n1. Add new Customer\n2. Update customer Details\n3. Display polices\n4. Exit");
            System.out.println("Enter your choice:");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter customer id: ");
                    int cust_id=s.nextInt();
                    System.out.println("Enter Name:");
                    s.nextLine();
                    String name=s.nextLine();
                    System.out.println("Enter Address:");
                    String address=s.nextLine();
                    System.out.println("Enter phone no:");
                    String phno=s.next();
                    List<String> policies = new ArrayList<>();
                    System.out.println("Enter number of policies:");
                    int numPolicies = s.nextInt();
                    s.nextLine(); // consume the newline
                    for (int i = 0; i < numPolicies; i++) {
                        System.out.println("Enter policy " + (i + 1) + ":");
                        String policy = s.nextLine();
                        policies.add(policy);
                    }
                    Customer customer=new Customer(cust_id,name,address,phno, policies);
                    CIM.add(customer);
                 break;
                case 2:
                    System.out.println("Enter customer id");
                    CIM.update(s.nextInt());
                    break;
                case 3:
                    System.out.println("Enter customer id");
                    CIM.display(s.nextInt());
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;

            }

        }while(true);
    }
}

class CustomerInfo{
    ArrayList<Customer>list=new ArrayList<>();

    public void add(Customer customer_details){
        list.add(customer_details);
        System.out.println("Customer Added Sucessfully!");
    }
    public Customer searchCustomer(int id){
        for(Customer i:list){
            if(i.getCust_id()==id){
                return i;
            }
        }
        return null;
    }

    public void update(int id){
        Scanner s=new Scanner(System.in);
        Customer customer= searchCustomer(id);
        if(customer==null){
            System.out.println("Customer not found");
        }
        else{
            System.out.println("\n1. Edit Customer id");
            System.out.println("2. Edit Customer name");
            System.out.println("3. Edit Address");
            System.out.println("4. Edit phoneno");
            System.out.println("5. Edit policies");
            System.out.println("Enter your choice");
            int choice =s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter new Customer id:");
                    customer.setCust_id(s.nextInt());
                    break;
                case 2:
                    System.out.println("Enter new name");
                    s.nextLine();
                    customer.setName(s.nextLine());
                    break;
                case 3:
                    System.out.println("Enter new Address");
                    s.nextLine();
                    customer.setAddress(s.nextLine());
                    break;
                case 4:
                    System.out.println("Enter new phoneno");
                    customer.setPhoneno(s.next());
                    break;
                case 5:
                    List<String> policies = new ArrayList<>();
                    System.out.println("Enter number of policies:");
                    int numPolicies = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < numPolicies; i++) {
                        System.out.println("Enter policy " + (i + 1) + ":");
                        String policy = s.nextLine();
                        policies.add(policy);
                    }
                    customer.setPolices(policies);
                    break;
                default:
                    System.out.println("Enter valid input");
                    break;

            }


        }

    }

    public void display(int num){
        Customer customer=searchCustomer(num);
        System.out.println("Customer name: "+customer.getName());
        System.out.println("Polices: "+customer.getPolices());

    }


}
