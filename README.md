# README DEL FORO HUB 
# Challenge de Alura Latam

## Resumen
Esta documentación proporciona una visión general del diseño de una API desarrollada en Java, con un enfoque en autenticación y autorización. 
La API utiliza Spring Boot, Spring Security, Lombok y Flyway, y sigue los principios RESTful. La API maneja la autenticación y autorización, 
devuelve códigos de error HTTP adecuados y genera tokens JWT para la autorización.

## Herramientas Utilizadas

- **IDE:** IntelliJ IDEA para el desarrollo de código.
- **Base de Datos:** MySQL para el almacenamiento de datos.
- **Cliente de Pruebas:** Insomnia para probar la API.
- **Autorización:** Auth0 para la generación de JSON Web Tokens (JWT).



## **Endpoints:**
  - **POST /topicos:** Registra un nuevo tema.
  - ![Menu](https://github.com/HeberRocket/literalura/blob/main/imgns_literalura/menu.png)
  - **GET /topicos:** Lista todos los temas activos con paginación.
  - **PUT /topicos:** Actualiza un tema existente.
  - **DELETE /topicos/{id}:** Elimina lógicamente un tema marcándolo como inactivo.
  - **GET /topicos/{id}:** Recupera los detalles de un tema específico.


## Topico

### Funcionamiento
La entidad `Topico` representa un mensaje en el foro, con atributos como `id`, `mensaje`, `nombre`, `titulo`, `autor` y `activo`.

## Repositorio

### TopicoRepository
Maneja el acceso a los datos para la entidad `Topico`.

- **Método principal:** `findByActivoTrue(Pageable paginacion):` Busca temas activos con paginación.

## Datos de Autenticación de Usuario

- **DatosAutenticacionUsario:** Contiene `email` y `contrasena` para la autenticación de usuarios.

## Entidad Usuario

- **Usuario:** Representa a un usuario en la base de datos, implementando `UserDetails`.

## Repositorio de Usuario

- **UsuarioRepository:** Extiende `JpaRepository` para operaciones CRUD con `Usuario`.

## Manejo de Errores

- **TratadorDeErrores:** Clase que maneja excepciones globalmente.

## Servicio de Autenticación

- **AutenticacionService:** Implementa `UserDetailsService` para cargar detalles del usuario.

## Configuraciones de Seguridad

- **SecurityConfigurations:** Configuración de seguridad, incluyendo gestión de sesiones y cifrado de contraseñas.

## Filtro de Seguridad

- **SecurityFilter:** Filtro para validar y establecer la autenticación basada en token JWT.

## Servicio de Tokens

- **TokenService:** Genera y verifica tokens JWT.

## Controlador de Autenticación

Gestiona la autenticación de usuarios.

- **Endpoint:** `/login`
- **Método:** POST
- **Cuerpo de la Solicitud:** `DatosAutenticacionUsario`
- **Respuesta:** `DatosJWTToken`

## Esquema de la Base de Datos

### Descripción del Esquema de la Base de Datos
- **Tabla `topicos`:** Almacena los temas del foro.
  - **Atributos:** `id`, `titulo`, `mensaje`, `autor`, `nombre`, `activo`.
- **Tabla `usuarios`:** Almacena los usuarios registrados.
  - **Atributos:** `id`, `email`, `contrasena`.
