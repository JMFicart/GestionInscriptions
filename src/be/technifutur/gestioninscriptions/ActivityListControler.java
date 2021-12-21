package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class ActivityListControler implements Callable  {
    ListActivityType lat;
    ListActivityVue lav;
    String name;
    Boolean registration;

    @Override
    public Object call() {
        setname();
        getregistration();
        addnew();
        return null;
    }

    public ActivityListControler(){
//        System.out.println("Initialisation en provenance d'un fichier.");
    }

    public void setVue(ListActivityVue vue){this.lav = vue;}

    public void setModele(ListActivityType type){this.lat = type;}

    public ListActivityType getLat() {return lat;}

    public void setname(){name = lav.getname();}
//
    public void getregistration(){registration = lav.getregistration();}

    public void addnew(){
       lat.addActivityType(name, registration);}
}