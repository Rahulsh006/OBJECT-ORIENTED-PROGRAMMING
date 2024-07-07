package Java;

public class product{
	String pcode;
    String pname;
    double price;
    
    public product(String code, String name, double amt){
    	pcode  = code;
        pname = name;
        price = amt;
    }
    
    public static void main(String[] args){
    
    product p1 = new product("A1", "P1", 550.0);
    product p2 = new product("B1", "P2", 450.0);
    product p3 = new product("C1", "P3", 600.0);
    
    if(p1.price<p2.price){
        if(p1.price < p3.price){
            System.out.println("Product 1 is least Expensive");
        }

        else{
            System.out.println("Product 3 is least Expensive");
        }
    }

    else{
        if(p2.price < p3.price){
            System.out.println("Product 2 is least Expensive");
        }

        else{
            System.out.println("Product 3 is least Expensive");
        }
    }
    }

}
