import java.util.*;
class CPU{
	double price;
	CPU(double price){
		this.price=price;
	}

	class processor{
		int number_of_cores;
		String manufacturer;
		processor(int n,String m){
			number_of_cores=n;
			manufacturer=m;
		}
	}
	static class RAM{
		int memory;
		String manufacturer;
		RAM(int memory,String manufacturer){
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
	}
}

public class program5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter CPU Price : ");
		CPU cpu=new CPU(input.nextDouble());
		System.out.print("Enter No of Cores & CPU Manufacturer : ");
		CPU.processor p = cpu.new processor(input.nextInt(),input.next());
		System.out.print("Enter RAM size & Manufacturer : ");
		CPU.RAM ram =new CPU.RAM(input.nextInt(),input.next());
		System.out.println("CPU DETAILS:");
		System.out.println("Price : "+cpu.price);
		System.out.println("CPU Cores : "+p.number_of_cores);
		System.out.println("CPU Manufacturer : "+p.manufacturer);
		System.out.println("RAM Size : "+ram.memory);
		System.out.println("RAM Manufacturer : "+ram.manufacturer);
		
	}
}
		
