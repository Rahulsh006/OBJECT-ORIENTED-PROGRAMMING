class product {
    String pcode, pname;
    double price;
    public void readdata(String pc, String pn, double pr)
    {
        pcode = pc;
        pname = pn;
        price = pr;
    }
}

class Test{
    public static void main(String[] args){
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        p1.readdata("A1", "P1", 550.0);
        p2.readdata("B1", "P2", 450.0);
        p3.readdata("C1", "P3", 600.0);     
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
