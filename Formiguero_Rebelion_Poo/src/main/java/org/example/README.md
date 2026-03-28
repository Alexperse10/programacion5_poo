# Práctica 1 - El Formiguero y La Rebelión

## Introducción

En esta práctica se ha desarrollado una aplicación en Java para gestionar información sobre programas de televisión, sus empleados e invitados.

El objetivo es representar la relación entre cadenas, programas, empleados e invitados, así como implementar diferentes métodos para analizar la información.

---

## Clases implementadas

### Cadena

Representa una cadena de televisión.

- Atributos:
    - nombre
    - lista de programas

- Funcionalidad:
    - Añadir programas
    - Eliminar programas
    - Mantener relación bidireccional con Programa

---

### Programa

Representa un programa de televisión.

- Atributos:
    - nombre
    - cadena
    - temporadas
    - lista de empleados
    - lista de invitados
    - director

- Funcionalidad:
    - Insertar empleados
    - Insertar invitados
    - Contar invitados por temporada
    - Buscar invitados
    - Rastrear invitados
    - Comparar en qué programa estuvo antes un invitado

---

### Empleado

Representa un trabajador del programa.

- Atributos:
    - id autogenerado
    - nombre
    - cargo
    - director

- Funcionalidad:
    - Validación del cargo
    - Generación automática del id

---

### Invitado

Representa un invitado que acude al programa.

- Atributos:
    - nombre
    - profesión
    - fecha de visita
    - temporada

- Funcionalidad:
    - Asignación de fecha automática si es null
    - Control de temporada

---

### FormigueroApp

Clase principal que ejecuta la aplicación.

- Permite:
    - Crear objetos
    - Insertar empleados e invitados
    - Probar todos los métodos

---

## Relaciones entre clases

- **Cadena y Programa**
    - Relación de agregación bidireccional

- **Programa con Empleado e Invitado**
    - Relación de composición

---

## Métodos implementados

Se han desarrollado los siguientes métodos:

- contar_invitados → cuenta invitados por temporada
- vecesinvitados → número de veces que ha acudido un invitado
- rastrearinvitados → muestra información del invitado
- buscarinivitado → comprueba si un invitado ha acudido
- invitadoAntes → compara en qué programa estuvo antes

---

## Pruebas realizadas (JUnit 5)

Se han realizado pruebas unitarias para comprobar el correcto funcionamiento del programa.

Clases de test:

- CadenaTest
- EmpleadoTest
- ProgramaTest
- InvitadoTest

Se han probado:

- Inserción de programas
- Inserción de empleados
- Inserción de invitados
- Validación de cargos
- Búsqueda de invitados

---

## Javadoc

Se han añadido comentarios Javadoc en las clases y métodos principales para explicar su funcionamiento.

---

## Conclusión

En esta práctica se ha trabajado con:

- Programación orientada a objetos
- Relaciones entre clases
- Uso de listas (ArrayList)
- Manejo de fechas con LocalDate
- Pruebas unitarias con JUnit 5
- Documentación con Javadoc

El resultado es una aplicación funcional que permite gestionar programas de televisión y analizar la información de invitados y empleados.

## Diagrama UML

![UML](uml.png)