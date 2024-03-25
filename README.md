# Proyecto de Mazo de Cartas de Poker en Java

Por: Kevin Alejandro Leal Torres

A día: viernes, 15 de marzo de 2024

Para la materia: Computación con Java


Este proyecto simula un mazo de cartas de poker, permitiendo realizar operaciones como mezclar el mazo, mostrar la primera carta, seleccionar una carta al azar y obtener un conjunto de cinco cartas.

## Estructura del Proyecto
El proyecto consta de dos clases principales:

1. Card: Representa una carta individual de poker con atributos para el palo, color y valor.
2. Deck: Representa un mazo completo de cartas de poker, permitiendo realizar operaciones sobre el conjunto de cartas.

### Clase Card

La clase Card modela una carta de poker con tres atributos:

```java
private String suit;
```

El palo de la carta (tréboles, corazones, picas, diamantes).

```java
private String color;
```

El color de la carta (rojo para corazones y diamantes, negro para tréboles y picas).

```java
private String value;
```

El valor de la carta (numéricos del 2 al 10, A, J, Q, K).

### Clase Deck

La clase Deck inicializa un mazo estándar de 52 cartas de poker y proporciona las siguientes funcionalidades:

```java
public void shuffle()
```

Mezcla las cartas del mazo de manera aleatoria.

```java
public void head()
```

Muestra y elimina la primera carta del mazo.

```java
public void pick()
```

 Selecciona, muestra y elimina una carta aleatoria del mazo.

```java
public void hand()
```

Extrae, muestra y elimina un conjunto de cinco cartas del mazo.