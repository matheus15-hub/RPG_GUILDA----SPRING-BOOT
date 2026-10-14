package comp.guilda.guildadosherois.Request;

import comp.guilda.guildadosherois.entity.Enum.Raridade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ClasseRequest(
        @NotBlank
        @Pattern(regexp = "^[\\p{L}\\s'-]+$", message = "Nome nao pode conter caracter especial"
        )
        @Size(
                min = 4,
                max = 200,
                message = "Nome teve estar entre 4 a 200 caracter"
        )
        String nome,
        @NotBlank(message = "Informe a raridade da classe")
        Raridade raridade,
        String descricao
) {
}
