public class ProductOne
{
    String pname,pcode;
    float pprice;
    public void readdata(String pn,String pc,float pp)
    {
        pname=pn;
        pcode=pc;
        pprice=pp;
    }
    public static void main(String[] args)
    {
        ProductOne p1=new ProductOne();
        ProductOne p2=new ProductOne();
        ProductOne p3=new ProductOne();
        p1.readdata ("Santoor","Batch100",500);
        p2.readdata ("Lux","Batch101",600);
        p3.readdata ("Fiama","Batch102",40);

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
