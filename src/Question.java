//class for the Lab3
public class Question {
    private String questionText;
    private String questAnswer;
    private int difficulty;
    //getter
    public String getQuestionText() {
        return questionText;
    }
    public String getQuestAnswer() {
        return questAnswer;
    }
    public int getDifficulty() {
        return difficulty;
    }
    //setter
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void setQuestAnswer(String questAnswer) {
        this.questAnswer = questAnswer;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    //constructor
    Question(String question, String answer, int diff){
        questionText=question;
        questAnswer=answer;
        difficulty=diff;
    }
}
