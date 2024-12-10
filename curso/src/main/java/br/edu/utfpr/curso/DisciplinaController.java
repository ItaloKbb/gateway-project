package br.edu.utfpr.curso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @GetMapping
    public ResponseEntity<List<DisciplinaDTO>> getDisciplinas() {
        List<DisciplinaDTO> disciplinas = List.of(
                new DisciplinaDTO(1L, "Matemática Aplicada", 80, true),
                new DisciplinaDTO(2L, "Programação Orientada a Objetos", 120, true),
                new DisciplinaDTO(3L, "Gestão de Projetos", 60, false)
        );
        return ResponseEntity.ok(disciplinas);
    }
}