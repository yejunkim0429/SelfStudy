package J063;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Main p = new Main();
        p.run();
    }
    public void run(){
        int menu,quit = 0;
        Scanner s = new Scanner(System.in);
        TodoCRUD manager = new TodoCRUD();
        while(true){
            System.out.println("Menu> 1 Add 2 Edit 3 List 4 Delete 0 Exit");
            menu = s.nextInt();
            switch(menu){
                case 1: manager.addDate(); break;
                case 2: manager.editDate(); break;
                case 3: manager.printDate(); break;
                case 4: manager.deleteDate(); break;
                default: quit = 1;
            }
            if(quit == 1) break;
        }
    }
}

