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
        model.addNode(getItemActivityList());
//        model.addNode(getItemExY2());
//        model.addNode(getItemExY3());
//        model.addNode(getItemExY4());
//        model.addNode(getItemQuitter());
        return model;
    }

    public Item getItemActivityList() {
        return createItem("Hello World", new ActivityTypeCreation());
    }

//    public Item getItemExY1() {
//        return createItem("5 numbers in an array", new ExY1());
//    }
//
//    public Item getItemExY2() {
//        return createItem("Test de la présence d'une chaîne", new ExY2());
//    }
//
//    public Item getItemExY3() {
//        return createItem("Deviner un nombre", new ExY3());
//    }
//
//    public Item getItemExY4() {
//        return createItem("Diagonales d'un carré", new ExY4());
//    }
//
    private Item getItemQuitter() {
        return createItem("Quitter", null );
    }
}

