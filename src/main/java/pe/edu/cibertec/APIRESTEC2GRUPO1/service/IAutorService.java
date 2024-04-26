package pe.edu.cibertec.APIRESTEC2GRUPO1.service;

import pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd.Autor;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto.AutorRequestDto;

public interface IAutorService {
    Autor registrarAutor(AutorRequestDto autorRequestDto);
}
