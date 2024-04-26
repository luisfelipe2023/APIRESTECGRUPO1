package pe.edu.cibertec.APIRESTEC2GRUPO1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.bd.Autor;
import pe.edu.cibertec.APIRESTEC2GRUPO1.model.dto.AutorRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO1.service.IAutorService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/autor")  //Ruta para el POSTMAN
public class AutorController {
    private IAutorService iautorService;

    @PostMapping("")
    public ResponseEntity<Autor> registrarAutor(
            @RequestBody AutorRequestDto autorRequestDto
    ){
        return new ResponseEntity<>(
                iautorService.registrarAutor(autorRequestDto),
                HttpStatus.CREATED
        );
    }

}