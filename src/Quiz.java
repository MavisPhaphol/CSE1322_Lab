//class for Lab3
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<String> textQuestion= new ArrayList<String>();
    ArrayList<String> answerQuestion= new ArrayList<String>();
    ArrayList<Integer> difficultyQuestion=new ArrayList<Integer>();
    Scanner userInput= new Scanner(System.in);
    //methods
    void addQuestion(){
        System.out.println("What is the question Text?");
        String text= userInput.nextLine();
        textQuestion.add(text);
        System.out.println("What is the answer?");
        String answer=userInput.nextLine();
        answerQuestion.add(answer);
        System.out.println("How difficult (1-3)?");
        int difficulty=userInput.nextInt();
        difficultyQuestion.add(difficulty);
    }
    void removeQuestion(){
        System.out.println("Choose a question to remove? ");
        for (int index=0;index<textQuestion.size();index++){
            System.out.println(index+". "+textQuestion.toString());
        }
        int removed = userInput.nextInt();
        textQuestion.remove(removed);
        answerQuestion.remove(removed);
        difficultyQuestion.remove(removed);

    }
    void modifyQuestion(){
        System.out.println("Choose a question to modify?");
        for (int index=0;index<textQuestion.size();index++){
            System.out.println(index+". "+textQuestion.toString());
        }
        int questionChosen= userInput.nextInt();
        System.out.println("What is the question Text?");
        String newQuestion=userInput.nextLine();
        textQuestion.set(questionChosen,newQuestion);
        System.out.println("What is the answer?");
        String newAnswer=userInput.nextLine();
        answerQuestion.set(questionChosen, newAnswer);
        System.out.println("How difficult (1-3)?");
        int newDifficulty=userInput.nextInt();
        difficultyQuestion.set(questionChosen, newDifficulty);
    }
    void giveQuestion(){
        int count=0;
        int total=0;
        for (int index=0;index<textQuestion.size();index++){
            System.out.println(index+". "+textQuestion.get(index).toString());
            String answer=userInput.nextLine();
            if (answer==answerQuestion.get(index)){
                System.out.println("Correct");
                count++;
            }
            else{
                System.out.println("Incorrect");
            }
            total++;
        }
    }
}
