package Interface;

import Model.Entity.Favs;

public interface ILibrary {
    boolean addFav(Favs fav);
    void deleteFav();
    void updateFav();
    void showFav(Favs fav);
    Favs[] showFavs();

}
