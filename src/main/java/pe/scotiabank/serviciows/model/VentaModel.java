package pe.scotiabank.serviciows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Venta")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_venta", nullable=false)
    private Integer idVenta;

    @Column(name="direccion")
    private String direccion;

    @Column(name="total")
    private float total;
}
