package be.technifutur.gestioninscriptions;

import java.util.Map;

public class IOData {
    DataStore<MyData> myDataDataStore;
    MyData dt;

    public MyData LoadData(){
        myDataDataStore = new DataStore<>("activity.txt", MyData::new);
        dt= myDataDataStore.readData();
        return dt;
    }

    public void SaveData(){
        myDataDataStore.writeData(dt);
    }
}
