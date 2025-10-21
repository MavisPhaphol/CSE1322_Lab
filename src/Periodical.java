public class Periodical extends Item{
    private int issueNum;
    //getter
    public int getIssueNum() {
        return issueNum;
    }
    //setter
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    //constructor
    public void newPeriodical(){}
    //overloaded constructor
    public void newPeriodical(int number, String title){
        setIssueNum(number);
        setTitle(title);
    }
    public String getListing(){
        return "Periodical Title - "+getTitle()+"\nIssue # - "+getIssueNum();
    }
}
