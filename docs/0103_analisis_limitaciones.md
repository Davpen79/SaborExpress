## A1.3 · Análisis de limitaciones de un dispositivo

> #### Modelo dispositivo: Redmi 9A

Procesador: Octa-Core Max 2,00 GHz

RAM: 2 GB

Almacenamiento: 32 GB

Almacenamiento libre: 5,8 GB

Pantalla: 
- Tamaño: 68 x 151 mm
- Resolución: 1600 x 720
- Densidad: 320 (xhdpi)

Versión de Android: 10

Nivel de API: 29

> #### Sensores disponibles: 

Acelerómetro

Sensor de Luz

Sensor de Proximidad

Sensor de Orientación

Sensor de Movimiento

Step-Detector

Tilt-Detector

Glance-Gesture

SAR sensor

Estado de batería: 57% (15 h 0 min)

Consumo por aplicación: 
- Brave 		70,79 %
- Sistema 		5,97 %
- En espera	4,25 %
- Inactividad 	4 %
- Google Play 	0,5 %
- Otros 		14,45 %


> #### Conclusiones de diseño:

Teniendo en cuenta las limitaciones de este dispositivo concreto, a la hora de desarrollar una 
aplicación, tenemos que tener en consideración lo siguiente:

- El dispositivo es relativamente antiguo y utiliza una versión de android algo desfasada 
(Android 10, API 29). Tenemos que tener en cuenta que esta versión de android puede carecer de 
funcionalidades de versiones más recientes (Material You, Herramientas de IA)

- La memoria RAM del dispositivo es limitada (solo 2 GB). Esto implica que nuestra aplicación 
debería evitar cargar demasiados elementos simultáneamente. Debemos usar sonidos / imágenes comprimidas,
svg siempre que se pueda y usar componentes lazy. También debemos asegurarnos que la aplicación 
libere recursos cuando no esté en uso.

- Este dispositivo carece de Magnetómetro, Giroscopio y Barómetro. No podremos hacer uso de estos 
sensores en nuestra aplicación. Pero sí dispone de GPS, Bluetooth, wifi, etc.

- Aunque el dispositivo tiene una capacidad de almacenamiento de 32 GB, una gran parte de ese 
espacio ya está siendo usado por el sistema y otras aplicaciones. Nuestra aplicación no debería 
ocupar demasiado espacio.