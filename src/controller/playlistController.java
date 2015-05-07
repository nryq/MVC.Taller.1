package controller;

import model.Usuario;

public class playlistController {
	
	
	public void crearPlaylist(String nombre, Usuario user){
		user.crearPlaylist(nombre);
	}
	
	public void borrarPlaylist(String nombre, Usuario user){
		
		user.borrarPlaylist(user.getListaByNombre(nombre));
		
	}

}
