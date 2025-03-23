package co.edu.uniquindio.proyectofinaledd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Rango {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // Bronce, Plata, Oro, Platino
    private Integer puntosMinimos;

    @OneToMany(mappedBy = "rango", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cliente> clientes;
}