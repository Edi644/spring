package umg.holaMundo.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sala")
public class sala implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idSala;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "filas")
    private int filas;

    @Column(name = "asientos_por_fila")
    private int asientosPorFila;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<asiento> asientos;
    
    
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getAsientosPorFila() {
        return asientosPorFila;
    }

    public void setAsientosPorFila(int asientosPorFila) {
        this.asientosPorFila = asientosPorFila;
    }

	public List<asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<asiento> asientos) {
		this.asientos = asientos;
	}
    
}