package controller;

import model.Cancion;
import model.Playlist;
import model.Usuario;

public class cancionController {
	
	Playlist play = new Playlist();
	
	public String agregarCancion(Cancion cancion, String nombrePlaylist, Usuario user){
		System.out.println("cancion: "+cancion.getNombre()+"\nplay: "+nombrePlaylist+"\nuser: "+user.getNombre());
		
		user.getListaByNombre(nombrePlaylist).anadirCancion(cancion);
		return "Cancion agregada";
	}
	
	public void quitarCancion(Cancion cancion, String nombrePlaylist, Usuario user){
		user.getListaByNombre(nombrePlaylist).quitarCancion(cancion);
	}
	
	public void buscarCancion(String nombre){
		//
	}

}
