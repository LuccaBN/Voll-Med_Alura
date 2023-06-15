package Med.voll.api.domain.medico;

import Med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {

}
