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

    private Integer cuentaId;
    private String numeroTarjeta;
    private Date fechaExpiracion;
    private String codigoSeguridad;
    private Date fechaEmision;
}
