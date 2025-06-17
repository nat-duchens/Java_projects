# Bucles en Java: for, while y do-while

## ¿Qué son los bucles?

Los bucles son estructuras de control que nos permiten repetir un bloque de código múltiples veces. En Java tenemos tres tipos principales: `for`, `while` y `do-while`.

---

## 1. BUCLE FOR

### Estructura básica
```java
for (inicialización; condición; incremento/decremento) {
    // código a repetir
}
```

### ¿Cuándo usarlo?
- Cuando sabemos **exactamente cuántas veces** queremos repetir algo
- Para contar o iterar un número específico de veces
- Cuando necesitamos un contador

### ¿Cómo salgo del bucle?
- Automáticamente cuando la condición se vuelve `false`
- Manualmente con `break`

### Ejemplos

#### Uso Simple
```java
// Imprimir números del 1 al 5
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

#### Uso Intermedio
```java
// Calcular la suma de números del 1 al 10
int suma = 0;
for (int i = 1; i <= 10; i++) {
    suma = suma + i;
    System.out.println("Iteración " + i + ", suma actual: " + suma);
}
System.out.println("Suma total: " + suma);
```

#### Uso Avanzado
```java
// Tabla de multiplicar con bucles anidados
for (int tabla = 1; tabla <= 3; tabla++) {
    System.out.println("--- Tabla del " + tabla + " ---");
    for (int multiplicador = 1; multiplicador <= 5; multiplicador++) {
        int resultado = tabla * multiplicador;
        System.out.println(tabla + " x " + multiplicador + " = " + resultado);
    }
    System.out.println(); // línea en blanco
}
```

---

## 2. BUCLE WHILE

### Estructura básica
```java
while (condición) {
    // código a repetir
}
```

### ¿Cuándo usarlo?
- Cuando **NO sabemos exactamente** cuántas veces se repetirá
- Cuando la repetición depende de una condición que puede cambiar
- Para validar entrada de datos
- Para buscar algo específico

### ¿Cómo salgo del bucle?
- Cuando la condición se vuelve `false`
- Manualmente con `break`

### Ejemplos

#### Uso Simple
```java
// Contar hasta 3
int contador = 1;
while (contador <= 3) {
    System.out.println("Vuelta número: " + contador);
    contador++; // ¡IMPORTANTE! Sin esto, bucle infinito
}
```

#### Uso Intermedio
```java
// Adivinar un número
int numeroSecreto = 7;
int intento = 0;
boolean adivinado = false;

while (!adivinado) {
    intento++;
    int miNumero = (int)(Math.random() * 10) + 1; // número aleatorio 1-10
    System.out.println("Intento " + intento + ": " + miNumero);
    
    if (miNumero == numeroSecreto) {
        adivinado = true;
        System.out.println("¡Adivinaste en " + intento + " intentos!");
    }
}
```

#### Uso Avanzado
```java
// Simulador de cuenta bancaria
double saldo = 1000.0;
int dia = 1;

