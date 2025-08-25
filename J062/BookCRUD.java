package J062;

import java.util.Scanner;
import java.util.ArrayList;

public class BookCRUD{
    ArrayList<Book> book;

    public BookCRUD(){
        book = new ArrayList<Book>();
    }

    void addBook(){
        String title;
        String author;
        String category;
        int price;
        int year;

        Scanner s = new Scanner(System.in);

        System.out.print("Title> ");
        title = s.nextLine();
        System.out.print("Author> ");
        author = s.nextLine();
        System.out.print("Category> ");
        category = s.nextLine();
        System.out.print("Price> ");
        price = s.nextInt();
        System.out.print("Year> ");
        year = s.nextInt();

        Book new_book = new Book(title, author, category, price, year);
        book.add(new_book);
    }
    void editBook(){
        listBook();

        Scanner s = new Scanner(System.in);

        System.out.print("Choose number> ");
        int number = s.nextInt() - 1;
        s.nextLine();

        if(number < 0 || number >= book.size()){
            System.out.println("Wrong number!");
            return;
        }

        System.out.print("New Title> ");
        String title = s.nextLine();
        System.out.print("New Author> ");
        String author = s.nextLine();
        System.out.print("New Category> ");
        String category = s.nextLine();
        System.out.print("New Price> ");
        int price = s.nextInt();
        System.out.print("New Year> ");
        int year = s.nextInt();

        book.set(number,new Book(title, author, category, price, year));
        System.out.println("Fix Book");
    }
    void listBook(){
        for(int i = 0 ; i<book.size(); i++){
           System.out.println((i+1) + ". " + book.get(i).toString());
        }
        System.out.println(" ");
    }
    void deleteBook(){
        listBook();

        Scanner s = new Scanner(System.in);
        System.out.print("Choose Delete number> ");

        int number = s.nextInt() - 1;
        if(number < 0 || number >= book.size()){
            System.out.println("Wrong number!");
            return;
        }

        book.remove(number);
        System.out.println("Delete!");
    }
}