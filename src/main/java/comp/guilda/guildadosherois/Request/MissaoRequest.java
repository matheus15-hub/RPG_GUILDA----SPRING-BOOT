
package comp.guilda.guildadosherois.Request;

import comp.guilda.guildadosherois.entity.Enum.DificuldadeMissao;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record MissaoRequest(

        @NotBlank(message = "O nome da missão não pode ser vazio")
        @Size(min = 4, max = 150,
                message = "O nome deve ter entre 4 e 150 caracteres")
        @Pattern(regexp = "^[\\p{L}\\p{N}\\s'-]+$",
                message = "O nome não pode conter caracteres especiais inválidos")
        String nome,

        @NotNull(message = "Informe a dificuldade da missão")
        DificuldadeMissao dificuldade,

        @NotNull(message = "Informe a recompensa em ouro")
        @Min(value = 0, message = "A recompensa em ouro não pode ser negativa")
        Integer recompensa_ouro,

        @NotNull(message = "Informe o ID do monstro")
        @Positive(message = "O ID do monstro deve ser maior que zero")
        Integer monstro_id,

        @NotNull(message = "Informe a quantidade de monstros")
        @Min(value = 1, message = "A quantidade de monstros deve ser pelo menos 1")
        Integer quantidade_monstro,

        @NotNull(message = "Informe a experiência recebida")
        @Min(value = 0, message = "A experiência recebida não pode ser negativa")
        Integer xp_recebido

) {}
