package comp.guilda.guildadosherois.controller;

import comp.guilda.guildadosherois.AventureiroRepository;
import comp.guilda.guildadosherois.Request.AventureiroRequest;
import comp.guilda.guildadosherois.entity.Aventureiro;
import comp.guilda.guildadosherois.service.AventureiroService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/ave   ntureiro")
public class AventureiroController {

    private AventureiroRepository aventureiroRepository;
    private

    @PostMapping
    public ResponseEntity<Aventureiro> createAventureiro(@RequestBody @Valid  AventureiroRequest request){

       return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aventureiro> getAventureiroByid(@PathVariable("id")String id){
        return null;
    }
}
