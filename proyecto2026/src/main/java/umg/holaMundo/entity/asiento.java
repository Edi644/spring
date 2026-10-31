package umg.holaMundo.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asiento")
public class asiento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_asiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idAsiento;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_sala", referencedColumnName = "id_sala")
    private sala sala;


    @Column(name = "fila")
    private String fila;

    @Column(name = "numero")
    private int numero;

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }



    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

	public sala getSala() {
		return sala;
	}

	public void setSala(sala sala) {
		this.sala = sala;
	}




    
    
}