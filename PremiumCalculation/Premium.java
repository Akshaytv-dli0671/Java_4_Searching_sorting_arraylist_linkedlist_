package PremiumCalculation;

public class Premium {
    String type;
    double base_premium;
    double risk_factor;

    public Premium(String type, double base_premium, double risk_factor) {
        this.type = type;
        this.base_premium = base_premium;
        this.risk_factor = risk_factor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBase_premium() {
        return base_premium;
    }

    public void setBase_premium(double base_premium) {
        this.base_premium = base_premium;
    }

    public double getRisk_factor() {
        return risk_factor;
    }

    public void setRisk_factor(double risk_factor) {
        this.risk_factor = risk_factor;
    }

    @Override
    public String toString() {
        return "Premium{" +
                "type='" + type + '\'' +
                ", base_premium=" + base_premium +
                ", risk_factor=" + risk_factor +
                '}';
    }
}
