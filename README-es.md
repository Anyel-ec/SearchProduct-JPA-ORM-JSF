# Detalles del Proyecto

Este proyecto consiste en un conjunto de controladores y vistas relacionadas con la gestión de electrodomésticos. 
## **Select Language: 🌐** 
- [Español (Spanish)](README.md)
- [English](README-en.md)

### A continuación, se detallan los archivos relevantes:
## Clase `BuscarElectroBean`

El archivo `BuscarElectroBean.java` contiene un controlador que se encarga de buscar un electrodoméstico en base a un código proporcionado. Si el electrodoméstico existe, determina si la cantidad disponible es mayor a 10, entre 1 y 10, o igual a 0. Estos casos se manejan redirigiendo a diferentes páginas.

### Métodos Principales

- `buscarElectro()`: Método que realiza la búsqueda del electrodoméstico y determina la acción a tomar según la cantidad disponible.

## Clase `ElectrodomesticoManagerBean`

En el archivo `ElectrodomesticoManagerBean.java` se encuentra otro controlador que gestiona la lista de electrodomésticos y sus detalles.

### Métodos Principales

- `buscarElectrodomestico()`: Método que utiliza el `BuscarElectroBean` para buscar un electrodoméstico.
- `getElectrodomesticos()`: Método que devuelve la lista de todos los electrodomésticos disponibles.
- `getProductosMenosDeDiezUnidades()`: Método que devuelve la lista de electrodomésticos con menos de 10 unidades disponibles.
- `getProductosConCeroUnidades()`: Método que devuelve la lista de electrodomésticos con 0 unidades disponibles.

## Vistas XHTML

Los archivos XHTML en este proyecto se utilizan para mostrar la interfaz de usuario. Estos archivos contienen formularios y tablas para interactuar con los controladores y mostrar los resultados.

## Desarrollador

Este proyecto fue desarrollado por Angel Patiño.
