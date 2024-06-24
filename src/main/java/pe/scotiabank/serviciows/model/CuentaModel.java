package pe.scotiabank.serviciows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;//clientId
    private String tipoCuenta;
    private Double saldo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransaccionModel> transacciones;

    @OneToMany(mappedBy = "tarjeta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TarjetaModel> tarjetas;

}
