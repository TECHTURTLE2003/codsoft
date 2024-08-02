package StudentScoreCalculator;
import java.util.*;
public class GradeCalculator {
	public static void gradecalculator(int arr[])
	{
		//calculate the avegare marks
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int result=sum/arr.length;
		// calculation of grade
		if(result>=90 && result<=100)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("O----->outstanding");
		}
		else if(result>=80 && result<=89)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("E----->excellent");
		}
		else if(result>=70 && result<=79)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("A----->very good");
		}
		else if(result>=60 && result<=69)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("B----->Good");
		}
		else if(result>=50 && result<=59)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("C----->Fair");
		}
		else if(result>=40 && result<=49)
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("D----->Below Average");
		}
		else
		{
			System.out.println("Total Marks: "+sum);
			System.out.println("Average percentage :"+result+"%");
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner class
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number of subjects : ");
		//define the number of subjects
		int p=sc.nextInt();
		int arr[]=new int[p];
		//input section
		for(int i=0;i<p;i++)
		{
			System.out.println("please enter the "+(i+1)+" subject marks : ");
			int im=sc.nextInt();
			arr[i]=im;
		}
		gradecalculator(arr);

	}

}
