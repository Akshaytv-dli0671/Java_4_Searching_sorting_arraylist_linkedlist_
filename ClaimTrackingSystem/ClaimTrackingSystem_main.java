package ClaimTrackingSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClaimTrackingSystem_main {
    public static void main(String[] args) {
        Claimtracking CT=new Claimtracking();
        System.out.println("Welcome to Claim Tracking System");
        do{
            System.out.println("\n1. Add new Claims\n2. Update Claim Status\n3. Generate Reports\n4. Exit");
            Scanner s=new Scanner(System.in);
            int option=s.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter Claim no:");
                    int claimno=s.nextInt();
                    System.out.println("Enter policy no:");
                    int policyno=s.nextInt();
                    System.out.println("Enter claimant's name:");
                    s.nextLine();
                    String name=s.nextLine();
                    System.out.println("Enter Claim amount:");
                    long amt=s.nextLong();
                    System.out.println("Enter claim status: ");
                    String status=s.next();
                    Claim claim=new Claim(claimno,policyno,name,amt,status);
                    CT.add(claim);
                    break;
                case 2:
                    System.out.println("Enter claim no");
                    CT.Edit(s.nextInt());
                    break;
                case 3:
                    System.out.println("Report Generating...\nPlease wait...\n");
                    CT.generate();

                case 4:return;
                default:
                    System.out.println("Invalid input!");
                    break;

            }

        }while(true);

    }
}

class Claimtracking{

    ArrayList<Claim>list=new ArrayList<>();
    public void add(Claim claim){
        list.add(claim);
        System.out.println("Claim added successfully!");
    }

    public Claim search(int id){
        for(Claim i: list){
            if(i.getClaim_no()==id){
                return i;
            }
        }
        return null;
    }

    public void Edit(int num){
        Claim claim=search(num);
        if(claim==null){
            System.out.println("Claim_no not found!");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter status");
            claim.setStatus(sc.next());
        }
    }

    public void generate(){
        System.out.println("\nPending\n----------------------");
        for(Claim i: list){
            if(i.getStatus().equalsIgnoreCase("Pending")){
                System.out.println(i);
            }
        }
        System.out.println("\nApproved\n----------------------");
        for(Claim i: list){
            if(i.getStatus().equalsIgnoreCase("Approved")){
                System.out.println(i);
            }
        }
        System.out.println("\nRejected\n----------------------");
        for(Claim i: list){
            if(i.getStatus().equalsIgnoreCase("Rejected")){
                System.out.println(i);
            }
        }
    }


}
