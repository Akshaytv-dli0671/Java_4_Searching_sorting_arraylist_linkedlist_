package Policy_Management;
import java.util.*;

public class Policy_management {
    ArrayList<Policy> list=new ArrayList<>();

    public void addPolicy(Policy policy){
        list.add(policy);
        System.out.println("Policy added Successfully!");
    }

    public Policy searchPolicy(int policy_no){
        for (Policy i : list) {
            if (i.getPolicy_no() == policy_no) {
                return i;
            }
        }
        return null;
    }
    public ArrayList<Policy> searchPolicy_type(String policy_type){
        ArrayList<Policy>P=new ArrayList<>();
        for(Policy i:list){
            if (i.getType().equalsIgnoreCase(policy_type)) {
                P.add(i);
            }
        }
        return P;
    }

    public void delete_policy(int policyno){
        Policy policy=searchPolicy(policyno);
        if(policy==null){
            System.out.println("Policy not found!");
            return;
        }
        else{
            list.remove(policy);
            System.out.println("Policy removed successfully!");
        }

    }
    public void Edit_policy(int policyno){
        Policy policy=searchPolicy(policyno);
        if(policy==null){
            System.out.println("Policy not found!");
            return;
        }
        else{
            System.out.println("\n1. Edit Policy number: ");
            System.out.println("2. Edit policy holder:");
            System.out.println("3. Edit Type of insurance:");
            System.out.println("4. Edit Coverage Amount");
            System.out.print("Enter a choice: ");
            Scanner s=new Scanner(System.in);
            int choice =s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter new Policy number");
                    policy.setPolicy_no(s.nextInt());
                    break;
                case 2:
                    System.out.println("Enter new Policy holder name: ");
                    s.nextLine();
                    policy.setPolicy_holder(s.nextLine());
                    break;
                case 3:
                    System.out.println("Enter new Type of insurance:");
                    policy.setType(s.next());
                    break;
                case 4:
                    System.out.println("Enter new Coverage Amount:");
                    policy.setCoverage_amt(s.nextDouble());
                    break;
            }
        }

    }

    public void display(String type){
        ArrayList<Policy> arraylist=searchPolicy_type(type);
        if(arraylist.isEmpty()){
            System.out.println("No policies on this type.");

        }else{
            for (Policy policy : arraylist) {
                System.out.println(policy);
            }
            System.out.println("\n");
        }
    }
}
