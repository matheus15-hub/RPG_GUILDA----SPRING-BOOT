package comp.guilda.guildadosherois.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "missoes_completada")
public class MissaoCompletada {

    @EmbeddedId
    private MissaoCompletadaId id;

    @ManyToOne
    @MapsId("id_aventureiro")
    @JoinColumn(name = "id_aventureiro")
    private Aventureiro aventureiro;

    @ManyToOne
    @MapsId("id_missao")
    @JoinColumn(name = "id_missao")
    private Missao missao;


}