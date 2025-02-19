1)	Dada una matriz que representa un almacén donde cada celda contiene un objeto Producto con atributos nombre, precio y cantidad, escribe un algoritmo que encuentre la ubicación (fila, columna) de un producto en una lisa de 30 productos buscar específico por su nombre.
Solución: Recorre la matriz buscando el Producto cuyo nombre coincida con el buscado. Devuelve la posición de la celda.

2)	Dada una matriz de objetos Producto en una tienda, donde cada Producto tiene un atributo cantidad, escribe un algoritmo que sume todas las cantidades para determinar el inventario total de la tienda.
Solución: Itera a través de cada celda de la matriz sumando el valor del atributo cantidad de cada objeto.


3)	Problema: En una librería organizada como una matriz, cada celda contiene un objeto Libro con atributos título, autor y precio. Escribe un algoritmo para encontrar el libro con el precio más alto.
Solución: Recorre la matriz comparando el atributo precio de cada Libro para identificar y devolver el libro más caro.


4)	Problema: Dada una matriz que representa un teatro, donde cada celda contiene un objeto Asiento con atributos número, fila, precio, implementa un algoritmo para ordenar los asientos dentro de cada fila según el precio en orden ascendente.


5)	Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. Los productos que no son idénticos los debe agregar en la matriz resultante


6)	Dada una matriz que representa las estanterías de un supermercado, donde cada celda contiene un objeto Producto con atributos nombre, precio, disponibilidad (booleano), escribe un algoritmo que filtre y devuelva una nueva matriz con solo los productos disponibles.
Solución: Recorre la matriz original, copiando a una nueva matriz únicamente los Producto cuyo atributo disponibilidad sea true.


7)	En una escuela, los estudiantes están organizados en una matriz, donde cada celda contiene un objeto Estudiante con atributos nombre, calificación. Escribe un algoritmo que agrupe a los estudiantes en diferentes matrices según su calificación (A, B, C, etc.).
Solución: Crea matrices separadas para cada rango de calificaciones y asigna a cada Estudiante a la matriz correspondiente según su calificación.

8)	Problema: Dada una lista de productos con atributos nombre, peso, categoría, llena una matriz que represente las estanterías de un almacén. Cada producto debe ubicarse en la sección correspondiente según su categoría.
Solución: Agrupa los productos por categoría en vectores y luego llena la matriz con los vectores organizados por categoría 

9)	Se tiene una matriz 5*12 la cual cada fila corresponde a cada vendedor y sus ventas en el año, se requiere sumar por fila e identificar cuál de todos los vendedores vendió mas en el año y se debe mostrar el nombre y valor de la venta 
Solución: recorra una matriz 5* 12 y suma cada fila y las compara para saber cuál de los vendedores vendió mas

10)	Se tiene un matriz con n productos y se requiere saber cuántos productos están en oferta
Solución cree una matriz cuadrada e incremente la cantidad que productos en ofertas y muestre el total 
