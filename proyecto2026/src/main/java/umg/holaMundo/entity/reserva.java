package umg.holaMundo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_reserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva; // Cambiado a Integer para aceptar null al crear

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "id_funcion")
    private Integer idFuncion;

    @Column(name = "cantidad_entradas")
    private Integer cantidadEntradas; // Cambiado a Integer para coincidir con el getter

    @Column(name = "total_a_pagar")
    private BigDecimal totalAPagar;

    @Column(name = "fecha_reserva")
    private LocalDateTime fechaReserva;

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public Integer getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(Integer cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public BigDecimal getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(BigDecimal totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}