package be.technifutur.gestioninscriptions;

import java.util.concurrent.Callable;

import be.technifutur.gestioninscriptions.ActivityTypeCreation;
//import be.technifutur.menu.actions.ExY3;
//import be.technifutur.menu.actions.ExY4;

public class MenuFactory {
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
        MenuModel model = new MenuModel("Menu Activity");
        model.addNode(addItemActivityList());
        model.addNode(getItemActivityList());
        model.addNode(removeItemActivityList());
        model.addNode(getItemQuitter());
        return model;
    }

    public Item addItemActivityList() {
        return createItem("Ajouter type d'activité", new ActivityListFactory());
    }

    public Item getItemActivityList() {
        return createItem("Chercher type d'activité", new ActivityListFactory());
    }

    public Item removeItemActivityList() {
        return createItem("Supprimer type d'activité", new ActivityListFactory());
    }

    private Item getItemQuitter() {
        return createItem("Quitter", null );
    }
}

