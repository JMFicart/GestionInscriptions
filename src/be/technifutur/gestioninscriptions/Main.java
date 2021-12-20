package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        MenuFactory mf = new MenuFactory();
        boolean flag = true;
        Callable action;

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
