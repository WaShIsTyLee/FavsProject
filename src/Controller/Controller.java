package Controller;

import Interface.IController;
import Model.Entity.Favs;
import Model.Repo.Library;
import View.GUI;

public class Controller implements IController {

    GUI gui = new GUI();
    Library libray = new Library();

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void end() {

    }

    @Override
    public void controllerAddFavMenu() {
        libray.addFav(gui.showAddFavMenu(gui.showFavMenu()));

    }

    @Override
    public void controllerDeleteFavMenu() {

    }
}
