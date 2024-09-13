# language: es
Característica: Proceso de contratación en OrangeHRM

  Escenario: Contratar un nuevo candidato
    Dado que el usuario ha iniciado sesión en OrangeHRM
    Cuando el usuario navega a la sección de Recruitment
    Y agrega un nuevo candidato con la siguiente información:
      | Nombre   | Apellido | Email               | Vacante    |
      | Juan     | Pérez    | juan.perez@mail.com | IT Manager |
    Entonces el candidato debe aparecer en la lista de candidatos
    Y el estado del candidato debe ser "Hired"
