# Cerveceria

Cuantos consumidores se necesita para que el stock llegue a 0?

Se necesitan 2 consumidores, suponiendo que haya un solo productor.

Bloques synchronized, por que deben serlos?

En el caso de los productores, debe ser synchronized para que no agreguen mas cervezas del stock permitido(100).
En el caso de los consumidores, debe ser synchronized para que no tomen mas cervezas de las que hay en el stock.

Recurso compartido:
El recurso compartido es la cerveza, que se encuentra en la pila de stock de la clase BeerHouse. 
Este recurso es agregado por el/los productor/es de la clase BeerProducer y es tomado por el/los consumidor/es de la clase BeerConsumer.
El productor deja de agregar y espera, cuando el stock llega a 100; y espera la notificacion de alguno de los consumidores.
El consumidor deja de tomar y espera, cuando el stock llega a 0; y espera la notificacion de alguno de los productores.

Explica las 3 formas de instanciar un Thread:

Hay dos formas de hacer una tarea correr concurrentemente con otra: crear una nueva clase como subclase de la clase Thread o declarar 
una clase e implementar la interfaz Runnable.

(Editado)
La tercera forma de instanciar un thread es hacer directamente Thread hilo = new Thread().

Uso de Subclase
Cuando se crea una subclase de Thread, la subclase debería definir su propio método run() para sobre montar el método run() de la  
clase Thread. La tarea concurrente es desarrollada en este método run().

Ejecución del método run()
Una instancia de la subclase es creada con new, luego llamamos al método start() de la thread para hacer que la máquina virtual Java 
ejecute el método run(). Ojo para iniciar la concurrencia invocamos a start(), así invocamos a run() en forma indirecta. Si 
invocamos a run() directamente, se comportará como el llamado a cualquier método llamado dentro de un mismo 
hilo (sin crear uno independiente).

Implementación de la Interfaz Runnable
La interfaz Runnable requiere que sólo un método sea implementado, el método run(). Primero creamos una instancia de esta clase 
con new, luego creamos una instancia de Thread con otra sentencia new y usamos el objeto recién creado en el constructor. 
Finalmente, llamamos el método start() de la instancia de Thread para iniciar la tarea definida en el método run().
