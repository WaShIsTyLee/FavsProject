package Interface;

import Model.Entity.Favs;

public interface ILibrary {
    boolean addFav(Favs fav);
    boolean deleteFav(Favs fav);
    void updateFav(Favs fav);
    Favs showFav(Favs fav);
    Favs[] showFavs();

}
