package droid;

public class Droid {
    int batteryLevel;
    String name;
    
    public Droid(String droidName) {
        batteryLevel = 100;
        name = droidName;
    }
    public String toString(){
        return "Hello, im " + name;
    }
    public void taskState(String task){
        System.out.println(name + " is doing " + task);
    }
    public void batteryLevelLosing(){
        batteryLevel -= 10;
    }
    public void energyInfo(){
        System.out.println(batteryLevel);
    }
    
    public static void main(String[] args) {
        Droid Carlos = new Droid("Carlos");
        System.out.println(Carlos.toString());
        Carlos.taskState("mop");
        Carlos.batteryLevelLosing();
        Carlos.energyInfo();
    }
    
}
