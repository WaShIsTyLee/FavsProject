package Model.Repo;

import Interface.ILibrary;
import Model.Entity.Favs;

public class Library implements ILibrary {
    private static final int Tam = 10;
    private Favs[] favs;

    public Library() {
        favs = new Favs[Tam];
    }


    @Override
    public boolean addFav(Favs fav) {
        boolean result = false;
        if (getPosFav(fav) == 1) {
            for (int i = 0; i < favs.length; i++) {

                if (favs[i] == null) {
                    favs[i] = fav;
                    result = true;
                }
            }
        }
        return result;
    }


    @Override
    public boolean deleteFav(Favs fav) {
        boolean result = false;
        if (getPosFav(fav) == 0) {
            for (int i = 0; i < favs.length; i++) {

                if (favs[i] == fav) {
                    favs[i] = null;
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public void updateFav(Favs fav) {
        updateFavMenu();
        showAddFavMenu();
    }


    @Override
    public Favs showFav(Favs fav) {
        System.out.println("Tu fav añadido es: " + fav.getClass().getSimpleName());

        return fav;
    }

    @Override
    public Favs[] showFavs() {
        return favs;

    }

    private int getPosFav(Favs fav) {
        int result = -1;
        for (int i = 0; i < favs.length; i++) {
            if (favs[i] != null && favs[i].equals(fav)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
