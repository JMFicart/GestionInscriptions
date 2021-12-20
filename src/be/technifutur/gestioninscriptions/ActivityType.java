package be.technifutur.gestioninscriptions;

public class ActivityType {
    String name;
    boolean registration;

    public static void main(String[] args) {
    }

    ActivityType(String name, boolean inscription){
        this.name = name;
        this.registration = inscription;
    }

    public boolean isRegistrationRequired(){
        return  this.registration;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRegistrationRequired(boolean flag){
        this.registration = flag;
    }
}

