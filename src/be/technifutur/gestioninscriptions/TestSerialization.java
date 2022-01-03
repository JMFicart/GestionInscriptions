package be.technifutur.gestioninscriptions;

public class TestSerialization {
    public static void main(String[] args) {
        DataStore<MyData> myDataDataStore = new DataStore<>("teststruct.txt", MyData::new);
        Integer n;
        ActivityType o;

        MyData dt= myDataDataStore.readData();

//        for (String s : dt.list){
//            System.out.println("Après lecture = " + s);
//        }
//
//        n = dt.list.size();
//        for(Integer i = n; i < n + 10; i++){
//            dt.list.add("element "+i);
//        }
//
//        myDataDataStore.save();

//        for (String s : dt.list){
//            System.out.println(s);
//        }

//        for (ActivityType s : dt.listactivity){
//            System.out.println("Après lecture = " + s.name + " " + s.registration);
//        }

//        n = dt.listactivity.size();
//        for(Integer i = n; i < n + 10; i++){
//            o = new ActivityType("element" + i,true);
//            dt.listactivity.add(o);
//        }

        for (ActivityType s : dt.listactivity){
            System.out.print(s.name);
            if (s.name.equals("element1")) {
                System.out.println(" trouvé !");
                break;
            }
            else
            {
                System.out.println("");
            }
        }

//        myDataDataStore.save();
    }
}
