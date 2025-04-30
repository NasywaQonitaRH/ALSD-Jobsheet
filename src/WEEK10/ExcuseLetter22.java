package WEEK10;

public class ExcuseLetter22 {
    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;
    
    public ExcuseLetter22() {
    }
    
    public ExcuseLetter22(String id, String name, String className, char type, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = type;
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nClass: " + className + 
               "\nType: " + (typeOfExcuse == 'S' ? "Sick" : "Other") + 
               "\nDuration: " + duration + " days";
    }
}