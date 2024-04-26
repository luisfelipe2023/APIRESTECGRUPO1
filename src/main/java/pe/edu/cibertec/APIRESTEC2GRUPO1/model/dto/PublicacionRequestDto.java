package pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PublicacionRequestDto {
    private String Titulo;
    private String Resumen;
    private Date FechPublicacion;
}
