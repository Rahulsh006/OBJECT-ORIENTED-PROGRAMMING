public class ProductTwo
{
    String pname,pcode;
    float pprice;
    ProductTwo (String xpname,String xpcode,float xpprice)
    {
        pname=xpname; //if using the same variable names for parameters use "this" keyword
        pcode=xpcode;
        pprice=xpprice;
    }

    public static void main(String[] args)
    {
        ProductTwo p1=new ProductTwo("Santoor","Batch100",50);
        ProductTwo p2=new ProductTwo("Lux","Batch101",60);
        ProductTwo p3=new ProductTwo("Fiama","Batch102",40);

        if (p1.pprice<p2.pprice && p1.pprice<p3.pprice)
        {
            System.out.println("Product with Lowest Price is "+p1.pname+"\nPrice : "+p1.pprice);
        }
        else if (p2.pprice<p1.pprice && p2.pprice<p3.pprice)
        {
            System.out.println("Product with Lowest Price is "+p2.pname+"\nPrice : "+p2.pprice);
        }
        else
        {
            System.out.println("Product with Lowest Price is "+p3.pname+"\nPrice : "+p3.pprice);
        }

    }
}