package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(@NotBlank
                                  String mensaje,
                                  @NotBlank
                                  String nombre,
                                  @NotBlank
                                  String titulo,
                                  @NotBlank
                                  String autor) {
}
