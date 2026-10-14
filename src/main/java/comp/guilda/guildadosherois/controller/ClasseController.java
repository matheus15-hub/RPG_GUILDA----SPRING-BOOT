package comp.guilda.guildadosherois.controller;

import comp.guilda.guildadosherois.Request.ClasseRequest;
import comp.guilda.guildadosherois.entity.Classe;
import comp.guilda.guildadosherois.repository.ClasseRepository;
import comp.guilda.guildadosherois.service.ClasseService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/classe")
public class ClasseController {

    private final ClasseService classeService;

    @PostMapping
    public ResponseEntity<Classe> createClasse(@RequestBody @Valid ClasseRequest request){

        var classeId = classeService.createClasse(request);

        return ResponseEntity.created(URI.create("/classe/" + classeId)).build();
    }

    @GetMapping("/{{id}}")
    public ResponseEntity<Classe> getClasseById(@PathVariable("id") Long id){
        var classe = classeService.getByIdClasse(id);

        if(classe.isPresent()){
            return ResponseEntity.ok(classe.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Classe>> getClasseAll(){
        var classeAll = classeService.getClasseAll();
        return ResponseEntity.ok(classeAll);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateClasseById(@PathVariable("id")Long id,@RequestBody @Valid ClasseRequest request){
        classeService.updateByIdClasse(id,request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClasseById(@PathVariable("id") Long id){
      classeService.deleteByIdClasse(id);
      return ResponseEntity.noContent().build();
    }


}
