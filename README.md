# Challenge ONE | Java | Back-end | Hotel Alura | Esteban Cardona

<p align="center" >
     <img width="300" heigth="300" src="https://user-images.githubusercontent.com/91544872/189419040-c093db78-c970-4960-8aca-ffcc11f7ffaf.png">
</p>

---

Este proyecto utiliza Java como lenguaje principal para desarrollar una aplicación de reservaciones de hotel. La aplicación se conecta a una base de datos MySQL utilizando JPA. La vista de la aplicación se implementa usando Java Swing.

## Primeros Pasos

### 🔹 Marca este proyecto con una ⭐

#### 🔹 Sigue las orientaciones que tenemos en este repositorio. 📚

</br>

## 🖥️ Tecnologías Utilizadas

- Java JDK 8 o superior
- Eclipse
- Biblioteca JCalendar
- MySQL 8.0 o superior
- Plugin WindowBuilder </br>

---

## ⚠️ Importante! ⚠️

☕ Use Java versión 8 o superior para compatibilidad. </br></br>
📝 Recomendamos usar el editor de Eclipse para compatibilidad con la Interfaz Gráfica. </br></br>
🎨 La interfaz contiene dos métodos importantes:

---

## 🔍 ¡Analizando nuestro repositorio

### Este es el repositorio base de nuestro proyecto, en el encontrarás

#### 🔹 src/views: carpeta con toda la interfaz gráfica de las pantallas necesarias para desarrollar el programa

#### 🔹 src/imagenes: carpeta con imágenes que puedes usar en tu proyecto. Siéntete libre de usar otros, si lo deseas

#### 🔹 src/jbdc: Carpeta con el codigo de la conexion a la base de datos y su controlador

</br>

## 📊 Base de Dados

### ¿Cómo importar MySqlConnector al proyecto?

Es la misma ruta descrita para importar el <strong>JCalendar</strong>, haga clic con el botón derecho en el proyecto, <em>Build Path</em>, <em>Configure Build Path</em>, <em>Libraries</em>, <em>Add External JARs</em>. Para encontrar la ruta de este archivo <strong>.jar</strong>, ve al disco duro de tu computadora e ingresa a la carpeta <em>Archivos de Programas (x86)</em>.

- Archivos de Programas (x86):

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169394-a67b528a-c8b7-4f7a-b374-a1da81b1cc5d.png">
</p>

- MySQL

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169551-b32a9978-3a05-4b6e-b077-f586d0c41e31.png">
</p>

- Connector J 8.0:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169584-48e21a03-e70f-4a65-9197-448a3645f526.png">
</p>

- My SQL Connector Java:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169737-5f93868e-df8f-4177-90ba-faf9570758ac.png">
</p>

### Modelado de tablas

Para este reto te proponemos dos tablas: <strong>Reservas</strong> y <strong>Huéspedes</strong>. La tabla de huéspedes debe contener la clave externa <em>(foreign key)</em> <strong>idReserva</strong>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169529338-09a4d4c2-1b5a-41dc-b305-38498ebc29a8.png">
</p>
