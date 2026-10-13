
package comp.guilda.guildadosherois.Request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record MonstroRequest(

        @NotBlank(message = "O nome do monstro não pode ser vazio")
        @Size(min = 3, max = 150,
                message = "O nome deve ter entre 3 e 150 caracteres")
        @Pattern(regexp = "^[\\p{L}\\p{N}\\s'-]+$",
                message = "O nome não pode conter caracteres especiais inválidos")
        String nome,

        @NotNull(message = "Informe a experiência recebida ao derrotar o monstro")
        @Min(value = 0, message = "A experiência não pode ser negativa")
        Integer drop_xp

) {}
