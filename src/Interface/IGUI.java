package Interface;

import Model.Entity.Favs;

public interface IGUI {
    void printStart();
    void showMainMenu();
    void showFavMenu();
    Favs showAddFavMenu();
    void showDeleteFavMenu();
    void showUpdateFavMenu();

}
