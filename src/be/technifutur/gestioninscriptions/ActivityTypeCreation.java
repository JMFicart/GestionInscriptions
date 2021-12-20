package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

public class ActivityTypeCreation implements Callable {
        @Override
        public Object call() {
            System.out.println("Activity type creation");
            return null;
        }
}
