package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

import be.technifutur.gestioninscriptions.ActivityTypeCreation;
//import be.technifutur.menu.actions.ExY3;
//import be.technifutur.menu.actions.ExY4;

public class MenuFactory {
    ActivityListControler alc;
    ListActivityType lat;
    ListActivityVue lav;
    IOData io;

    MenuFactory(){
        if (alc == null){
            alc = new ActivityListControler();
            lat = new ListActivityType();
            lav = new ListActivityVue();
            io = new IOData();

            alc.setVue(lav);
            alc.setModele(lat);
            alc.setIO(io);
        }
    }

    private Item createItem(String itemname, Callable itemaction) {
        Item wItem;

        wItem = new Item();
        wItem.setName(itemname);
        wItem.setAction(itemaction);
        return wItem;
    }

    public MenuControler getMenu() {
        return CreateMenu(getModelPrincipal());
    }

    private MenuControler CreateMenu(MenuModel model) {
        MenuControler menu = new MenuControler();
        menu.setVue(new MenuVue());
        menu.setModel(model);
        return menu;
    }

    private MenuModel getModelPrincipal(){
        MenuModel model = new MenuModel("Menu principal");
//        model.addNode(getItemHelloWorld());
        MenuNode sousmenu = CreateMenu(getModelActivity());
        model.addNode(sousmenu);
        model.addNode(getItemQuitter());
        return model;
    }

    private MenuModel getModelActivity(){
        MenuModel model1 = new MenuModel("Menu Activity");
        model1.addNode(addItemActivityList());
        model1.addNode(getItemActivityList());
        model1.addNode(removeItemActivityList());
        model1.addNode(getItemQuitter());
        return model1;
    }

    public Item addItemActivityList() {
        return createItem("Ajouter type d'activité", alc);
    }

    public Item getItemActivityList() {
        return createItem("Chercher type d'activité", alc);
    }

    public Item removeItemActivityList() {
        return createItem("Supprimer type d'activité", alc);
    }

    private Item getItemQuitter() {
        return createItem("Quitter", null );
    }
}
