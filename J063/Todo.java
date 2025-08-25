package J063;

public class Todo {
    String title;
    String story;
    int date;
    String category;

    public Todo(String title,String story,int date,String category){
        this.title = title;
        this.story = story;
        this.date = date;
        this.category = category;
    }
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public String getstory(){
        return story;
    }
    public void setstory(String story){
        this.story = story;
    }
    public int getdate(){
        return date;
    }
    public void setdate(int date){
        this.date = date;
    }
    public String getcategory(){
        return category;
    }
    public void setcategory(String category){
        this.category = category;
    }
    public String toString(){
        return "Title: " + title + " Story: " + story + " Category: " + category + " D_date: " + date;
    }

}
