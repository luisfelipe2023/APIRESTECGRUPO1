package pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPublicacion;
    private String Titulo;
    private String Resumen;
    private Date FechPublicacion;
    @ManyToOne
    @JoinColumn(name = "IdAutor")
    private Autor autor;
}