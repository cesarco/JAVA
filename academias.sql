-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 31, 2022 at 03:14 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `academias`
--

-- --------------------------------------------------------

--
-- Table structure for table `Academias`
--

CREATE TABLE `Academias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  `telefono` varchar(100) COLLATE utf8_bin NOT NULL,
  `web` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `Academias`
--

INSERT INTO `Academias` (`id`, `nombre`, `telefono`, `web`) VALUES
(1, 'academia online', '25484457', 'academiaonline.com');

-- --------------------------------------------------------

--
-- Table structure for table `Alumnos`
--

CREATE TABLE `Alumnos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(80) COLLATE utf8_bin NOT NULL,
  `apellido` varchar(80) COLLATE utf8_bin NOT NULL,
  `email` varchar(80) COLLATE utf8_bin NOT NULL,
  `telefono` varchar(45) COLLATE utf8_bin NOT NULL,
  `academia_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `Alumno_x_Cursos`
--

CREATE TABLE `Alumno_x_Cursos` (
  `id` int(11) NOT NULL,
  `alumnos_id` int(11) NOT NULL,
  `cursos_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `Cursos`
--

CREATE TABLE `Cursos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(80) COLLATE utf8_bin NOT NULL,
  `descripcion` text COLLATE utf8_bin NOT NULL,
  `profesor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `Notas`
--

CREATE TABLE `Notas` (
  `id` int(11) NOT NULL,
  `nota` float NOT NULL,
  `curso_id` int(11) NOT NULL,
  `alumno_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `Profesores`
--

CREATE TABLE `Profesores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido` varchar(50) COLLATE utf8_bin NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  `academia_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Academias`
--
ALTER TABLE `Academias`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Alumnos`
--
ALTER TABLE `Alumnos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `academia_alumno_fk` (`academia_id`);

--
-- Indexes for table `Alumno_x_Cursos`
--
ALTER TABLE `Alumno_x_Cursos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `alumno_cursos_fk` (`alumnos_id`),
  ADD KEY `cursos_alumno_fk` (`cursos_id`);

--
-- Indexes for table `Cursos`
--
ALTER TABLE `Cursos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `profesor_curso_fk` (`profesor_id`);

--
-- Indexes for table `Notas`
--
ALTER TABLE `Notas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nota_curso_fk` (`curso_id`),
  ADD KEY `nota_alumno` (`alumno_id`);

--
-- Indexes for table `Profesores`
--
ALTER TABLE `Profesores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `academia_fk` (`academia_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Academias`
--
ALTER TABLE `Academias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `Alumnos`
--
ALTER TABLE `Alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Alumno_x_Cursos`
--
ALTER TABLE `Alumno_x_Cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Cursos`
--
ALTER TABLE `Cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Notas`
--
ALTER TABLE `Notas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Profesores`
--
ALTER TABLE `Profesores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Alumnos`
--
ALTER TABLE `Alumnos`
  ADD CONSTRAINT `academia_alumno_fk` FOREIGN KEY (`academia_id`) REFERENCES `Academias` (`id`);

--
-- Constraints for table `Alumno_x_Cursos`
--
ALTER TABLE `Alumno_x_Cursos`
  ADD CONSTRAINT `alumno_cursos_fk` FOREIGN KEY (`alumnos_id`) REFERENCES `Alumnos` (`id`),
  ADD CONSTRAINT `cursos_alumno_fk` FOREIGN KEY (`cursos_id`) REFERENCES `Cursos` (`id`);

--
-- Constraints for table `Cursos`
--
ALTER TABLE `Cursos`
  ADD CONSTRAINT `profesor_curso_fk` FOREIGN KEY (`profesor_id`) REFERENCES `Profesores` (`id`);

--
-- Constraints for table `Notas`
--
ALTER TABLE `Notas`
  ADD CONSTRAINT `nota_alumno` FOREIGN KEY (`alumno_id`) REFERENCES `Alumnos` (`id`),
  ADD CONSTRAINT `nota_curso_fk` FOREIGN KEY (`curso_id`) REFERENCES `Cursos` (`id`);

--
-- Constraints for table `Profesores`
--
ALTER TABLE `Profesores`
  ADD CONSTRAINT `academia_fk` FOREIGN KEY (`academia_id`) REFERENCES `Academias` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
