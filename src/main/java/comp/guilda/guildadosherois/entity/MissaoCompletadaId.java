package comp.guilda.guildadosherois.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissaoCompletadaId implements Serializable {

    private Long id_aventureiro;

    private Long id_missao;
}