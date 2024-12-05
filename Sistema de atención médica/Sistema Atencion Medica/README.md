Descripción del Sistema de Atención Médica

El sistema de atención médica desarrollado en Java es una aplicación basada en consola que implementa los principios de la Programación Orientada a Objetos (POO). Este sistema tiene como objetivo gestionar información relacionada con pacientes, médicos y citas médicas, facilitando el acceso y la organización de datos en una clínica o consultorio. Permite registrar pacientes proporcionando su nombre y edad, asignándoles un identificador único generado automáticamente. De igual manera, se pueden registrar médicos especificando su nombre y especialidad, quienes también reciben un identificador generado automáticamente.
El sistema permite programar citas asociando un paciente y un médico mediante sus identificadores, incluyendo una fecha, y asigna también un identificador único generado automáticamente. Para facilitar la comprensión, al consultar las citas registradas, se muestran los nombres de los pacientes y los médicos en lugar de sus identificadores. Además, el sistema ofrece la posibilidad de listar todos los pacientes y médicos registrados, mostrando sus datos completos, así como todas las citas agendadas con información detallada.
La aplicación también permite cancelar citas existentes identificándolas por su identificador. Esta funcionalidad asegura que las operaciones realizadas sean claras y eficientes. El diseño del sistema está estructurado en tres paquetes principales: un paquete modelo que contiene las clases base como Paciente, Medico y Cita, las cuales representan los datos esenciales; un paquete de servicios que implementa la lógica del negocio a través de la clase Sistema, encargada de registrar y gestionar pacientes, médicos y citas; y un paquete principal (src) que proporciona el punto de entrada al sistema mediante la clase Main, la cual incluye un menú interactivo para realizar todas las operaciones disponibles.
El usuario interactúa con el sistema a través de un menú en consola que le permite seleccionar las opciones de registro, consulta o cancelación según lo requiera. La implementación asegura que las entradas sean manejadas de manera segura, y el uso de identificadores automáticos simplifica el proceso administrativo. Este sistema es una herramienta funcional y práctica que ejemplifica la aplicación de los principios de la POO en la creación de soluciones orientadas a la gestión médica.
 
Menú por consola:
===== Sistema de Atención Médica ===== 
1. Registrar paciente 
2. Registrar médico 
3. Agendar cita 
4. Consultar pacientes 
5. Consultar médicos 
6. Consultar citas 
7. Cancelar cita 
8. Salir 
Seleccione una opción:

