package J062;

public class Book{
    String title;
    String author;
    String category;
    int price;
    int year;
    public Book(String title,String author,String category,int price,int year){
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.year = year;
    }
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public String getauthor(){
        return author;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getcategory(){
        return category;
    }
    public void setcategory(String category){
        this.category = category;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
    public int getyear(){
        return year;
    }
    public void setyear(int year){
        this.year = year;
    }
    public String toString(){
        return "title: " + title + " author: " + author + " category: " + category + " price: " + price + " year: " + year;
    }
}