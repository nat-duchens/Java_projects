# 🔄 Estructuras de Control Iterativas (Bucles) en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📚 Índice de Contenidos

- [🔍 Introducción](#-introducción)
- [🎯 Bucle FOR](#-bucle-for)
- [🔁 Bucle WHILE](#-bucle-while)
- [🔄 Bucle DO-WHILE](#-bucle-do-while)
- [🚀 FOR-EACH (Enhanced For)](#-for-each-enhanced-for)
- [⚡ Control de Flujo](#-control-de-flujo)
- [📊 Tabla Comparativa](#-tabla-comparativa)
- [💡 Buenas Prácticas](#-buenas-prácticas)
- [🔗 Referencias](#-referencias)

---

## 🔍 Introducción

Los **bucles** o **estructuras iterativas** en Java permiten ejecutar un bloque de código repetidamente mientras se cumpla una condición específica. Son fundamentales para automatizar tareas repetitivas y procesar colecciones de datos.

### ¿Por qué son importantes?
- ✅ Automatizan tareas repetitivas
- ✅ Procesan colecciones de datos eficientemente
- ✅ Reducen la duplicación de código
- ✅ Implementan algoritmos complejos
- ✅ Controlan la iteración sobre estructuras de datos

### Tipos de Bucles en Java
- **FOR**: Número conocido de iteraciones
- **WHILE**: Condición evaluada antes de cada iteración
- **DO-WHILE**: Condición evaluada después de cada iteración
- **FOR-EACH**: Iteración sobre colecciones y arrays

---

## 🎯 Bucle FOR

### 📖 Descripción

El bucle `for` es ideal cuando conoces de antemano el número de iteraciones que necesitas realizar. Es la estructura más utilizada para contar e iterar un número específico de veces.

### 🏗️ Sintaxis Básica

```java
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```

### 📋 Componentes del FOR

| Componente | Descripción | Obligatorio |
|------------|-------------|-------------|
| **Inicialización** | Se ejecuta una sola vez al inicio | No |
| **Condición** | Se evalúa antes de cada iteración | Sí |
| **Actualización** | Se ejecuta después de cada iteración | No |
| **Cuerpo** | Código que se repite | Sí |

### 🔧 Variantes del FOR

#### FOR Clásico
```java
for (int i = 0; i < 10; i++) {
    // Iteración controlada por contador
}
```

#### FOR con Múltiples Variables
```java
for (int i = 0, j = 10; i < j; i++, j--) {
    // Múltiples variables de control
}
```

#### FOR Infinito
```java
for (;;) {
    // Bucle infinito (cuidado!)
    // Debe tener break para salir
}
```

#### FOR con Condiciones Complejas
```java
for (int i = 1; i <= 100 && someCondition; i += 2) {
    // Condición múltiple y incremento personalizado
}
```

### 📊 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Scope de variables** | Variables declaradas en el for solo existen dentro del bucle |
| **Evaluación** | La condición se evalúa antes de cada iteración |
| **Componentes opcionales** | Inicialización y actualización son opcionales |
| **Performance** | Muy eficiente para iteraciones conocidas |

### 🎯 Casos de Uso Ideales

- ✅ Contar de 1 a N
- ✅ Iterar sobre arrays con índices
- ✅ Generar secuencias numéricas
- ✅ Algoritmos matemáticos con iteraciones definidas
- ✅ Procesar elementos en posiciones específicas

---

## 🔁 Bucle WHILE

### 📖 Descripción

El bucle `while` ejecuta un bloque de código **mientras** una condición sea verdadera. Es ideal cuando no sabes exactamente cuántas iteraciones necesitas, pero tienes una condición clara de parada.

### 🏗️ Sintaxis Básica

```java
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Pre-condición** | La condición se evalúa ANTES de ejecutar el cuerpo |
| **Puede no ejecutarse** | Si la condición es falsa desde el inicio, no se ejecuta |
| **Control manual** | Debes actualizar manualmente las variables de control |
| **Flexibilidad** | Muy flexible para condiciones complejas |

### 🔧 Variantes del WHILE

#### WHILE Básico
```java
int contador = 0;
while (contador < 10) {
    // Procesar
    contador++; // ¡Importante actualizar!
}
```

#### WHILE con Condiciones Complejas
```java
while (hasMoreData() && !errorOccurred() && attempts < maxAttempts) {
    // Múltiples condiciones
}
```

#### WHILE Infinito
```java
while (true) {
    // Bucle infinito controlado internamente
    if (exitCondition) {
        break;
    }
}
```

### 🎯 Casos de Uso Ideales

- ✅ Leer datos hasta encontrar un valor específico
- ✅ Procesar input del usuario hasta que ingrese "salir"
- ✅ Algoritmos de búsqueda
- ✅ Validación de entrada con reintentos
- ✅ Procesos que dependen de condiciones externas

### ⚠️ Precauciones con WHILE

- **Bucles infinitos**: Asegúrate de que la condición pueda volverse falsa
- **Actualización de variables**: Modifica las variables de control dentro del bucle
- **Condiciones complejas**: Mantén las condiciones claras y legibles

---

## 🔄 Bucle DO-WHILE

### 📖 Descripción

El bucle `do-while` es similar al `while`, pero con una diferencia crucial: **siempre ejecuta el cuerpo al menos una vez** porque la condición se evalúa después de la ejecución, no antes.

### 🏗️ Sintaxis Básica

```java
do {
    // Código que se ejecuta al menos una vez
} while (condición);
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Post-condición** | La condición se evalúa DESPUÉS de ejecutar el cuerpo |
| **Ejecución garantizada** | El cuerpo se ejecuta al menos una vez |
| **Semicolon obligatorio** | Requiere `;` después del while |
| **Menos común** | Se usa menos frecuentemente que while |

### 🔧 Estructura del DO-WHILE

#### DO-WHILE Básico
```java
int numero;
do {
    System.out.println("Ingresa un número (0 para salir):");
    numero = scanner.nextInt();
    // Procesar número
} while (numero != 0);
```

#### DO-WHILE con Validación
```java
String respuesta;
do {
    System.out.println("¿Deseas continuar? (s/n)");
    respuesta = scanner.nextLine().toLowerCase();
} while (!respuesta.equals("s") && !respuesta.equals("n"));
```

### 🆚 WHILE vs DO-WHILE

| Aspecto | WHILE | DO-WHILE |
|---------|-------|----------|
| **Evaluación** | Antes del cuerpo | Después del cuerpo |
| **Ejecución mínima** | 0 veces | 1 vez |
| **Uso común** | Más frecuente | Menos frecuente |
| **Casos típicos** | Validación previa | Menús, validación post-proceso |

### 🎯 Casos de Uso Ideales

- ✅ Menús de usuario (mostrar al menos una vez)
- ✅ Validación de entrada (pedir input al menos una vez)
- ✅ Juegos (jugar al menos una partida)
- ✅ Confirmaciones de usuario
- ✅ Procesos que requieren ejecución inicial

---

## 🚀 FOR-EACH (Enhanced For)

### 📖 Descripción

El bucle `for-each`, también conocido como **Enhanced For Loop**, es una versión simplificada del bucle for diseñada específicamente para iterar sobre colecciones y arrays sin necesidad de manejar índices manualmente.

### 🏗️ Sintaxis Básica

```java
for (TipoDato elemento : colecciónOArray) {
    // Usar elemento en cada iteración
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Sin índices** | No necesitas manejar contadores manualmente |
| **Solo lectura** | Ideal para recorrer, no para modificar |
| **Más legible** | Código más limpio y fácil de leer |
| **Menos errores** | Elimina errores de índice fuera de rango |

### 🔧 Variantes del FOR-EACH

#### Con Arrays
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```

#### Con Collections
```java
List<String> nombres = Arrays.asList("Ana", "Juan", "María");
for (String nombre : nombres) {
    System.out.println(nombre);
}
```

#### Con Objetos Complejos
```java
List<Persona> personas = getPersonas();
for (Persona persona : personas) {
    System.out.println(persona.getNombre());
}
```

### 🆚 FOR vs FOR-EACH

| Aspecto | FOR Tradicional | FOR-EACH |
|---------|----------------|----------|
| **Sintaxis** | Más verbosa | Más concisa |
| **Índices** | Acceso a índices | Sin acceso a índices |
| **Modificación** | Puede modificar elementos | Solo lectura recomendada |
| **Performance** | Ligeramente más rápido | Muy similar |
| **Legibilidad** | Menos legible | Más legible |

### 🎯 Casos de Uso Ideales

- ✅ Recorrer arrays completos
- ✅ Iterar sobre Collections (List, Set, etc.)
- ✅ Procesar todos los elementos de una estructura
- ✅ Operaciones de solo lectura
- ✅ Código más limpio y mantenible

### ⚠️ Limitaciones del FOR-EACH

- ❌ No puedes obtener el índice actual
- ❌ No puedes modificar la estructura durante la iteración
- ❌ No puedes iterar hacia atrás
- ❌ No funciona con iteraciones parciales

---

## ⚡ Control de Flujo

### 🛑 Declaración BREAK

La declaración `break` se utiliza para **salir inmediatamente** de un bucle, sin importar si la condición del bucle sigue siendo verdadera.

#### Sintaxis
```java
break;
```

#### Características
- ✅ Sale del bucle más interno
- ✅ Continúa con la siguiente instrucción después del bucle
- ✅ Puede usarse con etiquetas para bucles anidados

### ⏭️ Declaración CONTINUE

La declaración `continue` **salta la iteración actual** y continúa con la siguiente iteración del bucle.

#### Sintaxis
```java
continue;
```

#### Características
- ✅ Omite el resto del código en la iteración actual
- ✅ Evalúa la condición del bucle para la siguiente iteración
- ✅ Puede usarse con etiquetas

### 🏷️ Etiquetas (Labels)

Las etiquetas permiten controlar bucles anidados específicos con `break` y `continue`.

#### Sintaxis
```java
etiqueta:
for (...) {
    for (...) {
        if (condición) {
            break etiqueta; // Sale del bucle exterior
        }
        if (otraCondición) {
            continue etiqueta; // Continúa en el bucle exterior
        }
    }
}
```

### 📊 Comparación de Control de Flujo

| Declaración | Efecto | Scope |
|-------------|--------|-------|
| **break** | Sale del bucle | Bucle actual |
| **continue** | Salta a la siguiente iteración | Bucle actual |
| **break label** | Sale del bucle etiquetado | Bucle específico |
| **continue label** | Continúa en el bucle etiquetado | Bucle específico |

---

## 📊 Tabla Comparativa

### Comparación de Todos los Bucles

| Bucle | Cuándo Usar | Pre/Post Condición | Ejecución Mínima | Complejidad |
|-------|-------------|-------------------|------------------|-------------|
| **FOR** | Iteraciones conocidas | Pre-condición | 0 veces | Baja |
| **WHILE** | Condición variable | Pre-condición | 0 veces | Baja |
| **DO-WHILE** | Al menos una ejecución | Post-condición | 1 vez | Baja |
| **FOR-EACH** | Recorrer colecciones | Automática | Depende del tamaño | Muy Baja |

### Rendimiento y Eficiencia

| Bucle | Performance | Memoria | Legibilidad | Mantenimiento |
|-------|-------------|---------|-------------|---------------|
| **FOR** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ |
| **WHILE** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐ |
| **DO-WHILE** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐ |
| **FOR-EACH** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ |

### Casos de Uso Recomendados

| Escenario | Bucle Recomendado | Razón |
|-----------|-------------------|-------|
| Contar de 1 a N | FOR | Iteraciones conocidas |
| Leer hasta EOF | WHILE | Condición variable |
| Menú de usuario | DO-WHILE | Al menos una ejecución |
| Recorrer array | FOR-EACH | Sintaxis más limpia |
| Búsqueda en lista | WHILE | Puede terminar antes |
| Validar entrada | DO-WHILE | Pedir al menos una vez |

---

## 💡 Buenas Prácticas

### 🎯 Principios Generales

#### 1. **Elegir el Bucle Correcto**
- **FOR**: Cuando conoces el número de iteraciones
- **WHILE**: Para condiciones complejas o variables
- **DO-WHILE**: Cuando necesitas ejecutar al menos una vez
- **FOR-EACH**: Para recorrer colecciones completamente

#### 2. **Nombres de Variables Descriptivos**
```java
// ❌ Evitar nombres genéricos
for (int i = 0; i < students.length; i++) {
    // ¿Qué representa 'i'?
}

// ✅ Usar nombres descriptivos
for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
    // Claro que es un índice de estudiante
}

// ✅ Mejor aún con for-each
for (Student student : students) {
    // Muy claro y legible
}
```

#### 3. **Evitar Bucles Infinitos**
```java
// ❌ Peligroso: puede ser infinito
int i = 0;
while (i < 10) {
    System.out.println(i);
    // ¡Olvidaste incrementar i!
}

// ✅ Asegurar progreso hacia la condición de salida
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++; // Progreso garantizado
}
```

### 🔧 Optimizaciones de Performance

#### 1. **Cachear el Tamaño de Collections**
```java
// ❌ Ineficiente: llama size() en cada iteración
for (int i = 0; i < lista.size(); i++) {
    // Procesamiento
}

// ✅ Eficiente: cachea el tamaño
int tamaño = lista.size();
for (int i = 0; i < tamaño; i++) {
    // Procesamiento
}

// ✅ Mejor aún: usa for-each
for (Elemento elemento : lista) {
    // Procesamiento
}
```

#### 2. **Minimizar Trabajo Dentro del Bucle**
```java
// ❌ Cálculo repetitivo dentro del bucle
for (int i = 0; i < 1000; i++) {
    double result = Math.sqrt(25) * someArray[i]; // sqrt(25) se calcula 1000 veces
}

// ✅ Precalcular valores constantes
double sqrtConstant = Math.sqrt(25);
for (int i = 0; i < 1000; i++) {
    double result = sqrtConstant * someArray[i];
}
```

### 🚫 Errores Comunes

#### 1. **Off-by-One Errors**
```java
// ❌ Error común: índice fuera de rango
int[] array = new int[10];
for (int i = 0; i <= array.length; i++) { // ¡i <= es incorrecto!
    array[i] = i; // IndexOutOfBoundsException
}

// ✅ Correcto
for (int i = 0; i < array.length; i++) {
    array[i] = i;
}
```

#### 2. **Modificar Collections Durante Iteración**
```java
// ❌ ConcurrentModificationException
List<String> lista = new ArrayList<>();
for (String item : lista) {
    if (shouldRemove(item)) {
        lista.remove(item); // ¡Error!
    }
}

// ✅ Usar Iterator
Iterator<String> iterator = lista.iterator();
while (iterator.hasNext()) {
    String item = iterator.next();
    if (shouldRemove(item)) {
        iterator.remove(); // Correcto
    }
}
```

#### 3. **Anidar Bucles Innecesariamente**
```java
// ❌ Ineficiente: O(n²)
for (String item1 : lista) {
    for (String item2 : lista) {
        if (item1.equals(item2)) {
            // Encontrar duplicados
        }
    }
}

// ✅ Más eficiente: O(n) con Set
Set<String> vistos = new HashSet<>();
for (String item : lista) {
    if (!vistos.add(item)) {
        // Es duplicado
    }
}
```

### 📏 Convenciones de Código

#### 1. **Sangría y Formato**
```java
// ✅ Formato consistente
for (int i = 0; i < 10; i++) {
    if (condition) {
        doSomething();
    }
}
```

#### 2. **Límites de Complejidad**
- Máximo 3 niveles de anidación
- Bucles de más de 20 líneas considerar extraer métodos
- Condiciones complejas extraer a métodos con nombres descriptivos

---

## 🔗 Referencias

### 📚 Documentación Oficial
- [Oracle Java Documentation - Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java Language Specification - Iteration Statements](https://docs.oracle.com/javase/specs/jls/se17/html/jls-14.html#jls-14.12)

### 🎓 Recursos de Aprendizaje
- [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- [Clean Code by Robert C. Martin](https://www.pearson.com/store/p/clean-code-a-handbook-of-agile-software-craftsmanship/P100000149326)
- [Effective Java by Joshua Bloch](https://www.pearson.com/store/p/effective-java/P100000149326)

### 📖 Lecturas Adicionales
- [Java Performance Tuning](https://www.oreilly.com/library/view/java-performance-tuning/059600015X/)
- [Algorithms in Java](https://algs4.cs.princeton.edu/home/)

---

## 📝 Notas Finales

> **Recuerda**: Los bucles son herramientas poderosas que pueden hacer tu código más eficiente, pero también pueden crear problemas de rendimiento si se usan incorrectamente. La clave está en elegir el bucle adecuado para cada situación y seguir las mejores prácticas.
