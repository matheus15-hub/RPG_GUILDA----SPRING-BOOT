package comp.guilda.guildadosherois.repository;

import comp.guilda.guildadosherois.entity.Aventureiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AventureiroRepository extends JpaRepository<Aventureiro, Long> {

}
