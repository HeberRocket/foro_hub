package foro.hub.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String nombre;
    private String titulo;
    private String autor;
    private Boolean activo;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.mensaje = datosRegistroTopico.mensaje();
        this.nombre = datosRegistroTopico.nombre();
        this.titulo = datosRegistroTopico.titulo();
        this.autor = datosRegistroTopico.autor();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }


    }

    public void desactivarTopico() {
        this.activo = false;
    }

    private Instant generarFechasCreacion() {
        return LocalDateTime.now().toInstant(ZoneOffset.of("-05:00"));
    }
}
