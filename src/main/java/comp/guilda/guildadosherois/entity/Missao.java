package comp.guilda.guildadosherois.entity;

import comp.guilda.guildadosherois.entity.Enum.DificuldadeMissao;
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
@Table(name = "missao")
public class Missao {

    @Id
    @Column(name = "id_missao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_missao;

    @Column(name= "nome")
    private  String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "dificuldade")
    private DificuldadeMissao dificuldade;

    @Column(name = "recompensa_ouro")
    private int recompensa_ouro = 0;

    @ManyToOne
    @JoinColumn(name = "monstro_id", referencedColumnName = "id_monstro")
    private Monstro monstro_id;

    @Column(name = "quantidade_monstro")
    private  int quantidade_monstro = 1;

    @Column(name = "xp_recebido")
    private int xp_recebido = 0;
}
