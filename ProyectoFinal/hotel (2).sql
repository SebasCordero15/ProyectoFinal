-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2024 a las 09:15:10
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `telefono` varchar(8) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `nombreP` varchar(30) NOT NULL,
  `edadP` int(2) NOT NULL,
  `raza` varchar(15) NOT NULL,
  `tamaño` varchar(7) NOT NULL,
  `genero` varchar(9) NOT NULL,
  `observaciones` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`nombre`, `apellido`, `cedula`, `telefono`, `direccion`, `correo`, `nombreP`, `edadP`, `raza`, `tamaño`, `genero`, `observaciones`) VALUES
('Indira', 'Ramirez', '1194000349', '6402620', 'Taras', 'indiraguz@gmail.com', 'Rosco', 4, 'Salchicha', 'Pequeño', 'H', 'Inquieto'),
('Keylor', 'Badilla', '123456789', '64589635', 'Tres Rios', 'k@gmail.com', 'Loky', 1, 'Pastor aleman', 'Grande', 'M', 'Entrenado'),
('Diego', 'Benavides', '156985632', '8986556', 'Tibas', 'd@hotmail.com', 'Rocky', 10, 'Labrador', 'Mediano', 'M', 'Sano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `nombre` varchar(15) NOT NULL,
  `nombreP` varchar(15) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `cantidadN` int(1) NOT NULL,
  `habitacion` varchar(3) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `dogWalking` int(1) NOT NULL,
  `grooming` varchar(2) NOT NULL,
  `numFactura` int(50) NOT NULL,
  `totalEstadia` int(50) NOT NULL,
  `totalDogWalking` int(50) NOT NULL,
  `totalGromming` int(50) NOT NULL,
  `MontTotal` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`nombre`, `nombreP`, `cedula`, `cantidadN`, `habitacion`, `fechaIngreso`, `fechaSalida`, `dogWalking`, `grooming`, `numFactura`, `totalEstadia`, `totalDogWalking`, `totalGromming`, `MontTotal`) VALUES
('Keylor', 'Loky', '123456789', 2, 'H2', '2024-04-21', '2024-04-24', 2, 'SI', 1, 10000, 10000, 3000, 23000),
('Diego', 'Rocky', '156985632', 1, 'H 3', '2024-04-19', '2024-04-20', 2, 'SI', 2, 5000, 10000, 3000, 18000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `nombre` varchar(30) NOT NULL,
  `nombreP` varchar(30) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `cantidadN` int(2) NOT NULL,
  `habitacion` varchar(10) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaSalida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`nombre`, `nombreP`, `cedula`, `cantidadN`, `habitacion`, `fechaIngreso`, `fechaSalida`) VALUES
('Keylor', 'Loky', '123456789', 2, 'H2', '2024-04-21', '2024-04-24'),
('Diego', 'Rocky', '156985632', 1, 'H 3', '2024-04-19', '2024-04-20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `nombre` varchar(30) NOT NULL,
  `nombreP` varchar(30) NOT NULL,
  `cedula` varchar(9) NOT NULL,
  `cantidadN` int(1) NOT NULL,
  `habitacion` varchar(3) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `dogWalking` int(1) NOT NULL,
  `grooming` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`nombre`, `nombreP`, `cedula`, `cantidadN`, `habitacion`, `fechaIngreso`, `fechaSalida`, `dogWalking`, `grooming`) VALUES
('Keylor', 'Loky', '123456789', 2, 'H2', '2024-04-21', '2024-04-24', 2, 'SI'),
('Diego', 'Rocky', '156985632', 1, 'H 3', '2024-04-19', '2024-04-20', 2, 'SI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `correo` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`correo`, `nombre`, `usuario`, `contraseña`) VALUES
('Aida@roof.com', 'aida', 'AIRG', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`numFactura`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `numFactura` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
