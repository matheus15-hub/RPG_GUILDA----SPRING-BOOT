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
    private int id_aventureiro;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "experiencia")
    private int experiencia = 0;

    @Column(name = "ouro")
    private int ouro =1;

    @ManyToMany
    @JoinColumn(name= "classe_id", referencedColumnName = "id_clase")
    private int class_id;

    @ManyToMany
    @JoinColumn(name = "guilda_id", referencedColumnName = "id_guida")
    private int guilda_id;
}
