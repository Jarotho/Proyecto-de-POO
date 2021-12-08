# Mapeo de requerimientos

## Funcionales

|RF001|Registro de usuarios|
|---|---|
|Descripción| El sistema le permite al usuario la creación de una cuenta mediante un ID y una contraseña, esta cuenta será única y permitirá al usuario guardar su progreso en ella. |
|Se cumplió| Este requerimiento se cumple debido a que el programa permite al usuario la creación de cuentas a través de una base de datos local |  

|RF002|Personaje|
|---|---|
|Descripción| El usuario podrá seleccionar un personaje, donde podrá responder un cuestionario que permita obtener experiencia.  |
|Se cumplió parcialmente|El usuario es capaz de escoger un personaje, sin embargo la experiencia no está habilitada|  

|RF003| Preguntas |
|---|---|
|Descripción| El sistema contendrá para cada personaje una serie de preguntas las cuales el usuario deberá responder correctamente para acumular experiencia, y con ello, ir desbloqueando trofeos. Todas las preguntas serán de opción múltiple.|
|Se cumplió parcialmente| Esto debido a que cada personaje cuenta con sus respectivas preguntas, sin embargo estas no otorgan experiencia al usuario |  

|RF004| Álbum de personajes |
|---|---|
|Descripción| El programa contendrá un apartado donde el usuario puede observar los personajes que contiene el juego, a la par que información relevante de ellos y los trofeos a desbloquear |
|Se cumplió| El usuario puede observar el album de cada personaje junto a sus demas elementos |  

|RF005| Experiencia |
|---|---|
|Descripción| Las preguntas tendrán cierto número de puntuación la cual se acumulará como experiencia para la cuenta del usuario, esta permitirá entre otras cosas desbloquear imágenes exclusivas y se utilizará para los rankings |
|No se cumplió| El usuario no obtiene experiencia al responder las preguntas |  

|RF006| Rankings |
|---|---|
|Descripción| El usuario podrá acceder a una pestaña la cual le permitirá observar su ranking con respecto a otros usuarios del programa. |
|Se cumplió| El usuario es capaz de observar un ranking funcional|  

## No funcionales

|RNF001| Interfaz gráfica de usuario |
|---|---|
|Descripción| La interfaz gráfica es intuitiva para cualquier tipo de usuario (nuevo o ya registrado), por lo que resulta fácil su navegación.|
|Se cumplió| El programa ofrece al usuario los elementos gráficos necesarios para navegar por el programa |  

|RNF002| Tiempo de respuesta|
|---|---|
|Descripción| La responsividad en el sistema es óptima y las acciones elegidas por el usuario deben realizarse en 1.75 segundos o inferior. |
|Se cumplió| El tiempo de respuesta es el esperado, no mas de unos cuantos segundos|  

|RNF003| Seguridad de las credenciales del usuario|
|---|---|
|Descripción| El sistema guardara los datos del usuario dentro de la base de datos bien las credenciales del usuario (proporcionadas al crear su cuenta) para que nadie más acceda a esta información. |
|Se cumplió| El sistema valida las credenciales del usuario |  

|RNF004| Optimización|
|---|---|
|Descripción|La aplicación no deberá consumir demasiados recursos, por lo que podrá ejecutarse en equipos de cómputo más discretos. Aproximación: CPU de 4 núcleos mínimo con gráficos integrados, 4gb de RAM, Windows 10 |
|Se cumplió|Es posible correr el programa en cualquier dispositivo que cuente con un sistema windows 10 |  

|RNF005| Mantenibilidad|
|---|---|
|Descripción| El sistema es implementado de forma que pueda ser modificado fácilmente ya que en un futuro se pueden realizar actualizaciones para añadir alguna nueva mecánica o nuevo contenido (como son nuevos personajes, diferentes recompensas, etc.). |
|Se cumplió|El programa puede modificarse de manera sencilla |  
