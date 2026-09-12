# Sistema de Gestión de Almacén
Estudiante: Sebastian Mendez Ayala.
Entorno de desarrollo: Visual estudio code 
Lenguaje: Java (JDK 21)
Descripción: 
Sistema de control de inventario desarrollado en Java por consola. Permite registrar, listar y buscar distintos tipos de productos (alimentos de nevera, despensa, líquidos y artículos de no alimentos), organizándolos mediante una arquitectura orientada a objetos y aplicando un manejo robusto de excepciones.
Funcionalidades:
* Registro de Productos: Permite ingresar nuevos artículos seleccionando entre categorías específicas (Alimentos_nevera, Alimentos_despensa, Liquidos, No_alimentos).
* Visualizacion de inventario: Muestra la lista completa de los productos almacenados con sus detalles particulares.
* Busqueda por nombre: Localiza productos específicos dentro del almacén de forma rápida.
* Manejo de errores: Controla excepciones personalizadas cuando un producto no se encuentra registrado.
Clases utilizadas.
* `Main`: Controla el flujo de ejecución del programa mediante un menú interactivo en consola y la interacción con el usuario mediante `Scanner`.
* `Productos`: Superclase base que define los atributos comunes a todos los artículos (categoría, nombre, vencimiento, precio, familiar, personal) y el método base de visualización.
* `Alimentos_nevera`: Subclase que añade atributos específicos como productos frescos y perecederos.
* `Alimentos_despensa`: Subclase orientada a productos de despensa general.
* `Liquidos`: Subclase que incluye clasificaciones para líquidos y congelados.
* `No_alimentos`: Subclase que agrupa artículos de aseo, limpieza y mascotas.
* `Almacen`: Clase encargada de gestionar la colección de productos (`ArrayList`), permitiendo agregarlos, listarlos y buscarlos.
* `Productonoencontradoexcepcion`: Excepción personalizada que se lanza cuando una búsqueda de producto no arroja resultados.
Conceptos de POO aplicados:
* Herencia: Las clases `Alimentos_nevera`, `Alimentos_despensa`, `Liquidos` y `No_alimentos` extienden de la superclase `Productos`, reutilizando código y estructurando jerarquías lógicas.
* Polimorfismo: Sobrescritura de métodos (`@Override`) en las clases hijas para adaptar el comportamiento del método `mostrarinformacion()` de acuerdo con los atributos específicos de cada tipo de producto.
* Encapsulamiento: Uso de modificadores de acceso (`private` y `protected`) junto con métodos de acceso (getters) para proteger el estado interno de los objetos.
* Abstracción: Modelado de entidades del mundo real (productos de un almacén) en clases con responsabilidades bien definidas.
Instrucciones de ejecucion:
   Requisitos previos
* Tener instalado el JDK 21 o superior.
* Tener instalado Visual Studio Code con la extensión Extension Pack for Java.
Pasos para ejecutar
1. Clona el repositorio o descarga el código fuente en tu equipo.
