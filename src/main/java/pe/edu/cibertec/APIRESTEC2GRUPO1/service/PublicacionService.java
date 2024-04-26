package pe.edu.cibertec.APIRESTEC2GRUPO1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2GRUPO1.repository.PublicacionRepository;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService {
    private PublicacionRepository publicacionRepository;

    @Override
    public Publicacion registrarPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }
}
