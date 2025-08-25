package J063;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoCRUD {
    ArrayList<Todo> todo;

    public TodoCRUD(){
        todo = new ArrayList<Todo>();
    }
    void addDate(){
        String title;
        String story;
        int date;
        String category;

        Scanner s = new Scanner(System.in);

        System.out.print("Title> ");
        title = s.nextLine();
        System.out.print("Story> ");
        story = s.nextLine();
        System.out.print("Category> ");
        category = s.nextLine();
        System.out.print("D_Date> ");
        date = s.nextInt();

        Todo new_todo = new Todo(title, story, date, category);
        todo.add(new_todo);
    }
    void editDate(){
        printDate();
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Choose number> ");
        number = s.nextInt() - 1;

        if(number < 0 || number >= todo.size()){
            System.out.println("Wrong number!");
            return;
        }
        System.out.print("New Title> ");
        String title = s.nextLine();
        System.out.print("New Story> ");
        String story = s.nextLine();
        System.out.print("New Category> ");
        String category = s.nextLine();
        System.out.print("New D_Date> ");
        int date = s.nextInt();

        todo.set(number,new Todo(title, story, date, category));
        System.out.println("Fix Todo!");
    }
    void printDate(){
        for(int i = 0 ; i< todo.size(); i++){
            System.out.println((i+1) + ", " + todo.get(i).toString());
        }
        System.out.println(" ");
    }
    void deleteDate(){
        printDate();
        Scanner s = new Scanner(System.in);
        System.out.print("Choose number> ");
        int number = s.nextInt() - 1;

        if(number < 0 || number >= todo.size()){
            System.out.println("Wrong number!");
            return;
        }

        todo.remove(number);

        System.out.println("Delete!");
    }
}
