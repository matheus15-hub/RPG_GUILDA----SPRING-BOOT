package comp.guilda.guildadosherois.entity;

import comp.guilda.guildadosherois.entity.Enum.Raridade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classe")
public class Classe {

    @Id
    @Column(name = "id_classe")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_classe;

    @Column(name ="nome")
    private String nome;

    @Column(name = "descricao")
    private  String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "raridade")
    private Raridade raridade;

    @OneToMany(mappedBy = "classe_id")
    private List<Aventureiro> aventureiros;
}
