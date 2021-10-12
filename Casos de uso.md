# Casos de uso

***Caso de uso No.1***

|Caso de uso| Registro de usuario |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Registrar al usuario |
|Resumen| El usuario entra por primera vez al juego, crea su cuenta y completa el tutorial. |

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa por primera vez al sistema, este le muestra en pantalla los campos requeridos para crear una cuenta. |
|2| El usuario ingresa un ID y una contraseña en los campos solicitados. |
|3| El sistema ejecuta el tutorial para un nuevo usuario. |
|4| El usuario completa el tutorial de inicio. |
|5| El sistema muestra el menú principal donde el usuario puede seleccionar diversas acciones. |
|6| El usuario sale de la aplicación. |
|Postcondición| La información del usuario se guardará en la base de datos. | 

|Excepciones| |
|---|---|
|1|El usuario puede ingresar un ID que ya esté en uso, por lo que deberá ingresar uno que este desocupado o libre.  |
|2| El usuario ingresa un ID que contiene caracteres como “@” o “#”. Este ID será invalido. |
|3| El usuario cierra la aplicación sin finalizar el registro, por lo que tendrá que completarlo la próxima vez que ejecute la aplicación. |
|4| El usuario cierra la aplicación sin finalizar el tutorial, por lo que tendrá que completarlo la próxima vez que inicie el juego con su cuenta. |


***Caso de uso No.2***

|Caso de uso| Escoger un personaje y su dificultad para jugar |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario inicie una sesión de juego. |
|Resumen| El usuario ingresa a la aplicación, escoge un personaje, selecciona una dificultad disponible y responde la ronda de preguntas. |
|Precondición| El usuario debe tener una cuenta creada previamente.|

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa a la aplicación. |
|2| El sistema muestra el menú principal. |
|3| El usuario selecciona la opción “jugar”. |
|4| El sistema muestra todos los personajes. |
|5| El usuario escoge un personaje. |
|6| El usuario escoge el nivel de dificultad “fácil” del personaje seleccionado e inicia el cuestionario. |
|7| El usuario concluye la ronda de preguntas. |
|8| El sistema le muestra en pantalla su experiencia generada con base en las preguntas respondidas correctamente. |
|9| El sistema le muestra en pantalla al usuario que obtuvo una estrella. |
|10| El usuario regresa a la sección de personajes. |
|11| El usuario elige volver al menú|
|12| El usuario sale de la aplicación. |
|Postcondición| La experiencia obtenida de las preguntas y las estrellas se guardarán en la base de datos para poder desbloquear más personajes. | 

|excepciones| |
|---|---|
|1|El usuario escoge un personaje con una dificultad aún no desbloqueada. Podrá desbloquearla únicamente si cuenta con las suficientes estrellas requeridas por el nivel.  |
|2| En caso de que el usuario no responda bien una pregunta, se le indicará que es incorrecta su opción seleccionada. |
|3| El sistema le indica al usuario que no obtuvo la estrella, pues el usuario no respondió correctamente al menos, el 80% de las preguntas. |
|4| En caso de que el usuario cierre la aplicación mientras está respondiendo el cuestionario, no se guardará su progreso, por lo que el usuario tendrá que iniciar desde cero el cuestionario cuando vuelva a iniciar el programa.  |


***Caso de uso No.3***

|Caso de uso| Desbloquear un nuevo nivel de dificultad de personaje |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario pueda desbloquear y jugar un nuevo nivel de dificultad de un personaje |
|Resumen| Tras haber obtenido una estrella (completando el nivel “fácil” de algún personaje), el usuario puede desbloquear el nivel de dificultad “medio” de ese mismo personaje o algún otro personaje que ya haya completado el nivel “fácil”. |

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa al menú principal. |
|2| El usuario selecciona la opción “jugar”. |
|3| El usuario selecciona un personaje. |
|4| El usuario selecciona la dificultad “medio”. |
|5| El sistema desbloquea el nivel de dificultad seleccionado. |
|6| El sistema inicia el cuestionario. |
|7| El usuario responde las preguntas. |
|8| El usuario termina la ronda de preguntas. |
|9| El usuario regresa al menú principal y abandona la aplicación. |
|Postcondición| Si responde correctamente bien el 80% de las preguntas, obtendrá las dos estrellas que se otorgan en el nivel de dificultad “medio”. | 

|excepciones| |
|---|---|
|1| En caso de que el personaje no haya sido completado el nivel fácil, no se podrá desbloquear el nivel “medio”. |

***Caso de uso No.4***

|Caso de uso| Desbloquear un personaje |
|---|---|
|Actores| Usuario, base de datos, sistema |
|Propósito| Hacer que el usuario desbloquee un personae en el álbum |
|Resumen| El usuario al haber obtenido las tres estrellas puede desbloquear un personaje nuevo para poder sus preguntas|
|Precondición| Haber contestado correctamente al menos el 80% de las preguntas de un personaje del nivel “fácil” y estar ejecutando el programa con su sesión iniciada.| 

__Secuencia principal__

|Pasos| Secuencia |
|---|---|
|1| El usuario ingresa al menú principal. |
|2| El usuario selecciona la opción “jugar”. |
|3| El usuario selecciona un personaje. |
|4| El usuario selecciona la dificultad “medio”. |
|5| El sistema desbloquea el nivel de dificultad seleccionado. |
|6| El sistema inicia el cuestionario. |
|7| El usuario responde las preguntas. |
|8| El usuario termina la ronda de preguntas. |
|9| El usuario regresa al menú principal y abandona la aplicación. |

|Postcondición| La base de datos registra que el usuario desbloqueó un nuevo personaje. | 

|excepciones| El usuario intenta desbloquear en el album un personaje que aún no ha sido completado los 3 niveles de dificultad, por lo que el sistema rechazara esta petición.|
|---|---|
|1|En caso de que el personaje no haya sido completado el nivel fácil, no se podrá desbloquear el nivel “medio”. |


