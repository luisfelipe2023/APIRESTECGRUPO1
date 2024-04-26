package pe.edu.cibertec.APIRESTEC2GRUPO1.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd.Autor;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto.AutorRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto.PublicacionRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO1.repository.AutorRepository;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService {
    private AutorRepository autorRepository;
    private IPublicacionService iPublicacionService;

    @Transactional
    @Override
    public Autor registrarAutor(AutorRequestDto autorRequestDto) { //Función corregida, ahora sí registra y guarda correctamente en la BD
        Autor autor = new Autor();
        autor.setNomAutor(autorRequestDto.getNomAutor());
        autor.setApeAutor(autorRequestDto.getApeAutor());
        autor.setFechNacAutor(autorRequestDto.getFechNacAutor());
        Autor nuevoAutor = autorRepository.save(autor);
        Publicacion publicacion;
        for (PublicacionRequestDto publicacionRequestDto : autorRequestDto.getPublicacion()) { //Este bucle permite obtener los datos a través del Objeto Publicación
            publicacion = new Publicacion();
            publicacion.setTitulo(publicacionRequestDto.getTitulo());
            publicacion.setFechPublicacion(publicacionRequestDto.getFechPublicacion());
            publicacion.setAutor(nuevoAutor);
            iPublicacionService.registrarPublicacion(publicacion);
        }
        return nuevoAutor;
    }
}
