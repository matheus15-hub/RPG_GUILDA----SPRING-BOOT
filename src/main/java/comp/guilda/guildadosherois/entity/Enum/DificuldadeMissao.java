package comp.guilda.guildadosherois.entity.Enum;


import lombok.Getter;

@Getter
public enum DificuldadeMissao {
    Faisca("Faísca"),
    Broto_Arcano("Broto Arcano"),
    Runiforme("Runiforme"),
    Presa_de_Ebano("Presa de Ébano"),
    Sangue_de_Dragao("Sangue de Dragão"),
    Cataclismo("Cataclismo"),
    Divindade("Divindade");

    private final String nomeExebicao;

    DificuldadeMissao(String nomeExebicao) {
        this.nomeExebicao = nomeExebicao;
    }
}
