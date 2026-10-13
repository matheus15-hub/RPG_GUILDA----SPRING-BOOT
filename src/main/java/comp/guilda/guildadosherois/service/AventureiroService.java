package comp.guilda.guildadosherois.service;

import comp.guilda.guildadosherois.AventureiroRepository;
import comp.guilda.guildadosherois.Request.AventureiroRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AventureiroService {

    private AventureiroRepository aventureiroRepository;

    public void createAventureiro(AventureiroRequest aventureiroRequest){

    }
}
