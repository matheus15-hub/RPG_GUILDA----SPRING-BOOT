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
@Table(name = "aventureiro")
public class Aventureiro {

    @Id
    @Column(name = "id_aventureiro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aventureiro;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "experiencia")
    private int experiencia = 0;

    @Column(name = "ouro")
    private int ouro =1;

    @ManyToOne
    @JoinColumn(name= "classe_id", referencedColumnName = "id_classe")
    private Classe classe_id;

    @ManyToOne
    @JoinColumn(name = "guilda_id", referencedColumnName = "id_guilda")
    private Guilda guilda_id;
}
