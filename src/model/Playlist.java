package model;

import java.util.ArrayList;

public class Playlist {
	
	int id;
	public String nombre;
	ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	Usuario creador;
	
	public Playlist() {
		super();
	}
	public Playlist(int id, String nombre, Usuario creador) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creador = creador;
	}
	public void anadirCancion(Cancion c){
		System.out.println("id: "+c.id+" nombre: "+c.nombre);
		canciones.add(c);
	}
	public void quitarCancion(Cancion c){
		for(int n = 0; n<canciones.size(); n++){
			if(canciones.get(n).id == c.id){
				canciones.remove(n);
			}
		}
	}

}
