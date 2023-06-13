package classpart;

public class Order {

    Long OrderNum;
    String OrderID;
    String OrderDate;
    String UserName;
    String ProductName;
    String address;

    public String toString() {

        return "OrderNum : " + OrderNum + "\nOrderID : " + OrderID + "\nOrderDate : " + OrderDate + "\nUserName : " + UserName + "\nProductName : " + ProductName + " \nAddress : " + address;

    }


}
