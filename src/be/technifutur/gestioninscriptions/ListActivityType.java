package be.technifutur.gestioninscriptions;

public class ListActivityType {
//    map
    ActivityType activitytype;
    public static void main(String[] args) {
    }

    public ActivityType addActivityType(String name, boolean registrationRequired){
        activitytype = new  ActivityType(name, registrationRequired);
        return activitytype;
    }

    public ActivityType getName(String name){
        return activitytype;
    }

    public ActivityType removeName(String name){
        return activitytype;
    }
}
