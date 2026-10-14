package comp.guilda.guildadosherois.controller;

import comp.guilda.guildadosherois.Request.AventureiroRequest;
import comp.guilda.guildadosherois.Request.AventureiroUpadateResquet;
import comp.guilda.guildadosherois.entity.Aventureiro;
import comp.guilda.guildadosherois.service.AventureiroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aventureiro")
public class AventureiroController {


    private final AventureiroService aventureiroService;

    @PostMapping
    public ResponseEntity<Aventureiro> createAventureiro(@RequestBody @Valid  AventureiroRequest request){

        var aventureiroId = aventureiroService.createAventureiro(request);

        return ResponseEntity.created(URI.create(("/aventureiro/"+ aventureiroId))).build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aventureiro> getAventureiroByid(@PathVariable("id")Long id){
        var aventureiro = aventureiroService.getIdAventureiro(id);
        if(aventureiro.isPresent()){
            return ResponseEntity.ok(aventureiro.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Aventureiro>> getAventureiroAll(){
        var aventureiro = aventureiroService.getAllAventureiro();
        return ResponseEntity.ok(aventureiro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateByIdAventureiro(@PathVariable("id") Long id, @RequestBody @Valid AventureiroUpadateResquet resquet){

        aventureiroService.updateByIdAventureiro(id,resquet);
        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByIdAventureiro(@PathVariable("id") Long id){
        aventureiroService.deleteByIdAventureiro(id);
        return ResponseEntity.noContent().build();
    }
}
