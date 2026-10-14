package comp.guilda.guildadosherois.controller;

import comp.guilda.guildadosherois.Request.AventureiroRequest;
import comp.guilda.guildadosherois.entity.Aventureiro;
import comp.guilda.guildadosherois.service.AventureiroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

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
    public ResponseEntity<Aventureiro> getAventureiroByid(@PathVariable("id")String id){
        return null;
    }
}
