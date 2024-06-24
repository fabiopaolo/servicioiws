package pe.scotiabank.serviciows.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Clientes")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clienteId;

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

}
