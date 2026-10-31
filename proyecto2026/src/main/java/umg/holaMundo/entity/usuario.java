package umg.holaMundo.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "usuario")
public class usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idUsuario")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Basic(optional = false)
	
	private int idUsario;
	
	@Column(name = "nombres")
	private String nombres;


	@Column(name = "apellidos")
	private String apellidos;
	

	@Column(name = "correo")
	private String correo;
	

	@Column(name = "telefono")
	private String telefono;
	

	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	

	@Column(name = "contrasena")
	private String contrasena;
	

	@Column(name = "fotografia")
	private String fotografia;


	public int getIdusario() {
		return idUsario;
	}


	public void setIdusario(int idusario) {
		this.idUsario = idusario;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getFotografia() {
		return fotografia;
	}


	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}
	
	
	
	
}
