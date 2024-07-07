import java.util.Scanner;


class CPU{
    int price;
    CPU(int p){
        this.price= p;
    }

    class Processor{
        int noc;
        String manuf;
        Processor(int noc, String manuf){
            this.noc= noc;
            this.manuf= manuf;
        }
    }
     static class RAM{
        int memory;
        String manuf;
        RAM(int mem, String manuf){
            this.memory=mem;
            this.manuf=manuf;
        }
     }

}
public class Computer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cpu price: ");
        int pri= sc.nextInt();
        CPU obj= new CPU(pri);

        System.out.println("enter the processor cores:  ");
        int cor= sc.nextInt();
        System.out.println("enter the processor manufacturer: ");
        String manu= sc.next();
        CPU.Processor pro = obj.new Processor(cor,manu);

        System.out.println("enter the RAM memory:  ");
        int mem= sc.nextInt();
        System.out.println("enter the RAM manufacturer :  ");
        String manuf= sc.next();
        CPU.RAM ram = new CPU.RAM(mem,manuf);

        System.out.println("CPU details are:");
        System.out.println("PRICE: "+ obj.price);
        System.out.println("CPU  cores: "+ pro.noc);
        System.out.println("CPU processor manufacture: "+ pro.manuf);
        System.out.println("CPU RAM mamory: "+ ram.memory);
        System.out.println("CPU RAM manufacturer: "+ram.manuf);
        sc.close();

        



    }
}
