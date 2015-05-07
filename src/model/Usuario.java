package model;

import java.util.ArrayList;

public class Usuario {
	
	int id;
	String nombre;
	String correo;
	String pass;
	
	ArrayList<Playlist> listas;
	//u.getListaByNombre("prueba");
	public Usuario() {
		super();
	}

	public Usuario(int id, String nombre, String correo, String pass) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.pass = pass;
		this.listas = new ArrayList<Playlist>();
		
	}

	public void crearPlaylist(String nombre){
		
		int idAux;
		
		if(listas.isEmpty()==false){
			idAux = listas.get(listas.size()-1).id+1;
		}else{
			idAux = 0;
		}
		
		Playlist pAux = new Playlist(idAux, nombre, this);
		
		listas.add(pAux);
		
		//System.out.println("<<<<<\n\nid: "+pAux.id);
		
	}
	
	public void borrarPlaylist(Playlist list){
		
		for(int n = 0; n<listas.size(); n++){
			if(listas.get(n).id == list.id){
				listas.remove(n);
			}
		}
	}
	
	public Playlist getListaByNombre(String nombre){
		
		for(int n = 0; n<listas.size(); n++){
		
			System.out.println("get lista nombre: "+listas.get(n).nombre);
			
			if(listas.get(n).nombre.equals(nombre)){
				return listas.get(n);
			}else{
				return null;
			}
		}
		return null;
	}
	
	public ArrayList<Playlist> getListas(){
		return listas;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setListas(ArrayList<Playlist> listas) {
		this.listas = listas;
	}

}
