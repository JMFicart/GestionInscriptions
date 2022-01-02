package be.technifutur.gestioninscriptions;

import java.util.Map;

public class IOData {
    DataStore<MyData> myDataDataStore = new DataStore<>("test.txt", MyData::new);
    MyData dt;

    public MyData LoadData(){
        return dt= myDataDataStore.getData();
    }

    public void SaveData(Map<String, ActivityType> dico){
        ActivityType p;

        dt = new MyData();
        //  Trace 003
        for (Map.Entry<String, ActivityType> e:dico.entrySet()) {
            p = e.getValue();
//            System.out.println("Données à sauver = " + e.getKey() + " " + p.registration + " " + p.name);
//            dt.list.add(p);
//            System.out.println("SaveData = " + dt.list.size());
        }

//        for (ActivityType d : dt.list) {
//            System.out.println("SaveData = " + d.name + " " + d.registration);
//        }

        myDataDataStore.save();
    }
}
