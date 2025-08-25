package J061;

public class Word {
    String english;
    String korean;
    int level;

    public Word(String english,String korean,int level){
        this.english = english;
        this.korean = korean;
        this.level = level;
    }
    public String getEnglish(){
        return english;
    }
    public void setEnglish(String english){
        this.english = english;
    }
    public String getKorean(){
        return korean;
    }
    public void setKorean(String korean){
        this.korean = korean;
    }
    public int getlevel(){
        return level;
    }
    public void setlevel(int level){
        this.level = level;
    }
    public String toString(){
        return String.format("[Level %d] %s - %s",level,english,korean);
    }
}
