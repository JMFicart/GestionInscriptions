package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class RemoveActivityType implements Callable  {
    ListActivityType lat;
    ListActivityVue lav;
    String name;

    @Override
    public Object call() {
        setname();
        remove();
        return null;
    }

    public void setname() {name = lav.getname();}

    public void remove() {lat.removeActivityType(name);}

    public void setVue(ListActivityVue vue) {this.lav = vue;}

    public void setModele(ListActivityType type) {this.lat = type;}
}
