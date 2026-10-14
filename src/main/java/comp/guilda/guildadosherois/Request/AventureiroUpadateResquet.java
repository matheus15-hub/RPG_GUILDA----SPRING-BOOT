package comp.guilda.guildadosherois.Request;

import jakarta.validation.constraints.*;

public record AventureiroUpadateResquet(

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

        @NotNull(message = "Informe o ID da classe")
        @Positive(message = "O ID da classe deve ser maior que zero")
        Integer classe_id,

        @NotNull(message = "Informe o ID da guilda")
        @Positive(message = "O ID da guilda deve ser maior que zero")
        Integer guilda_id
) {
}
