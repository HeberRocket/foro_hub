package foro.hub.api.domain.topico;

public record DatosRespuestaTopico(Long id,
                                   String mensaje,
                                   String nombre,
                                   String titulo,
                                   String autor) {
}
