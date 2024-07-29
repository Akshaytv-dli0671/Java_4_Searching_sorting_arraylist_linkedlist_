package PremiumCalculation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PremiumCalculationMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PremiumCalculation PC=new PremiumCalculation();

        do{
            System.out.println("1. Add Premium\n2. Calculate Premium\n3. Update Premium\n4. Report Generation\n5. Exit ");
            System.out.println("Enter your option:");
            switch(s.nextInt()){
                case 1:
                    System.out.println("Enter type: ");
                    s.nextLine();
                    String premium_type=s.nextLine();
                    System.out.println("Enter risk factor: ");
                    double risk=s.nextDouble();
                    System.out.println("Enter Base Premium: ");
                    double basePremium=s.nextDouble();
                    Premium p=new Premium(premium_type,basePremium,risk);
                    PC.addPremium(p);
                    break;
                case 2:
                    System.out.println("Enter Premium type");
                    s.nextLine();
                    PC.calculatePremium(s.nextLine());
                    break;
                case 3:
                    System.out.println("Enter premium type:");
                    s.nextLine();
                    String type=s.nextLine();
                    PC.update(type);
                    break;
                case 4:
                    PC.generateReport();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid input");
                    break;


            }


        }while (true);
    }
}

class PremiumCalculation{
    ArrayList<Premium> list =new ArrayList<>();
    public void addPremium(Premium premium_details){
        list.add(premium_details);
    }
    public void calculatePremium(String type){
        for (Premium premium : list) {
            if(Objects.equals(premium.getType(), type)){
                double calculatedPremium = premium.getBase_premium() * premium.getRisk_factor();
                System.out.println("Calculated Premium for " + premium.getType() + ": " + calculatedPremium);
            }

        }
    }
    public Premium SearchPremium(String type){
        for(Premium p: list){
            if(Objects.equals(p.getType(), type)){
                return p;
            }
        }
        return null;

    }
    public void update(String type){
        Premium pre=SearchPremium(type);
        if(pre==null){
            System.out.println("Not found!");
        }
        else{
            Scanner s=new Scanner(System.in);
            System.out.println("1.Edit Base_Premium");
            System.out.println("2. Edit RIsk factor");
            System.out.println("Enter your choice: ");
            switch(s.nextInt()){
                case 1:
                    System.out.println("Enter new BasePremium:");
                    pre.setBase_premium(s.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter new Risk factor:");
                    pre.setRisk_factor(s.nextDouble());
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;

            }
        }
    }
    public void generateReport(){
            System.out.println("Premium Report:\n-------------------------------");
            for (Premium premium : list) {
                double calculatedPremium = premium.getBase_premium() * premium.getRisk_factor();
                System.out.println(premium + ", Calculated Premium: " + calculatedPremium);
            }

    }

}
