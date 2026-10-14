package comp.guilda.guildadosherois.service;

import comp.guilda.guildadosherois.repository.AventureiroRepository;
import comp.guilda.guildadosherois.Request.AventureiroRequest;
import comp.guilda.guildadosherois.entity.Aventureiro;
import comp.guilda.guildadosherois.repository.ClasseRepository;
import comp.guilda.guildadosherois.repository.GuildaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AventureiroService {

    private final AventureiroRepository aventureiroRepository;
    private final ClasseRepository classeRepository;
    private final GuildaRepository guildaRepository;

    public long createAventureiro(AventureiroRequest request){

        //Buscando o Id classe para ver se existe se não existir emite um erro
        //Aqui temos a função de findById que busca pelo id,
        //Long.valueOf, pois aqui estamos lidando com Long e nao com int
        //.orElseThrow causa uma exessao se não encontramos o id
        var classe = classeRepository.findById(Long.valueOf(request.classe_id()))
                .orElseThrow(()-> new RuntimeException("Classe não encontrada"));
        var guilda = guildaRepository.findById(Long.valueOf(request.guilda_id()))
                .orElseThrow(()-> new RuntimeException("Guilda não encontrada"));

        var entity = new Aventureiro();

        entity.setNome(request.nome());
        entity.setIdade(request.idade());
        entity.setExperiencia(request.experiencia());
        entity.setOuro(request.ouro());
        entity.setClasse_id(classe);
        entity.setGuilda_id(guilda);

        var aventureiroId = aventureiroRepository.save(entity);
        return aventureiroId.getId_aventureiro();
    }
}
