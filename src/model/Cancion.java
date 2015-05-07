package model;

public class Cancion {
	
	int id;
	String nombre;
	String Artista;
	String Album;
	
	
	
	
	public Cancion() {
		super();
	}
	public Cancion(int id, String nombre, String artista, String album) {
		super();
		this.id = id;
		this.nombre = nombre;
		Artista = artista;
		Album = album;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		Album = album;
	}

}
