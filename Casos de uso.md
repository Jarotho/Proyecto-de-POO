# Casos de uso

***Caso de uso No.1***

|Caso de uso| Registro de usuario |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Registrar al usuario |
|Resumen| El usuario entra por primera vez al juego, crea su cuenta. |

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa por primera vez al sistema, este le muestra en pantalla los campos requeridos para crear una cuenta. |
|2| El usuario ingresa un ID y una contraseña con su confrimación en los campos solicitados. |
|3| El sistema muestra el menú principal donde el usuario puede seleccionar diversas acciones. |
|4| El usuario sale de la aplicación. |
|Postcondición| La información del usuario se guardará en la base de datos. | 

|Excepciones| |
|---|---|
|1| El usuario ingresa un ID que ya está en uso. Este será denegado, por lo que deberá ingresar uno que no esté en la base de datos.  |
|2| El usuario ingresa un ID que contiene caracteres como “@” o “#”. Este ID será invalido. |
|3| El usuario ingresa un ID que contiene menos de tres caracteres. Este no será permitido|
|4| El usuario cierra la aplicación sin finalizar el registro, por lo que tendrá que completarlo la próxima vez que ejecute la aplicación. |


***Caso de uso No.2***

|Caso de uso| Escoger un personaje para responder preguntas sobre dicho personaje |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario inicie una sesión de juego. |
|Resumen| El usuario ingresa a la aplicación, escoge un personaje y responde la ronda de preguntas relacionadas al seleccionado. |
|Precondición| El usuario debe tener una cuenta creada. |

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa a la aplicación. |
|2| El sistema muestra el menú principal. |
|3| El usuario selecciona la opción “jugar”. |
|4| El sistema muestra todos los personajes. |
|5| El usuario escoge un personaje. |
|6| El usuario comienza a responder el cuestionario. |
|7| El usuario concluye la ronda de preguntas. |
|8| El sistema le muestra en pantalla su experiencia generada con base en las preguntas respondidas correctamente. |
|9| El usuario regresa a la sección de personajes. |
|10| El usuario elige volver al menú|
|11| El usuario sale de la aplicación. |
|Postcondición| La experiencia obtenida de las preguntas se guardarán en la base de datos para poder desbloquear trofeos. | 

|excepciones| |
|---|---|
|1| El sistema le indica al usuario que no obtuvo cierta cantidad de 'Experiencia' pues el usuario no respondió correctamente al menos, el 80% de las preguntas. |
|2| En caso de que el usuario cierre la aplicación mientras está respondiendo el cuestionario, no se guardará su progreso, por lo que el usuario tendrá que iniciar desde cero el cuestionario cuando vuelva a jugar.  |



***Caso de uso No.3***

|Caso de uso| Visualizar el Álbum |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario observe información y datos curiosos del personaje, al igual que sus trofeos |
|Resumen| El usuario al haber obtenido cierta cantidad de 'Experiencia' puede desbloquear trofeos de un personaje (la figura) desde el “álbum de personajes” e ir ampliando su colección.
|Precondición| Haber obtenido un mínimo de experiencia de un personaje. | 

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa al menú principal. |
|2| Selecciona la opción “Álbum de personajes”. |
|3| Selecciona un personaje. |
|4| El usuario visualiza sus habilidades y sus trofeos |
|5| El usuario regresa al menú principal y abandona la aplicación. |
|Postcondición| La base de datos registra que el usuario desbloqueó un trofeo. | 

|excepciones| |
|---|---|
|1| El usuario intenta ver en el album un trofeo de un personaje que aún no ha llegado a a la experiencia requerida, por lo que el sistema rechazará esta petición.|


***Caso de uso No.4***

|Caso de uso| Visualizar el ranking  |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario visualice el ranking de los jugadores con mayor experiencia acumulada. |
|Resumen| El usuario quiere ver los jugadores con mayor experiencia acumulada así que entra al ranking.|
|Precondición| El usuario debe tener una cuenta creada. | 

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa al menú principal. |
|2| Selecciona la opción “Ranking”. |
|3| El sistema muestra en pantalla la lista de los jugadores con más experiencia acumulada. |
|4| El usuario regresa hacia el menú principal y abandona la aplicación. |
|Postcondición| Ninguna. | 

|excepciones| |
|---|---|
|1| Ninguna.|

