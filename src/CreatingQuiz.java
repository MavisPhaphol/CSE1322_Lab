//use Question and Quiz class
import java.util.Scanner;
public class Lab3 {
    public static void main(String[]args){
        Scanner userInput=new Scanner(System.in);
        Quiz quiz= new Quiz();
        int choice=0;
        while(choice!=5){
            System.out.println("What would you like to do?");
            System.out.println("1. Add a question\n2. Remove a question from the quiz\n3. Modify a question in the quiz\n4. Take the quiz\n5. Quit");
            choice=userInput.nextInt();
            if (choice==1){
                quiz.addQuestion();
            }
            else if (choice==2){
                quiz.removeQuestion();
            }
            else if (choice==3){
                quiz.modifyQuestion();
            }
            else if(choice==4){
                quiz.giveQuestion();
            }
        }
    }
}
