package J061;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD {
    ArrayList<Word> list;

    public WordCRUD(){
        list = new ArrayList<Word>();
    }
    void addWord(){
        String english,korean;
        int level;
        Scanner s = new Scanner(System.in);
        System.out.print("English> ");
        english = s.next();
        s.nextLine();
        System.out.print("Korean> ");
        korean = s.nextLine();
        System.out.print("Level (1~3) > ");
        level = s.nextInt();
        Word new_word = new Word(english,korean,level);
        list.add(new_word);
    }
    void editWord(){
        listWord();
        Scanner s = new Scanner(System.in);
        System.out.print("Choose number> ");
        int index = s.nextInt() - 1;
        if(index < 0 || index >= list.size()){
            System.out.println("Wrong number");
            return;
        }
        System.out.print("New English word> ");
        String english = s.nextLine();

        System.out.print("New Korean Word> ");
        String korean = s.nextLine();

        System.out.print("New level (1~3)> ");
        int level = s.nextInt();

        list.set(index, new Word(english, korean, level));
        System.out.println("Fix Word");
    }
    void listWord(){
        for(int i = 0 ; i<list.size();i++){
            System.out.printf("%d - %s\n",i+1,list.get(i).toString());
        }
    }
    void deleteWord(){
        listWord();
        Scanner s = new Scanner(System.in);
        System.out.print("Choose Delete number> ");
        int index = s.nextInt() - 1;

        if(index < 0 || index >= list.size()){
            System.out.println("Wrong number");
            return;
        }
        list.remove(index);
        System.out.println("Delete!");
    }
}
