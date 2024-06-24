package pe.scotiabank.serviciows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "Cuentas")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class CuentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cuentaId;

    private Integer clientId;
    private String tipoCuenta;
    private Double saldo;
    private Date fechaApertura;

}
