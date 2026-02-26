---

# 📘 Informe del Proyecto – Mutxamel FC

## 📌 1. Descripción General del Proyecto

El siguiente codigo representa el comportamiento de un equipo de futbol ,**Mutxamel FC**, y su respectivo app de mantenimiento para poder añadir jugadores.

El sistema permite:

* Representar los distintos integrantes del club.
* Gestionar jugadores mediante una aplicación de mantenimiento.
* Simular acciones deportivas como entrenamientos, viajes y celebraciones.
* Aplicar conceptos avanzados de Programación Orientada a Objetos (POO).

---

## 🏗️ 2. Estructura del Proyecto

El proyecto está compuesto por las siguientes clases, interfaces y enumeraciones:

### Clases principales

* `MutxamelFC` (clase base)
* `Jugador`
* `Entrenador`
* `Masajista`
* `Acompañante`
* `AppMutxamelFC`
* `AppMantenimiento`
* `DorsalNoDisponible` (excepción personalizada)

### Interfaces

* `AccionesDeportivas`

### Enumeraciones

* `Equipos`
* `Posiciones` (usada en Jugador)

---

## 🧠 3. Conceptos de Programación Orientada a Objetos Aplicados

### Herencia

La clase base `MutxamelFC` contiene atributos comunes como:

* `nombre`
* `edad`

Las clases que heredan de ella son:

* `Jugador`
* `Entrenador`
* `Masajista`
* `Acompañante`

Esto permite reutilización de código y jerarquía estructurada.

---

### Polimorfismo

Se utiliza polimorfismo cuando se recorren listas de tipo:

```java
ArrayList<MutxamelFC> integrantesEquipo
```

Cada objeto ejecuta su propia versión de métodos como:

* `concentrarse()`
* `viajar()`
* `celebrarGol()`

También se usa `instanceof` con pattern matching:

```java
if (integrante instanceof Jugador j)
```

---

### Interfaces

La interfaz `AccionesDeportivas` define:

```java
void entrenar();
void jugarPartido(String rival);
```

Es implementada por:

* `Jugador`
* `Entrenador`

Esto obliga a ambas clases a definir estas acciones deportivas.

---

### Encapsulamiento

Se aplican:

* Atributos privados.
* Métodos getters y setters.
* Control de modificación de datos.

Ejemplo:

```java
private int dorsal;
public void setDorsal(int dorsal)
```

---

### ✅ Excepciones Personalizadas

Se implementa la excepción:

```java
DorsalNoDisponible
```

Se lanza cuando se intenta asignar un dorsal ya utilizado por otro jugador.


---

## ⚽ 4. Descripción de las Clases

---

### 🧍 Jugador

Representa a un jugador del club.

**Atributos:**

* `Equipos categoria`
* `int dorsal`
* `Posiciones posicion`

**Métodos destacados:**

* `entrenar()`
* `jugarPartido()`
* `marcarGol()`
* `calentar()`
* `descansar()`
* `celebrarGol()`
* `toString()`

---

### 🧑‍🏫 Entrenador

Representa al entrenador del equipo.

**Atributos:**

* `Equipos equipo`
* `String formacionPreferida`

**Métodos destacados:**

* `planificarEntrenamiento()`
* `hacerCambios()`
* `entrenar()`
* `jugarPartido()`

---

### 💆 Masajista

Representa al personal sanitario del equipo.

**Atributos:**

* `String titulacion`
* `int anosExperiencia`

**Método específico:**

* `darMasaje(Jugador jugador)`

---

### 👨‍👩‍👦 Acompañante

Representa a un acompañante de un jugador (solo permitido para categoría SENIOR).

**Atributos:**

* `Jugador integrante`
* `String parentesco`

---

## 🖥️ 5. Aplicación de Simulación – AppMutxamelFC

Esta clase:

* Crea distintos integrantes.
* Los almacena en una lista común.
* Simula:

  * Entrenamientos
  * Viajes
  * Masajes
  * Goles
  * Celebraciones

Demuestra el uso real del polimorfismo y la jerarquía de clases.

---

## 🛠️ 6. Aplicación de Mantenimiento – AppMantenimiento

Permite gestionar jugadores desde consola. Segun las instrucciones solo he habilitado la primera opcion del menu principal que tiene las siguientes funcionalidades:

### Funcionalidades:

* Añadir jugador.
* Modificar datos (nombre, edad, categoría, dorsal, posición).
* Crear acompañantes (solo para jugadores SENIOR).
* Validar dorsales duplicados.
* Uso de `Scanner` para entrada de datos.

---


## 🎯 8. Conclusión

El proyecto demuestra una correcta aplicación de:

* Herencia
* Polimorfismo
* Interfaces
* Encapsulamiento
* Excepciones personalizadas
* Uso de colecciones (`ArrayList`)


---

