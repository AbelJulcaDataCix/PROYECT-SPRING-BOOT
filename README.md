🚀 Proyectos y Estructura de Commits
Esta sección describe la convención de commits utilizada para la organización del proyecto.

ABEL: 001 [Message]: Cambios relacionados con diagramas.

ABEL: 002 [Message]: Cambios en el proyecto de product.

ABEL: 003 [Message]: Cambios en el proyecto de order.

ABEL: 004 [Message]: Cambios en el proyecto de inventory.

ABEL: 005 [Message]: Cambios en el proyecto de discovery.

ABEL: 006 [Message]: Cambios en el proyecto de apiGateway.

ABEL: 007 [Message]: Cambios generales del proyecto.

🛠️ Herramientas y Dependencias
Esta sección contiene enlaces útiles para el desarrollo y configuración del entorno.

Creación de Proyectos
Spring Initializr: Utiliza este enlace para crear nuevos proyectos basados en Spring Boot.

https://start.spring.io/

Base de Datos
MongoDB Community Server: Descarga la versión 8.0.12 para Windows x64.

https://www.mongodb.com/try/download/community

Dependencias para Pruebas Unitarias
Testcontainers: Biblioteca para pruebas de integración con contenedores.
Módulo de MongoDB para Testcontainers
Integración con JUnit 5

https://java.testcontainers.org/


Para el token de seguridad se utilizo la imagen de keycloak en docker
https://www.keycloak.org/getting-started/getting-started-docker


Para la trazabilidad
https://zipkin.io/pages/quickstart.html
docker run -d -p 9411:9411 openzipkin/zipkin
