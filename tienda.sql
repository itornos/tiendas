-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2022 a las 06:07:36
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_empleado` int(2) NOT NULL,
  `password` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_empleado`, `password`) VALUES
(1, '1000:4b136ffe6e82bd5783c094a8dd69fc01:a2153a2b746f011d598f9f8864756dcfdb16aea3ccd172ffac943f6fea5a79ab7dba69191c25e1201926f9c237255e89f00d8df10df91ee6e3e58c9091ab4558'),
(2, 'asd'),
(3, ''),
(4, ''),
(5, ''),
(10, '21232f297a57a5a743894a0e4a801fc3'),
(22, '1000:4b136ffe6e82bd5783c094a8dd69fc01:a2153a2b746f011d598f9f8864756dcfdb16aea3ccd172ffac943f6fea5a79ab7dba69191c25e1201926f9c237255e89f00d8df10df91ee6e3e58c9091ab4558');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(2) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `img` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nombre`, `img`) VALUES
(1, 'Instrumentos', ''),
(2, 'Juegos', ''),
(3, 'Muebles', ''),
(4, 'Deporte', ''),
(5, 'Altavoces', ''),
(6, 'Microfonos', ''),
(7, 'Auriculares', ''),
(8, 'Electrodomesticos', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(2) NOT NULL,
  `id_tienda` int(2) DEFAULT NULL,
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `id_tienda`, `DNI`, `nombre`, `direccion`, `telefono`) VALUES
(1, 1, '12347678A', 'Izan', 'direcion x', 113456789),
(2, 1, '22347678A', 'Marta', 'direcion x', 223456789),
(3, 2, '32347678A', 'Carmen', 'direcion x', 323456789),
(4, 1, '42347678A', 'Ana', 'direcion x', 423456789),
(5, 3, '52347678A', 'Josefa', 'direcion x', 523456789),
(6, 1, '62347678A', 'Isabel', 'direcion x', 623456789),
(7, 4, '72347678A', 'Laura', 'direcion x', 723456789),
(8, 5, '82347678A', 'Cristina', 'direcion x', 823456789),
(9, 1, '92347678A', 'Marta', 'direcion x', 923456789),
(10, 2, '10347678A', 'Lucia', 'direcion x', 103456789),
(11, 1, '17447678A', 'Antonia', 'direcion x', 119356789),
(12, 3, '12392678A', 'Antonio', 'direcion x', 123756789),
(13, 4, '13347678A', 'Jose', 'direcion x', 133456789),
(14, 5, '14347678A', 'Manuel', 'direcion x', 143456789),
(15, 2, '15347678A', 'Francisco', 'direcion x', 153456789),
(16, 2, '16347678A', 'Juan', 'direcion x', 163456789),
(17, 4, '17347678A', 'David', 'direcion x', 173456789),
(18, 3, '18347678A', 'Javier', 'direcion x', 183456789),
(19, 5, '19347678A', 'Daniel', 'direcion x', 193456789),
(20, 3, '20347678A', 'Carlos', 'direcion x', 203456789);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacta_prov`
--

