package ClaimTrackingSystem;

public class Claim {
    int claim_no;
    int policy_no;
    String claimant_name;
    long amount;
    String status;

    public Claim(int claim_no, int policy_no, String claimant_name, long amount, String status) {
        this.claim_no = claim_no;
        this.policy_no = policy_no;
        this.claimant_name = claimant_name;
        this.amount = amount;
        this.status = status;
    }

    public int getClaim_no() {
        return claim_no;
    }

    public void setClaim_no(int claim_no) {
        this.claim_no = claim_no;
    }

    public int getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(int policy_no) {
        this.policy_no = policy_no;
    }

    public String getClaimant_name() {
        return claimant_name;
    }

    public void setClaimant_name(String claimant_name) {
        this.claimant_name = claimant_name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "Claim No:"+claim_no+"\nPolicyNo:"+policy_no+"\nClaimant's name:"+claimant_name+"\nClaim amount: "+amount;
    }
}
