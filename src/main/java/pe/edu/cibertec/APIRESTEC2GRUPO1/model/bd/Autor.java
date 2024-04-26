package pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Autor") //De la tabla Autor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAutor;
    private String NomAutor;
    private String ApeAutor;
    private Date FechNacAutor;
}