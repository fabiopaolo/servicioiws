package pe.scotiabank.serviciows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "Tarjetas")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class TarjetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tarjetaId;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private CuentaModel cuenta;//cuentaId

    private String numeroTarjeta;

    //@Temporal(TemporalType.TIMESTAMP) se pone una fecha por defecto por eso no se pone el timestamp
    private Date fechaExpiracion;

    private String codigoSeguridad;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
}
