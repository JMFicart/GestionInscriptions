package be.technifutur.gestioninscriptions;

public class TestSerialization {
    public static void main(String[] args) {
//        DataStore<MyData> myDataDataStore = new DataStore<>("teststring.txt", MyData::new);
//
//        MyData dt= myDataDataStore.getData();
//
//        System.out.println("Données déjà présents");
//        for (String s : dt.list){
//            System.out.println(s);
//        }
//
//        dt.list.add("element "+dt.list.size());
//
//        myDataDataStore.save();
//
//        System.out.println("");
//        System.out.println("Données présentes");
//        for (String s : dt.list){
//            System.out.println(s);
//        }

//        // Ajout de string
//        DataStore<MyData> myDataDataStore = new DataStore<>("teststring.txt", MyData::new);
//        ActivityType d;
//        Integer ds = 0;
//
//        System.out.println("Getdata");
//
//        MyData dt= myDataDataStore.getData();
//
//        ds = dt.list.size();
//        System.out.println("Données déjà présentes : " + ds);
//        for (String s : dt.list){
//            System.out.println(s);
//        }
//
//        System.out.println("");
//        System.out.println("Ajout données " + ds);
//
//        for(Integer i = ds; i < (ds + 10); i++){
////            d = new ActivityType("Test" + dt.list.size(), true);
//            System.out.println(i + " " + "Test" + i);
//            dt.list.add("Test" + i);
//        }
//
//        myDataDataStore.save();
//
//        System.out.println("");
//        System.out.println("Données présentes");
//        for (String s : dt.list){
//            System.out.println(s);
//        }

        // Ajout de ActivityType
        DataStore<MyData> myDataDataStore = new DataStore<>("testdata.txt", MyData::new);
        ActivityType d;
        Integer ds = 0;

        System.out.println("Getdata");

        MyData dt= myDataDataStore.getData();

        ds = dt.list.size();
        System.out.println("Données déjà présentes : " + ds);
        for (ActivityType s : dt.list){
            System.out.println(s.name + " " + s.registration);
        }

        System.out.println("");
        System.out.println("Ajout données " + ds);

        for(Integer i = ds; i < (ds + 10); i++){
            d = new ActivityType("Test" + i, true);
            System.out.println(i + " " + d.name + " " + d.registration);
            dt.list.add(d);
        }

        myDataDataStore.save();

        System.out.println("");
        System.out.println("Données présentes");
        for (ActivityType s : dt.list){
            System.out.println(s.name + " " + s.registration);
        }
    }
}
