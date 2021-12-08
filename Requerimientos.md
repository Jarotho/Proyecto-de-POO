# Requerimientos

## Funcionales

|RF001|Registro de usuarios|
|---|---|
|Descripción| El sistema le permite al usuario la creación de una cuenta mediante un ID y una contraseña, esta cuenta será única y permitirá al usuario guardar su progreso en ella. |
|Comentarios| El ID será único. El sistema verificará que no exista otro igual para poder seguir con el registro del usuario, para ello, el sistema avisará al usuario que el ID ya está en uso y deberá de ingresar otro. El ID solamente podrá estar conformado por letras y números. |  

|RF002|Personaje|
|---|---|
|Descripción| El usuario podrá seleccionar un personaje, donde podrá responder un cuestionario que permita obtener experiencia.  |
|Comentarios| La experiencia obtenida se dará de acuerdo a cuántas preguntas se conteste correctamente. |  

|RF003| Preguntas |
|---|---|
|Descripción| El sistema contendrá para cada personaje una serie de preguntas las cuales el usuario deberá responder correctamente para acumular experiencia, y con ello, ir desbloqueando trofeos. Todas las preguntas serán de opción múltiple.|
|Comentarios| Solamente existirán preguntas de opción múltiple. |  
|  

|RF004| Álbum de personajes |
|---|---|
|Descripción| El programa contendrá un apartado donde el usuario puede observar los personajes junto con información relevante de ellos y sus respectivos trofeos |
|Comentarios| El álbum puede recibir más actualizaciones para incluir más recompensas o retirar algunas |  

|RF005| Experiencia |
|---|---|
|Descripción| Las preguntas tendrán cierto número de puntuación la cual se acumulará como experiencia para la cuenta del usuario, esta permitirá entre otras cosas desbloquear imágenes exclusivas y se utilizará para los rankings |
|Comentarios| La experiencia es una forma de ofrecer al usuario re jugabilidad ofreciendo recompensas y obtener un mayor ranking |  

|RF006| Rankings |
|---|---|
|Descripción| El usuario podrá acceder a una pestaña la cual le permitirá observar su ranking con respecto a otros usuarios del programa  |
|Comentarios| El usuario puede subir de ranking únicamente por medio de la experiencia obtenida |  

## No funcionales

|RNF001| Interfaz gráfica de usuario |
|---|---|
|Descripción| La interfaz gráfica es intuitiva para cualquier tipo de usuario (nuevo o ya registrado), por lo que resulta fácil su navegación.|
|Comentarios| No se requiere de experiencia previa con el sistema, por lo que un usuario nuevo debería navegar con facilidad en el sistema. |  

|RNF002| Tiempo de respuesta|
|---|---|
|Descripción| La responsividad en el sistema es óptima y las acciones elegidas por el usuario deben realizarse en 0.75 segundos o inferior. |
|Comentarios| Detalles|  

|RNF003| Seguridad de las credenciales del usuario|
|---|---|
|Descripción| El sistema guardara los datos del usuario dentro de la base de datos bien las credenciales del usuario (proporcionadas al crear su cuenta) para que nadie más acceda a esta información. |
|Comentarios| Por ejemplo, cuando ocurren ataques y filtran todos los datos de los usuarios. |  

|RNF004| Optimización|
|---|---|
|Descripción|La aplicación no deberá consumir demasiados recursos, por lo que podrá ejecutarse en equipos de cómputo más discretos. Aproximación: CPU de 4 núcleos mínimo con gráficos integrados, 4gb de RAM, Windows 10 |
|Comentarios| |  

|RNF005| Mantenibilidad|
|---|---|
|Descripción| El sistema es implementado de forma que pueda ser modificado fácilmente ya que en un futuro se pueden realizar actualizaciones para añadir alguna nueva mecánica o nuevo contenido (como son nuevos personajes, diferentes recompensas, etc.). |
|Comentarios| |  
