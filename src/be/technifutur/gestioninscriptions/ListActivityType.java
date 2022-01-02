package be.technifutur.gestioninscriptions;

import java.util.*;

public class ListActivityType {
    Map<String, ActivityType> activitytypelist; // = new HashMap<>();
    ActivityType activitytype;
    IOData io;
    MyData dt;

    ListActivityType(){
        if(activitytypelist == null){
            activitytypelist = new HashMap<>();
            io = new IOData();
            dt = io.LoadData();

//            for (ActivityType s : dt.list){
//                System.out.println("Chargement données = " + s.name + "," + s.registration);
//                activitytypelist.put(s.name, s);
//            }
            // Trace 001

            System.out.println("Fin de chargement données");
            System.out.println("Listage des données");
            System.out.println(activitytypelist.size());
            for (Map.Entry<String, ActivityType> e:activitytypelist.entrySet()) {
                System.out.println(e.getValue().name + " " + e.getValue().registration);
            }
        }
    }

    public ActivityType addActivityType(String name, boolean registrationRequired){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            System.out.println(name + " existe déjà !");
//            activitytype = null;
        }
        else
        {
            activitytype = new ActivityType(name, registrationRequired);
            activitytypelist.put(name, activitytype);
            lister();
            io.SaveData(activitytypelist);
        }
        return activitytype;
    }

    public ActivityType get(String name){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            activitytype = activitytypelist.get(name);
        }
        else
        {
            System.out.println(name + " n'existe pas !");
            activitytype = null;
        }
        return activitytype;
    }

    public ActivityType remove(String name){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            activitytype = activitytypelist.remove(name);
        }
        else
        {
            System.out.println(name + " n'existe pas !");
            activitytype = null;
        }
        return activitytype;
    }

    public void lister() {
        ActivityType p;
        for (Map.Entry<String, ActivityType> e:activitytypelist.entrySet()) {
            System.out.println(e.getKey());
            p = e.getValue();
            System.out.println("     " + p.name + " " + p.registration);
        }
    }
}
