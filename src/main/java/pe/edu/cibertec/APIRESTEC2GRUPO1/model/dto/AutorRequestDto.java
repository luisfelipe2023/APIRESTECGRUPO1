package pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AutorRequestDto {
    private String NomAutor;
    private String ApeAutor;
    private Date FechNacAutor;
    private List<PublicacionRequestDto> publicacion = new ArrayList<>();
}
