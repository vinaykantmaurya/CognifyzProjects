import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of grades to be entered:");
        int gradesNumber = sc.nextInt();
        System.out.println("enter the grades:");
        int i = 0;
        int sum =0;
        int [] grades = new int[gradesNumber];
        while(i<gradesNumber){
           grades[i] = sc.nextInt();
           i++;
        }
        for(int j=0; j<grades.length; j++){
            sum = sum + grades[j];
        }
        double avg = (double) sum / gradesNumber;

        System.out.println("The average grades of entered grade:" + avg);
    }
}
