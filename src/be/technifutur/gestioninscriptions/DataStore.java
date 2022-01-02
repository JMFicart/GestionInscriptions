package be.technifutur.gestioninscriptions;

import java.io.*;
import java.util.ServiceLoader;
import java.util.function.Supplier;

public class DataStore<D extends Serializable> {

        private final Supplier<D> supplier;
        private String file;
        private D data;

        public DataStore(String fileName, Supplier<D> supplier) {
            file = fileName;
            this.supplier = supplier;
        }

        public D getData() {
            if (data == null) {
                try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
                    // Trace 002
                    System.out.println("Lecture fichier");
                    data = (D) input.readObject();
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                    data = supplier.get();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Autre cas");
                    e.printStackTrace();
                }
            }
            return data;
        }

        public void save() {
            if (data != null) {
                try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
                    output.writeObject(data);
                    // Trace 004
                    System.out.println("Ecriture fichier");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("AutrePossibilité");
                }
            }
        }
}


