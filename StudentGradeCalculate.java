import java.util.*;

public class StudentGradeCalculate 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of subjects:");
		int numSubjects = input.nextInt();
		
		int totalMarks = 0;
		int[] marks = new int[numSubjects];
		
		for(int i=0;i<numSubjects;i++)
		{
			System.out.print("Enter marks obtained in subjects"+(i+1)+"(out of 100):");
			marks[i] = input.nextInt();
			totalMarks+=marks[i];
		}
		double averagePercentage=(double)totalMarks/(numSubjects*100)*100;
		String grade;
		if(averagePercentage>=90)
		{
			grade="O";
		}
		else if(averagePercentage>=80)
		{
			grade="A+";
		}
		else if(averagePercentage>=70)
		{
			grade="A";
		}
		else if(averagePercentage>=60)
		{
			grade="B+";
		}
                                 else if(averagePercentage>=50)
		{
			grade="B";
		}
            		else if(averagePercentage>=55)
		{
			grade="C";
		}
                                else if(averagePercentage>=40)
		{
			grade="P";
		}
		else
		{
			grade="F";
		}
		System.out.println("Total Marks:"+totalMarks);
		System.out.println("Average Percentage:"+averagePercentage+"%");
		System.out.println("Grade:"+grade);
		
		input.close();
	}

}
