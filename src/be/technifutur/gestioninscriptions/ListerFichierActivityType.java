package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class ListerFichierActivityType implements Callable{
    ListActivityType lat;
    ListActivityVue lav;

    @Override
    public Object call() {
        lister();
        return null;
    }

    public void lister() {
        for (ActivityType p : lat.dt.listactivity) {
            System.out.println(p.name + " " + p.registration);
        }
    }

    public void setVue(ListActivityVue vue) {this.lav = vue;}

    public void setModele(ListActivityType type) {this.lat = type;}

}
