package Policy_Management;

public class Policy {
    int policy_no;
    String policy_holder;
    String type;
    double coverage_amt;

    public Policy(int policy_no, String policy_holder, String type, double coverage_amt) {
        this.policy_no = policy_no;
        this.policy_holder = policy_holder;
        this.type = type;
        this.coverage_amt = coverage_amt;
    }

    public int getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(int policy_no) {
        this.policy_no = policy_no;
    }

    public String getPolicy_holder() {
        return policy_holder;
    }

    public void setPolicy_holder(String policy_holder) {
        this.policy_holder = policy_holder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCoverage_amt() {
        return coverage_amt;
    }

    public void setCoverage_amt(double coverage_amt) {
        this.coverage_amt = coverage_amt;
    }

    public String toString(){
        return "\nPolicy no: "+policy_no+"\nPolicy holder Name:"+policy_holder+"\nType of Insurance:"+type+"\nCoverage Amount: "+coverage_amt;
    }

}
