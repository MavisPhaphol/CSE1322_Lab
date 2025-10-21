public abstract class Item {
    private String title;
    //get title
    public String getTitle() {
        return title;
    }
    //set title
    public void setTitle(String title) {
        this.title = title;
    }
    //Constructor title
    public void emptyTitle(){
        title="";
    }
    public void newTitle(String newStoryTitle){
        title=newStoryTitle;
    }
    //method
    public abstract String getListing();
    //Override toString()
    @Override
    public String toString(){
        return getTitle();
    }
}
