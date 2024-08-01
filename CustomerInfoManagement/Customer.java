package CustomerInfoManagement;

import java.util.List;

public class Customer {
    int cust_id;
    String name;
    String address;
    String phoneno;
    List<String> polices;

    public Customer(int cust_id, String name, String address, String phoneno, List<String> polices) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.polices = polices;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public List<String> getPolices() {
        return polices;
    }

    public void setPolices(List<String> polices) {
        this.polices = polices;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", polices=" + polices +
                '}';
    }
}
