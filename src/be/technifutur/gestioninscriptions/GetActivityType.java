package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class GetActivityType implements Callable {
    ListActivityType lat;
    ListActivityVue lav;
    String name;

    @Override
    public Object call() {
        setname();
        showexisting();
//        System.out.println("getactivitytype 3");
        return null;
    }

    public void setname() {name = lav.getname();}

    public void showexisting() {lat.getActivityType(name);}

    public void setVue(ListActivityVue vue) {this.lav = vue;}

    public void setModele(ListActivityType type) {this.lat = type;}
}
