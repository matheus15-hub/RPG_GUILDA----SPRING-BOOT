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
@Table(name = "guilda")
public class Guilda {

    @Id
    @Column(name = "id_guilda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_guilda;

    @Column(name = "nome")
    private String nome;

    @Column(name="lema")
    private String lema;

    @OneToMany(mappedBy = "id_guilda")
    private List<Aventureiro> aventureiros;
}