while (saldo > 0 && dia <= 30) {
    double gastoDelDia = Math.random() * 100; // gasto aleatorio hasta 100
    saldo = saldo - gastoDelDia;
    
    System.out.println("Día " + dia + ": Gastaste $" + 
                      String.format("%.2f", gastoDelDia) + 
                      ", Saldo: $" + String.format("%.2f", saldo));
    
    if (saldo <= 0) {
        System.out.println("¡Te quedaste sin dinero el día " + dia + "!");
    }
    
    dia++;
}
```

---

## 3. BUCLE DO-WHILE

### Estructura básica
```java
do {
    // código a repetir
} while (condición);
```

### ¿Cuándo usarlo?
- Cuando necesitas que el código se ejecute **AL MENOS UNA VEZ**
- Para menús que deben mostrarse mínimo una vez
- Para validaciones que requieren al menos un intento

### ¿Cómo salgo del bucle?
- Cuando la condición se vuelve `false` (se evalúa DESPUÉS de ejecutar)
- Manualmente con `break`

### Ejemplos

#### Uso Simple
```java
// Mostrar un mensaje al menos una vez
int numero = 10;
do {
    System.out.println("Este mensaje se muestra al menos una vez");
    numero++;
} while (numero < 10); // Aunque la condición es falsa desde el inicio
```

#### Uso Intermedio
```java
// Simulador de menú simple
int opcion;
do {
    System.out.println("=== MENÚ ===");
    System.out.println("1. Saludar");
    System.out.println("2. Despedirse");
    System.out.println("3. Salir");
    System.out.print("Elige una opción: ");
    
    // Simulamos que el usuario elige (en la realidad usarías Scanner)
    opcion = (int)(Math.random() * 4) + 1; // número aleatorio 1-4
    System.out.println(opcion);
    
    if (opcion == 1) {
        System.out.println("¡Hola! ¿Cómo estás?");
    } else if (opcion == 2) {
        System.out.println("¡Hasta luego!");
    } else if (opcion == 3) {
        System.out.println("Saliendo del programa...");
    } else {
        System.out.println("Opción no válida");
    }
    
    System.out.println(); // línea en blanco
    
} while (opcion != 3);
```

#### Uso Avanzado
```java
// Validador de contraseña con múltiples intentos
String contraseñaCorrecta = "java123";
String intento = "";
int intentos = 0;
int maxIntentos = 3;
boolean accesoConcedido = false;

do {
    intentos++;
    System.out.println("Intento " + intentos + " de " + maxIntentos);
    
    // Simulamos diferentes intentos de contraseña
    String[] posiblesIntentos = {"123", "password", "java123", "admin"};
    intento = posiblesIntentos[(int)(Math.random() * posiblesIntentos.length)];
    System.out.println("Probando contraseña: " + intento);
    
    if (intento.equals(contraseñaCorrecta)) {
        accesoConcedido = true;
        System.out.println("¡Acceso concedido!");
    } else {
        System.out.println("Contraseña incorrecta");
        if (intentos < maxIntentos) {
            System.out.println("Te quedan " + (maxIntentos - intentos) + " intentos");
        }
    }
    
    System.out.println();
    
} while (!accesoConcedido && intentos < maxIntentos);

if (!accesoConcedido) {
    System.out.println("Acceso denegado. Has agotado todos los intentos.");
}
```

---

## ¿Cuál bucle usar según el caso?

| Situación | Bucle recomendado | Razón |
|-----------|-------------------|-------|
| Contar del 1 al 100 | **for** | Sabemos exactamente cuántas iteraciones |
| Mostrar un menú hasta que elijan "salir" | **do-while** | Debe mostrarse al menos una vez |
| Buscar un número en una secuencia | **while** | No sabemos cuándo lo encontraremos |
| Repetir hasta que el usuario ingrese datos válidos | **do-while** | Debe intentar al menos una vez |
| Calcular factorial de un número | **for** | Sabemos cuántas multiplicaciones hacer |
| Leer datos hasta encontrar un valor específico | **while** | La condición puede ser falsa desde el inicio |

---

## Consejos importantes

### ⚠️ Evita bucles infinitos
```java
// ❌ MAL - Bucle infinito
int i = 1;
while (i <= 5) {
    System.out.println(i);
    // ¡Olvidé incrementar i!
}

// ✅ BIEN
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++; // Incremento la variable
}
```

### 💡 Usa nombres descriptivos
```java
// ❌ No muy claro
for (int i = 0; i < 10; i++) {
    // código
}

// ✅ Más claro
for (int numeroEstudiante = 1; numeroEstudiante <= 10; numeroEstudiante++) {
    System.out.println("Procesando estudiante " + numeroEstudiante);
}
```

### 🎯 Elige el bucle correcto
- **for**: Cuando sabes cuántas veces
- **while**: Cuando no sabes cuántas veces
- **do-while**: Cuando necesitas al menos una ejecución

---

## Resumen rápido

- **FOR**: Perfecto para contar y cuando conoces el número de iteraciones
- **WHILE**: Ideal cuando la repetición depende de una condición variable
- **DO-WHILE**: Único que garantiza al menos una ejecución

¡Con estos bucles puedes resolver la mayoría de problemas de repetición en programación!