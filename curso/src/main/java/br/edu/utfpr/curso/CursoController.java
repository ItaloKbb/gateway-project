package br.edu.utfpr.curso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @GetMapping
    public ResponseEntity<CursoDTO> getCurso() {
        CursoDTO curso = new CursoDTO(1L, "Engenharia de Software", 3200);
        return ResponseEntity.ok().body(curso);
    }
}