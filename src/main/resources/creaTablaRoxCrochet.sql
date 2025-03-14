CREATE SCHEMA roxcrochet

create user 'usuario_cliente'@'%' identified by 'Usuar1o_Clave.';
create user 'usuario_admin'@'%' identified by 'Usuar1o_Clave.';

grant all privileges on techshop.* to 'usuario_cliente'@'%';
grant select on roxcrochet.* to 'usuario_admin'@'%';
flush privileges;

USE roxcrochet;

CREATE TABLE Cliente(
id_cliente INT NOT NULL AUTO_INCREMENT,
nombre_c VARCHAR(30) NOT NULL,
telefono VARCHAR(8) NOT NULL,
correo_a VARCHART(75) NOT NULL,
contraseña_a VARCHAR(10),
PRIMARY KEY (id_cliente))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE Administrador(
id_administrador INT NOT NULL AUTO_INCREMENT,
nombre_a VARCHAR(30) NOT NULL,
correo_a VARCHAR(75) NOT NULL,
contraseña_a VARCHAR(10) NOT NULL,
estado boolean,
PRIMARY KEY (id_administrador))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE Producto(
id_producto INT NOT NULL AUTO_INCREMENT,
nombre_p VARCHAR(30) NOT NULL,
precio_p double,
descripcion VARCHAR(30) NOT NULL,
ruta_imagenc varchar(1024),
activop boolean,
PRIMARY KEY (id_producto))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE Categoria(
id_categoria INT NOT NULL AUTO_INCREMENT,
descripcion VARCHAR(30) NOT NULL,
ruta_imagen varchar(1024),
activo boolean,
PRIMARY KEY (id_categoria))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE Pedidos(
id_pedido INT NOT NULL AUTO_INCREMENT,
direccion VARCHAR(30) NOT NULL,
PRIMARY KEY (id_pedido))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


