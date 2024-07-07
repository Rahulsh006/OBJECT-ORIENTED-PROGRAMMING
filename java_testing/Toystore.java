 interface Toy {
    void play();
    void move();

}


 class Car implements Toy{
    public void play(){

        System.out.println("vroom vromm");
    }
    public void move(){
        System.out.println("fastfast");
    }
}

 class Doll implements Toy{
    public void play(){
        System.out.println("DAnce");
    }

    public void move(){
        System.out.println("slw slow");
}
}

public class Toystore{
    public static void main(String[] args) {
        Toy c1= new Car();
        Toy d1 = new Doll();



        c1.play();
        c1.move();

        d1.play();
        d1.move();

    }
}
