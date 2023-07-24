import java.util.Scanner;

interface Billcalc{
    double totalprice(int no_of_items,double unit_price);
}

class Bill implements Billcalc{
    private int P_ID;
    private String P_Name;
    private int no_of_items;
    private double unit_price;

    public Bill(int P_ID,String P_Name,int no_of_items,double unit_price){
        this.P_ID=P_ID;
        this.P_Name=P_Name;
        this.no_of_items=no_of_items;
        this.unit_price=unit_price;
    }
    public double totalprice(int no_of_items,double unit_price){
        return (no_of_items*unit_price);
    }
    public int getPID(){
        return P_ID;
    }
    public String getPName(){
        return P_Name;
    }
    public int getPCount(){
        return no_of_items;
    }
    public double getPPrice(){
        return unit_price;
    }

}

public class InterfaceBillCalc{
public static void main(String[] args) {
    Scanner S1 = new Scanner(System.in);
    System.out.println("\nBill Calculator");
    System.out.println("---------------");
    System.out.print("Enter Date : ");
    String date = S1.next();
    System.out.print("Enter No of Products : ");
    int n = S1.nextInt();
    Bill[] newbills = new Bill[n];
    for(int i=0;i<n;i++){
        System.out.println("\nEnter Details of Product "+(i+1));
        System.out.println("---------------------------");
        System.out.print("Enter Product ID : ");
        int P_ID=S1.nextInt();
        System.out.print("Enter Product Name : ");
        String P_Name=S1.next();
        System.out.print("Enter No of Products : ");
        int no_of_items=S1.nextInt();
        System.out.print("Enter Product Unit Price : ");
        Double uniit_price=S1.nextDouble();
        newbills[i] = new Bill(P_ID,P_Name,no_of_items,uniit_price);
    }
    System.out.println("\n------------------------------Generated Bill------------------------------");
    System.out.println("Date : "+date);
    System.out.println("Bill No : "+Math.random());
    System.out.println("Product ID\tProduct Name\tNo of Units\tUnit Price\tTotal");
    for(Bill newbill: newbills){
        System.out.print(newbill.getPID()+"\t\t");
        System.out.print(newbill.getPName()+"\t\t");
        System.out.print(newbill.getPCount()+"\t\t");
        System.out.print(newbill.getPPrice()+"\t\t");
        System.out.println(newbill.totalprice(newbill.getPCount(), newbill.getPPrice()));
    }
    double subtotal=0;
    for(Bill newbill: newbills){
        subtotal=subtotal+(newbill.totalprice(newbill.getPCount(), newbill.getPPrice()));
    }
    System.out.println("\t\t\t\t\t\tTotal : \t"+subtotal);
    S1.close();
}
}