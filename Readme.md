# Annalyn's Infiltration

## Descripción

En este ejercicio, implementarás la lógica de la misión para un nuevo juego de rol que un amigo está desarrollando. El personaje principal del juego es **Annalyn**, una valiente niña con un perro leal. Desafortunadamente, ocurre un desastre, ya que su mejor amiga fue secuestrada mientras buscaba bayas en el bosque. Annalyn intentará encontrar y liberar a su mejor amiga, opcionalmente llevando a su perro con ella en esta misión.

Después de seguir el rastro de su mejor amiga, encuentra el campamento en el que está prisionera. Resulta que hay dos secuestradores: un **caballero poderoso** y un **arquero astuto**.

Habiendo encontrado a los secuestradores, Annalyn considera cuáles de las siguientes acciones puede realizar:

- **Ataque rápido**: un ataque rápido puede hacerse si el caballero está durmiendo, ya que le toma tiempo ponerse su armadura, por lo que será vulnerable.

- **Espiar**: el grupo puede ser espiado si al menos uno de ellos está despierto. De lo contrario, espiar es una pérdida de tiempo.

- **Señalizar al prisionero**: el prisionero puede ser señalizado utilizando sonidos de pájaros si el prisionero está despierto y el arquero está durmiendo, ya que los arqueros están entrenados en la señalización de aves, por lo que podrían interceptar el mensaje.

- **Liberar al prisionero**: Annalyn puede intentar infiltrarse en el campamento para liberar al prisionero. Esto es arriesgado y solo puede tener éxito de dos maneras:
    - Si Annalyn tiene a su perro con ella, puede rescatar al prisionero si el arquero está dormido. El caballero le teme al perro y el arquero no tendrá tiempo para prepararse antes de que Annalyn y el prisionero puedan escapar.
    - Si Annalyn no tiene a su perro, entonces ella y el prisionero deben ser muy sigilosos. Annalyn puede liberar al prisionero si este está despierto y tanto el caballero como el arquero están dormidos, pero si el prisionero está durmiendo no podrá ser rescatado: el prisionero se asustaría por la repentina aparición de Annalyn y despertaría al caballero y al arquero.

## Tareas

Tienes cuatro tareas: implementar la lógica para determinar si las acciones anteriores están disponibles según el estado de los tres personajes encontrados en el bosque y si el perro de Annalyn está presente o no.

1. **Verificar si se puede realizar un ataque rápido**  
Implementa el método estático `AnnalynsInfiltration.canFastAttack()` que toma un valor booleano que indica si el caballero está despierto. Este método devuelve `true` si se puede realizar un ataque rápido basado en el estado del caballero. De lo contrario, devuelve `false`:

    ```java
    boolean knightIsAwake = true;
    AnnalynsInfiltration.canFastAttack(knightIsAwake);
    // => false
    ```

2. **Verificar si el grupo puede ser espiado**  
Implementa el método estático `AnnalynsInfiltration.canSpy()` que toma tres valores booleanos, indicando si el caballero, el arquero y el prisionero, respectivamente, están despiertos. El método devuelve `true` si el grupo puede ser espiado, basado en el estado de los tres personajes. De lo contrario, devuelve `false`:

    ```java
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
    // => true
    ```

3. **Verificar si se puede señalizar al prisionero**  
Implementa el método estático `AnnalynsInfiltration.canSignalPrisoner()` que toma dos valores booleanos, indicando si el arquero y el prisionero, respectivamente, están despiertos. El método devuelve `true` si el prisionero puede ser señalizado, basado en el estado de los dos personajes. De lo contrario, devuelve `false`:

    ```java
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
    // => true
    ```

4. **Verificar si se puede liberar al prisionero**  
Implementa el método estático `AnnalynsInfiltration.canFreePrisoner()` que toma cuatro valores booleanos. Los primeros tres parámetros indican si el caballero, el arquero y el prisionero, respectivamente, están despiertos. El último parámetro indica si el perro de Annalyn está presente. El método devuelve `true` si el prisionero puede ser liberado basado en el estado de los tres personajes y la presencia del perro de Annalyn. De lo contrario, devuelve `false`:

    ```java
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
    // => false
    ```

## Fuente

[Annalyn's Infiltration - Exercism](https://exercism.org/tracks/java/exercises/annalyns-infiltration)
