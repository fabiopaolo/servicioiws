package pe.scotiabank.serviciows.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

//@Data se remplaza por todos los demas anotaciones.
@Entity
@Table(name = "Transaction")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class TransaccionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    //referenciamos el campo con su campo respectivo de la otra tabla.
    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private CuentaModel cuenta;//cuentaId

    private String tipóTransaccion;
    private Double monto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTrasaccion;
}
