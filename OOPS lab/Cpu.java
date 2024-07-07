public class cpu {
    double price;
    public cpu(double p){
        price = p;
    }

    class processor{
        int core;
        String manuf;

        public processor(int c, String man){
            core = c;
            manuf = man;
        }
    }

    static class ram{
        int memory;
        String mnfr;

        public ram(int mem, String mnf){
            memory = mem;
            mnfr = mnf;
        }        
    }
}


class Main {

    public static void main(String[] args){
        cpu dell = new cpu(345789.13);
        cpu.processor intel = dell.new processor(4, "Intel");
        cpu.ram crucial = new cpu.ram(8 , "Crucial");
        System.out.println("Price:  " + dell.price);
        System.out.println("Processor Manufacturer: " + intel.manuf);
        System.out.println("No. of cores:   " + intel.core);
        System.out.println("RAM Manufacturer:   " + crucial.mnfr);
        System.out.println("Memory: " + crucial.memory); 

    }
}
