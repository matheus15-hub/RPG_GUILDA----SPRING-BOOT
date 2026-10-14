package comp.guilda.guildadosherois.service;

import comp.guilda.guildadosherois.Request.ClasseRequest;
import comp.guilda.guildadosherois.entity.Classe;
import comp.guilda.guildadosherois.repository.ClasseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClasseService {

    private final ClasseRepository classeRepository;

    public Long createClasse(ClasseRequest request){

        var classe = new Classe();

        classe.setNome(request.nome());
        classe.setRaridade(request.raridade());
        classe.setDescricao(request.descricao());

        var classeId = classeRepository.save(classe);

        return classeId.getId_classe();
    }

    public Optional<Classe> getByIdClasse(Long id){
        return classeRepository.findById(id);
    }

    public List<Classe> getClasseAll(){
        return classeRepository.findAll();
    }

    public void updateByIdClasse(Long id, ClasseRequest request){

        var classeExist = classeRepository.findById(id);

        if(classeExist.isPresent()){

            var classe =  classeExist.get();

            classe.setNome(request.nome());
            classe.setRaridade(request.raridade());
            classe.setDescricao(request.descricao());

            classeRepository.save(classe);
        }
    }

    public void deleteByIdClasse(Long id){

        var classeExi = classeRepository.existsById(id);

        if (classeExi){
            classeRepository.deleteById(id);
        }
    }
}
