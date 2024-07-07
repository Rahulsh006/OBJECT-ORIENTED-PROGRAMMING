class Product {
    int pcode;
    String pname;
    int price;

void insert(int c,String n, int p){
    pcode=c;
    pname=n;
    price= p;
}

static void lowest(int p1, int p2, int p3){
    if (p1<p2 && p1<p3 ){
        System.out.println(p1 +" has the lowest price ");
    }
    if (p2<p1 && p2<p3 ){
        System.out.println(p2 +" has the lowest price ");
    }
    else{
        System.out.println(p3 +" has the lowest price ");
    }
}
public static void main(String[] args) {
    Product first = new Product();
    Product second = new Product();
    Product third = new Product();

    first.insert(001,"classmate",24);
    second.insert(002,"camlin",30);
    third.insert(003,"triveni",20);


    lowest(first.price,second.price,third.price);



}

}
