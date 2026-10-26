Preguntas
1. ¿Qué guarda una variable int y qué guarda una variable Libro?
2. ¿Por qué prestar con l2 cambió l1 pero no l3?
3. ¿Por qué el compilador no detectó la NullPointerException?
4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?
5. ¿Qué invariantes protege Libro y cómo las protege?

   Respuestas

1. ¿Qué guarda una variable int y qué guarda una variable Libro?
Un int funciona como una cajita que guarda directamente el número entero (por ejemplo, el 5), mientras que una variable Libro actúa como un papelito con la dirección de memoria exacta (el heap) de dónde vive el objeto real.

2. ¿Por qué prestar con l2 cambió l1 pero no l3?
Pasa porque l1 y l2 compartían la misma dirección de memoria (apuntaban al mismo libro), así que un cambio hecho por uno se reflejaba automáticamente en el otro. En cambio, l3 nació de un new completamente independiente, teniendo su propio espacio en la memoria y librándose de ese efecto.

3. ¿Por qué el compilador no detectó la NullPointerException?
Porque el compilador se encarga de revisar la sintaxis y los tipos antes de correr, pero no es adivino. No puede predecir qué camino va a tomar el programa en tiempo de ejecución, que es el momento exacto en el que el error explota si intentas usar algo que apunta a la nada (null).

4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?
Modificar los atributos del objeto que llega por parámetro sí afecta al original porque seguimos manipulando el objeto real en la memoria. En cambio, crear un new y asignárselo directamente al parámetro solo cambia a dónde apunta esa variable local dentro de la función, dejando al objeto que venía de afuera totalmente intacto.

5.¿Qué invariantes protege Libro y cómo las protege?
Protege las reglas lógicas del negocio (como evitar que un libro tenga títulos vacíos o datos absurdos). Lo logra gracias a la encapsulación: mantiene los atributos ocultos (private) y pone filtros de validación para controlar qué información entra y qué sale.
