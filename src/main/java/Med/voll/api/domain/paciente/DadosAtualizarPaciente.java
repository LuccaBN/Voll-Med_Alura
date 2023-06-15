package Med.voll.api.domain.paciente;

import Med.voll.api.domain.endereco.DadosEnderecoPaciente;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEnderecoPaciente endereco) {
}
