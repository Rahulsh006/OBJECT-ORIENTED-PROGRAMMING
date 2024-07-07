public class Main {
//   public static void main(String[] args) {
//     int i =0;
//    String[] fruits = {"apple","mango","orange","pineapple","grape"};
//     if (fruits.length>i){
//    for(i=0;i<fruits.length;i++){
//     System.out.print(fruits[i]+"  ");
//    }
//   }   
//   else {
//     System.out.println("no elements");
//   } 
//   }

public void fullspeed(){
    System.out.println("the car is going very fast");
}
public void fullthrottle(int x){
    System.out.println("the car is moving at a speed of "+ x );

}

public static void main(String[] args) {
    Main ferrari = new Main();
    ferrari.fullspeed();
    ferrari.fullthrottle(280);


    Main benz =new Main();
    Main porsche =new Main();

    porsche.fullspeed();
    porsche.fullthrottle(390);

    benz.fullspeed();
    benz.fullthrottle(220);
            
    }
}

