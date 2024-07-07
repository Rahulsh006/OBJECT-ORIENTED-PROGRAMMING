interface Animal{
    void eat();
    void move();
    void place();
}

class cat implements Animal{
    public void eat(){
    System.out.println("nonveg");
    } 
    public void move (){
    System.out.println("med fast");
    }

    public void place (){
     System.out.println("india");

    }
}


 class elephant implements Animal{
    public void eat(){
    System.out.println("veg");
    } 
    public void move (){
    System.out.println("slow ");
    }

    public void place (){
     System.out.println("africa");

    }

 }
class Wild {
    public static void main(String[] args) {
        Animal c1= new cat();


        // c1.move();
        // c1.place();
        // c1.eat();


     Animal e1 = new elephant();

     e1.eat();
     c1.place();
     e1.move();
    }
}