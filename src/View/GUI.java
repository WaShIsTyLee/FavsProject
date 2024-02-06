package View;

import Interface.IGUI;
import Model.Entity.Favs;
import Model.Entity.Game;
import Model.Entity.Movie;
import Model.Entity.Song;

import java.util.Scanner;

public class GUI  implements IGUI {
    public static void  main(String[] args) {
    }



    @Override
    public void printStart() {
            System.out.println("*******************************************");
            System.out.println("*                                         *");
            System.out.println("*            Lista de favoritos           *");
            System.out.println("*                                         *");
            System.out.println("*******************************************");

    }

    @Override
    public void showMainMenu() {
        System.out.println("----------------------------------");
        System.out.println("|       1.Listar favoritos       |");
        System.out.println("|      3.Insertar favoritos      |");
        System.out.println("|     4.Actualizar favoritos     |");
        System.out.println("|       5.Borrar favoritos       |");
        System.out.println("|             6.Salir            |");
        System.out.println("----------------------------------");


    }

    @Override
    public void showFavMenu() {
        System.out.println("----------------------------------");
        System.out.println("|           1.Juegos             |");
        System.out.println("|          2.Películas           |");
        System.out.println("|          3.Canciones           |");
        System.out.println("----------------------------------");

    }

    @Override
    public void showAddFavMenu() {
        System.out.println("----------------------------------");
        System.out.println("|           1.Juegos             |");
        System.out.println("|          2.Películas           |");
        System.out.println("|          3.Canciones           |");
        System.out.println("----------------------------------");
        Favs result;

        int opcion = leeEntero("Inserte una opción");
        switch (opcion){
            case 1:
                result=new Game();
                break;
            case 2:
                result=new Movie();
                break;
            default:
                result=new Song();
        }
        result.setName(leeString("Inserte el nombre del favorito"));
        result.setID(leeString("Inserte el ID "));
        if (opcion==1){
            ((Game)result).setPrice(leeEntero("Inserte el precio de su juego"));

        }else  if (opcion==2){
            ((Movie)result).setGender(leeString("Inserte el género d ela película"));
        }else {
            ((Song)result).setArtist(leeString("Inserte el artista de la canción"));
        }
        return result;

    }

    @Override
    public void showDeleteFavMenu() {

    }

    @Override
    public void showUpdateFavMenu() {

    }





    public int leeEntero(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg+": ");
        return teclado.nextInt();
    }


    public String leeString(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg+": ");
        return teclado.nextLine();
    }
}