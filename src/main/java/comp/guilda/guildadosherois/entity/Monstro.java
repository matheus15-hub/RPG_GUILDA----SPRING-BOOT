package comp.guilda.guildadosherois.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "monstro")
public class Monstro {

    @Id
    @Column(name="id_monstro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_monstro;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "drop_xp")
    private int drop_xp;

    @OneToMany(mappedBy = "monstro_id")
    private List<Missao> missoes;

}
