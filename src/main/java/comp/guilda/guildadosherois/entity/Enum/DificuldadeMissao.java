package comp.guilda.guildadosherois.entity.Enum;


import lombok.Getter;

@Getter
public enum DificuldadeMissao {
    Faisca("Faísca"),//1
    Broto_Arcano("Broto Arcano"),//2
    Runiforme("Runiforme"),//4
    Presa_de_Ebano("Presa de Ébano"),//5
    Sangue_de_Dragao("Sangue de Dragão"),///7
    Cataclismo("Cataclismo"),//9
    Divindade("Divindade");//12

    private final String nomeExebicao;

    DificuldadeMissao(String nomeExebicao) {
        this.nomeExebicao = nomeExebicao;
    }
}
