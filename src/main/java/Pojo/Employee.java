package Pojo;

public class Employee {

    int ID;
    String Name;
    String Address;
    public Employee(int ID, String Name, String Address){
        this.ID = ID;
        this.Name = Name;
        this.Address =  Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
