class Productobj {
    int pcode;
    String pname;
    int price;
Productobj(int pcode,String pname,int price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;
}

// void insert(int c,String n, int p){
//     pcode=c;
//     pname=n;
//     price= p;
// }

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
    Productobj first = new Productobj(001,"classmate",24);
    Productobj second = new Productobj(002,"camlin",30);
    Productobj third = new Productobj(003,"triveni",20);

    lowest(first.price,second.price,third.price);



}

}
