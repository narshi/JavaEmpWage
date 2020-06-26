import java.io.*;
import java.util.Random;
import java.util.ArrayList;
class EmpWage{
	static int coun = 0;
	public static void main(String Args[]){
	EmpWage emp =new EmpWage();
	attendence(coun);
	System.out.println("Welcome to Employee Wages computation program ");
	}

public static void attendence(int count){
        ArrayList<Integer> present = new ArrayList<Integer>();
        ArrayList<Integer> absent = new ArrayList<Integer>();
	int upperbound = 2;
	Random rand = new Random();
	int int_random = rand.nextInt(upperbound);
	double double_random=rand.nextFloat();
	if(int_random==1){
		present.add(int_random);
		count++;
	}else{
		absent.add(int_random);
		count++;
	}
	System.out.println("Total employees = "+count);
	System.out.println("No. of people present = "+present.size());
	System.out.println("No. of people absent = "+absent.size());
	
}
}

