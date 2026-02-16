# 📘 Informe de Práctica – Sistema de Métodos de Pago en Java

---

## 1. Objetivo de la práctica

Desarrollar un sistema de pago en **Java** aplicando:

* ✅ Programación Orientada a Objetos (POO)
* ✅ Herencia
* ✅ Polimorfismo
* ✅ Clases abstractas
* ✅ Validaciones básicas
* ✅ Uso de `Scanner` para entrada por teclado
* ✅ Uso de `Random`
* ✅ Uso de anotaciones **Lombok**

El sistema simula una tienda online donde el usuario puede pagar mediante:

* Tarjeta de Crédito
* PayPal
* Bizum

---

## 2. Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

```
MetodoPago (abstracta)
│
├── TarjetaCredito
├── Paypal
├── Bizum
│
└── Tienda (clase principal)
```

---

## 3. Explicación Técnica del Código

---

## 🔹 3.1 Clase Abstracta `MetodoPago`

```java
public abstract class MetodoPago {
    public abstract void procesarPago(double importe);
}
```

### ✔ Función

* Define un **contrato común** para todos los métodos de pago.
* Obliga a las clases hijas a implementar `procesarPago()`.

### ✔ Concepto aplicado

👉 **Polimorfismo**

Permite tratar todos los métodos de pago como objetos del tipo `MetodoPago`.

---

## 🔹 3.2 Clase `TarjetaCredito`

Extiende de `MetodoPago`.

### ✔ Atributos

* `nro_tarjeta`
* `tipo`
* `tipos_validos` (VISA, MASTERCARD, MAESTRO)

### ✔ Métodos importantes

#### `validarTarjeta()`

Valida:

* Que el número tenga 16 dígitos.
* Que el tipo sea válido.

#### `procesarPago()`

Muestra mensaje de pago procesado.

### ✔ Conceptos aplicados

* Herencia
* Encapsulamiento
* Uso de arrays
* Comparación de Strings (`equalsIgnoreCase`)

---

## 🔹 3.3 Clase `Paypal`

Extiende de `MetodoPago`.

### ✔ Atributos

* `cuenta`
* `saldo` (inicializado en 23€)

### ✔ Validación

```java
cuenta.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")
```

Valida:

* Formato de email Gmail
* Que el saldo sea suficiente

### ✔ Conceptos aplicados

* Expresiones regulares
* Validación lógica
* Sobrescritura de métodos (`@Override`)

---

## 🔹 3.4 Clase `Bizum`

Extiende de `MetodoPago`.

### ✔ Atributos

* `telefono`
* `pin`

### ✔ Funcionalidad clave

* Genera un PIN aleatorio de 6 dígitos
* Valida que el PIN introducido coincida

```java
random.nextInt(900000) + 100000;
```

### ✔ Conceptos aplicados

* Uso de `Random`
* Seguridad básica
* Comparación de datos

---

## 🔹 3.5 Clase `Tienda` (Clase Principal)

Gestiona:

* Selección del método de pago
* Validaciones
* Llamada al método polimórfico `realizarPago()`

### ✔ Método clave

```java
public static void realizarPago(MetodoPago metodo, double importe)
```

Aquí se aplica **polimorfismo real**, ya que:

* Recibe un objeto `MetodoPago`
* Ejecuta `procesarPago()` sin importar el tipo real

---

# 4. Flujo de Ejecución

1. El usuario elige método de pago.
2. Se solicitan datos.
3. Se valida.
4. Si es correcto → se procesa pago.
5. Se muestra confirmación.

---

# 5. Conceptos de POO Aplicados

| Concepto        | Aplicación en el proyecto                |
| --------------- | ---------------------------------------- |
| Abstracción     | Clase `MetodoPago`                       |
| Herencia        | Todas las clases heredan de `MetodoPago` |
| Polimorfismo    | Método `realizarPago()`                  |
| Encapsulamiento | Uso de getters/setters                   |
| Sobrescritura   | `@Override procesarPago()`               |

---

# 6. Pasos para Realizar la Práctica

---

## ✅ Paso 1 – Crear el Proyecto

En IntelliJ o VS Code:

* Nuevo proyecto Java
* Añadir dependencia de **Lombok**

Si usas Maven:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>
```

---

## ✅ Paso 2 – Crear la clase abstracta

* Crear `MetodoPago`
* Declarar método abstracto `procesarPago(double importe)`

---

## ✅ Paso 3 – Crear las clases hijas

Crear:

* `TarjetaCredito`
* `Paypal`
* `Bizum`

Cada una debe:

* Extender de `MetodoPago`
* Implementar `procesarPago()`
* Incluir método de validación propio

---

## ✅ Paso 4 – Crear clase `Tienda`

* Añadir `Scanner`
* Implementar menú con `switch`
* Instanciar objeto según opción
* Validar antes de pagar

---

## ✅ Paso 5 – Implementar método polimórfico

```java
public static void realizarPago(MetodoPago metodo, double importe)
```

Debe:

* Verificar que no sea null
* Ejecutar `procesarPago()`

---

## ✅ Paso 6 – Probar el Programa

Probar:

* Tarjeta válida e inválida
* Paypal con saldo suficiente e insuficiente
* Bizum con PIN correcto e incorrecto
* Método no existente

---

# 7. Posibles Mejoras

* Quitar el "[CHIVATO PIN]" (solo para pruebas)
* Añadir excepción personalizada
* Guardar pagos en una lista
* Simular descuento de saldo real
* Añadir interfaz gráfica

---

# 8. Conclusión

Esta práctica permite comprender de forma clara:

* Cómo diseñar una jerarquía de clases.
* Cómo usar polimorfismo correctamente.
* Cómo estructurar un programa realista.
* Cómo separar responsabilidades por clases.

Es una práctica ideal para consolidar:

✔ POO
✔ Diseño limpio
✔ Buen uso de herencia
✔ Validaciones básicas

---

Si quieres, puedo generarte una versión más técnica (nivel memoria de proyecto) o una versión más simple para entregar como práctica de clase.
