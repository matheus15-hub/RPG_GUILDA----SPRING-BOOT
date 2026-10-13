
package comp.guilda.guildadosherois.Request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record AventureiroRequest(

        @NotBlank(message = "Nome não pode ser vazio")
        @Size(
                min = 4,
                max = 150,
                message = "Nome deve ter entre 4 e 150 caracteres"
        )
        @Pattern(
                regexp = "^[\\p{L}\\s'-]+$",
                message = "Nome não pode conter números ou caracteres especiais"
        )
        String nome,

        @Min(
                value = 16,
                message = "Idade mínima de 16 anos"
        )
        Integer idade,

        @Min(
                value = 0,
                message = "Experiência não pode ser negativa"
        )
        Integer experiencia,

        @Min(
                value = 0,
                message = "Ouro não pode ser negativo"
        )
        Integer ouro,

        @NotNull(message = "Informe o ID da classe")
        @Positive(message = "O ID da classe deve ser maior que zero")
        Integer classe_id,

        @NotNull(message = "Informe o ID da guilda")
        @Positive(message = "O ID da guilda deve ser maior que zero")
        Integer guilda_id

) {}
