package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        MenuFactory mf = new MenuFactory();
        boolean flag = true;
        Callable action;

        ActivityListFactory alf = new ActivityListFactory();
        ListActivityType lat = new ListActivityType();
        ListActivityVue lav = new ListActivityVue();
        alf.getVue(lav);
        alf.GetModele(lat);

        while (flag) {
            action = mf.getMenu().getAction();
            if (action != null) {
                action.call();
            }
            else
            {
                flag = false;
            }
        }
    }
}
