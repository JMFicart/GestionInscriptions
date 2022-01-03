package be.technifutur.gestioninscriptions;

import java.io.Serializable;

public class ActivityType implements Serializable {
    String name;
    boolean registration;

    public ActivityType(String name, boolean inscription){
        this.name = name;
        this.registration = inscription;

//        System.out.println("ActivityType = " + name + ", " + inscription);
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

