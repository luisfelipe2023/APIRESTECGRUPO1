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

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/autor")
public class AutorController {
    private IClienteService iClienteService;

    @PostMapping("")
    public ResponseEntity<Autor> registrarCliente(
            @RequestBody AutorRequestDto autorRequestDto
    ){
        return new ResponseEntity<>(
                iClienteService.registrarCliente(autorRequestDto),
                HttpStatus.CREATED
        );
    }

}