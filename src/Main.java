import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" enter the marks");
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks>85 &&marks<100) {
            System.out.println(" student has passed with distinction grade");
        }else if(marks>70 &&marks<85){
            System.out.println("Student has passed exam with first grade");

        }else if(marks >55 && marks<70){
            System.out.println("student has passed exam with second grade");

        }else if(marks>40&&marks<55){
            System.out.println("student has passed exam with third grade");

        }else if (marks<40){
            System.out.println("student has failed the exam");

        }else {
            System.out.println("please enter valid marks");
        }
    }
}