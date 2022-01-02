package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class ActivityListFactory implements Callable  {
    ListActivityType lat; //= new ListActivityType();
    ListActivityVue lav; //= new ListActivityVue();
    String name;
    Boolean registration;

    @Override
    public Object call() {
        getname();
        getregistration();
        addnew();
        return null;
    }

    public ActivityListFactory(){
        lat = new ListActivityType();
        lav = new ListActivityVue();
    }

    public void getVue(ListActivityVue vue){
        this.lav = vue;
    }

    public void GetModele(ListActivityType type){
        this.lat = type;
    }

    public ListActivityType getLat() {
        return lat;
    }

    public void getname(){
        name = lav.getname();
    }

    public void getregistration(){
        registration = lav.getregistration();
    }

    public void addnew(){
        lat.addActivityType(name, registration);
    }
}