CREATE TABLE `contacta_prov` (
  `id_proveedor` int(2) NOT NULL,
  `id_empleado` int(2) NOT NULL,
  `idioma` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contacta_prov`
--

INSERT INTO `contacta_prov` (`id_proveedor`, `id_empleado`, `idioma`) VALUES
(1, 6, 'Espa�ol'),
(2, 7, 'Espa�ol'),
(3, 8, 'Ingles'),
(4, 9, 'Ingles'),
(5, 10, 'Ingles'),
(6, 8, 'español'),
(7, 8, 'español'),
(8, 7, 'ingles'),
(9, 10, 'ingles'),
(10, 6, 'español');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(2) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `antiguedad` int(2) DEFAULT NULL,
  `salario` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `DNI`, `nombre`, `apellido`, `antiguedad`, `salario`) VALUES
(1, '19345678A', 'Izan', 'Tornos', 1, 1200),
(2, '12745678A', 'Antonio', 'Rodriguez', 2, 1200),
(3, '16345678A', 'Manuel', 'Martinez', 1, 1200),
(4, '82754678A', 'Jose', 'Gonzalez', 4, 1300),
(5, '72342867A', 'David', 'Sanchez', 1, 1200),
(6, '61373678A', 'Juan', 'Fernandez', 5, 1500),
(7, '53345678A', 'Francisco', 'Perez', 1, 1200),
(8, '42345678A', 'Javier', 'Gomez', 7, 1700),
(9, '32307678A', 'Daniel', 'Martin', 4, 1200),
(10, '22326678A', 'Luis', 'Bernal', 2, 1900),
(22, '123456879', 'Bernardo', 'Silva', 0, 2300);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestor_prov`
--

CREATE TABLE `gestor_prov` (
  `id_empleado` int(2) NOT NULL,
  `tlf_contacto` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gestor_prov`
--

INSERT INTO `gestor_prov` (`id_empleado`, `tlf_contacto`) VALUES
(10, 524445753),
(6, 563445753),
(7, 563745753),
(8, 563845753),
(9, 563945753);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(2) NOT NULL,
  `nombre_producto` varchar(30) NOT NULL,
  `precio` int(5) NOT NULL,
  `descripcion` varchar(1000) NOT NULL,
  `características_especificaciones` varchar(1000) NOT NULL,
  `Accesorios_incluidos` varchar(1000) NOT NULL,
  `imgs` varchar(500) NOT NULL,
  `id_categoria` int(2) DEFAULT NULL,
  `id_subcategoria` int(2) DEFAULT NULL,
  `id_proveedor` int(2) DEFAULT NULL,
  `id_tienda` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `precio`, `descripcion`, `características_especificaciones`, `Accesorios_incluidos`, `imgs`, `id_categoria`, `id_subcategoria`, `id_proveedor`, `id_tienda`) VALUES
(1, 'violin', 3500, '', '', '', '', 1, 3, 1, 1),
(2, 'piano', 2000, '', '', '', '', 1, 4, 1, 1),
(3, 'guitarra', 300, '', '', '', '', 1, 5, 2, 1),
(4, 'xilofono', 70, '', '', '', '', 1, 1, 2, 1),
(5, 'altavoz', 60, '', '', '', '', 5, 0, 2, 1),
(6, 'lavadora', 500, '', '', '', '', 8, 0, 3, 2),
(7, 'plancha', 50, '', '', '', '', 8, 0, 3, 2),
(8, 'frigorifico', 320, '', '', '', '', 8, 0, 4, 2),
(9, 'aspiradora', 120, '', '', '', '', 8, 0, 4, 2),
(10, 'lavaplatos', 350, '', '', '', '', 8, 0, 5, 2),
(11, 'sofa', 200, '', '', '', '', 3, 0, 6, 3),
(12, 'armario', 40, '', '', '', '', 3, 0, 6, 3),
(13, 'armario oscuro', 50, '', '', '', '', 3, 0, 7, 3),
(14, 'mesa', 50, '', '', '', '', 3, 0, 8, 3),
(15, 'silla', 20, '', '', '', '', 3, 0, 8, 3),
(16, 'call of duty', 60, '', '', '', '', 2, 0, 9, 4),
(17, 'destiny 2', 60, '', '', '', '', 2, 0, 9, 4),
(18, 'elden ring', 70, '', '', '', '', 2, 0, 10, 4),
(19, 'fornite', 10, '', '', '', '', 2, 0, 10, 4),
(20, 'csgo', 10, '', '', '', '', 2, 0, 10, 4),
(21, 'balon de futbol', 50, '', '', '', '', 4, 0, 1, 5),
(22, 'balon de baloncesto', 40, '', '', '', '', 4, 0, 1, 5),
(23, 'Ropa de deporte', 50, '', '', '', '', 4, 0, 2, 5),
(24, 'zapatillas', 100, '', '', '', '', 4, 0, 5, 5),
(25, 'porteria peque�a', 30, '', '', '', '', 4, 0, 7, 5),
(51, 'saxofon', 2000, '', '', '', 'http://localhost/tienda/productos/saxo.png', 1, 2, 5, 1),
(63, 'Maracas', 20, '', '', '', '', 1, 7, 4, 1),
(64, 'Castañuelas', 15, '', '', '', '', 1, 8, 5, 1),
(65, 'Matraca', 12, '', '', '', '', 1, 9, 4, 1),
(66, 'Gang', 300, '', '', '', '', 1, 10, 7, 1),
(67, 'Bateria Electrica', 425, '', '', '', '', 1, 11, 9, 1),
(68, 'Guitarra Electrica', 470, '', '', '', '', 1, 12, 2, 1),
(69, 'Altavoces Genericos', 59, '', '', '', '', 5, 0, 6, 1),
(70, 'Microfono Generico', 120, '', '', '', '', 6, 0, 4, 1),
(71, 'Auriculares genericos', 75, '', '', '', '', 7, 0, 6, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(2) NOT NULL,
  `nif` varchar(9) NOT NULL,
  `nom_prov` varchar(60) NOT NULL,
  `pais` varchar(10) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` int(9) NOT NULL,
  `representante` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `nif`, `nom_prov`, `pais`, `direccion`, `telefono`, `representante`) VALUES
(1, '12326678A', 'Repsol petroleo sa', 'Espa�a', 'direcion x', 123456789, 'Izan'),
(2, '22326678A', 'Compa�ia espa�ola de petroleos sau', 'Portugal', 'direcion x', 223456789, 'Antonio'),
(3, '32326678A', 'Telefonica, sa', 'Italia', 'direcion x', 323456789, 'Jose'),
(4, '42326678A', 'Endesa energia sau', 'China', 'direcion x', 423456789, 'Francisco'),
(5, '52326678A', 'Repsol comercial de productos petroliferos sa', 'Japon', 'direcion x', 523456789, 'Francisco'),
(6, '62326678A', 'El corte ingles sa', 'Alemania', 'direcion x', 623456789, 'Juan'),
(7, '72326678A', 'Cepsa trading sau', 'Espa�a', 'direcion x', 723456789, 'Luis'),
(8, '82326678A', 'Centros comerciales carrefour sa', 'Francia', 'direcion x', 823456789, 'Juan'),
(9, '92326678A', 'Telefonica de espa�a sau', 'Portugal', 'direcion x', 923456789, 'Daniel'),
(10, '10326678A', 'Sociedad estatal loterias y apuestas del estado sme sa', 'Espa�a', 'direcion x', 103456789, 'Daniel');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoria`
--

CREATE TABLE `subcategoria` (
  `id_subcategoria` int(2) NOT NULL,
  `id_categoria` int(2) DEFAULT NULL,
  `nombre` varchar(70) NOT NULL,
  `img` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `subcategoria`
--

INSERT INTO `subcategoria` (`id_subcategoria`, `id_categoria`, `nombre`, `img`) VALUES
(0, NULL, '', ''),
(1, 1, 'Viento Madera', ''),
(2, 1, 'Viento Metal', ''),
(3, 1, 'Cuerda Frotada', ''),
(4, 1, 'Cuerda Percutida', ''),
(5, 1, 'Cuerda Pulsada', ''),
(6, 1, 'Percusion Percutidos', ''),
(7, 1, 'Percusion Sacudidos', ''),
(8, 1, 'Percusion Entrechocados', ''),
(9, 1, 'Percusion Frotados o raspados', ''),
(10, 1, 'Percusion Percutidos con la mano', ''),
(11, 1, 'Electrofonos Electromecánicos', ''),
(12, 1, 'Electrofonos Electrónicos', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tienda`
--

CREATE TABLE `tienda` (
  `id_tienda` int(2) NOT NULL,
  `administrador` int(2) DEFAULT NULL,
  `nombre` varchar(30) NOT NULL,
  `dominio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tienda`
--

INSERT INTO `tienda` (`id_tienda`, `administrador`, `nombre`, `dominio`) VALUES
(1, 1, 'Musica', 'www.compramusica.com'),
(2, 2, 'Muebles', 'www.compramuebles.com'),
(3, 3, 'Deportes', 'www.compradeporte.com'),
(4, 4, 'VideoJuegos', 'www.comprajuegos.com'),
(5, 5, 'Electrodomesticos', 'www.compraelectrodomesticos.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `DNI` (`DNI`),
  ADD UNIQUE KEY `telefono` (`telefono`),
  ADD KEY `fk_tienda` (`id_tienda`);

--
-- Indices de la tabla `contacta_prov`
--
ALTER TABLE `contacta_prov`
  ADD PRIMARY KEY (`id_proveedor`,`id_empleado`),
  ADD KEY `id_empleado` (`id_empleado`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `gestor_prov`
--
ALTER TABLE `gestor_prov`
  ADD PRIMARY KEY (`id_empleado`),
  ADD UNIQUE KEY `tlf_contacto` (`tlf_contacto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_proveedor` (`id_proveedor`),
  ADD KEY `id_subcategoria` (`id_subcategoria`),
  ADD KEY `id_tienda` (`id_tienda`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`),
  ADD UNIQUE KEY `nif` (`nif`),
  ADD UNIQUE KEY `telefono` (`telefono`);

--
-- Indices de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD PRIMARY KEY (`id_subcategoria`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indices de la tabla `tienda`
--
ALTER TABLE `tienda`
  ADD PRIMARY KEY (`id_tienda`),
  ADD UNIQUE KEY `dominio` (`dominio`),
  ADD KEY `administrador` (`administrador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=292;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id_proveedor` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  MODIFY `id_subcategoria` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `tienda`
--
ALTER TABLE `tienda`
  MODIFY `id_tienda` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE CASCADE;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_tienda` FOREIGN KEY (`id_tienda`) REFERENCES `tienda` (`id_tienda`);

--
-- Filtros para la tabla `contacta_prov`
--
ALTER TABLE `contacta_prov`
  ADD CONSTRAINT `contacta_prov_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE CASCADE,
  ADD CONSTRAINT `contacta_prov_ibfk_2` FOREIGN KEY (`id_empleado`) REFERENCES `gestor_prov` (`id_empleado`) ON DELETE CASCADE;

--
-- Filtros para la tabla `gestor_prov`
--
ALTER TABLE `gestor_prov`
  ADD CONSTRAINT `gestor_prov_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  ADD CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`id_subcategoria`) REFERENCES `subcategoria` (`id_subcategoria`),
  ADD CONSTRAINT `producto_ibfk_4` FOREIGN KEY (`id_tienda`) REFERENCES `tienda` (`id_tienda`);

--
-- Filtros para la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD CONSTRAINT `subcategoria_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Filtros para la tabla `tienda`
--
ALTER TABLE `tienda`
  ADD CONSTRAINT `tienda_ibfk_1` FOREIGN KEY (`administrador`) REFERENCES `administrador` (`id_empleado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
