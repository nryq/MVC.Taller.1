package maiin;

import controller.*;
import model.*;
import view.*;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cancionController can = new cancionController();
		playlistController pc = new playlistController();
		userController uc = new userController();
		
		Cancion c = new Cancion(1, "Le gg", "asd", "nuevo");
		Playlist p = new Playlist();
		Usuario u = new Usuario(1, "yo", "gmail", "1234");
		
		
		pc.crearPlaylist("prueba", u);
		
		can.agregarCancion(c,"prueba", u);
		
		System.out.println("----asdasd------"+u.getListas().size());
		

	}

}
