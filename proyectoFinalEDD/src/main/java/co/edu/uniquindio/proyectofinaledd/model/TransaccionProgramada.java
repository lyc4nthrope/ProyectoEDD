package co.edu.uniquindio.proyectofinaledd.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class TransaccionProgramada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // Depósito, Retiro, Transferencia
    private Double monto;
    private LocalDateTime fechaProgramada;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
