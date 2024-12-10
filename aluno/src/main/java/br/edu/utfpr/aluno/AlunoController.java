package br.edu.utfpr.aluno;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @GetMapping
    public ResponseEntity<AlunoDTO> getAluno() {
        return ResponseEntity.ok().body(
                new AlunoDTO(1L, "João", 99876, true)
        );
    }
}
