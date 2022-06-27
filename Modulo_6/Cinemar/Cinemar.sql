CREATE DATABASE  IF NOT EXISTS `cinemar` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinemar`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: cinemar
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `butaca`
--

DROP TABLE IF EXISTS `butaca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `butaca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fila` varchar(1) DEFAULT NULL,
  `numero` tinyint DEFAULT NULL,
  `reservada` tinyint(1) DEFAULT NULL,
  `id_sala` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sala_butaca_fk` (`id_sala`),
  CONSTRAINT `sala_butaca_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clasificacion`
--

DROP TABLE IF EXISTS `clasificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clasificacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identificador` varchar(3) DEFAULT NULL,
  `recomendacion` varchar(30) DEFAULT NULL,
  `descipcion` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `descuento`
--

DROP TABLE IF EXISTS `descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `descuento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `porcentaje` float DEFAULT NULL,
  `dia` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(196) DEFAULT NULL,
  `sinopsis` varchar(1024) DEFAULT NULL,
  `duracion` int NOT NULL,
  `id_clasificacion` int NOT NULL,
  `id_tipo` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `clasificacion_fk` (`id_clasificacion`),
  KEY `tipo_fk` (`id_tipo`),
  CONSTRAINT `clasificacion_fk` FOREIGN KEY (`id_clasificacion`) REFERENCES `clasificacion` (`id`),
  CONSTRAINT `tipo_fk` FOREIGN KEY (`id_tipo`) REFERENCES `tipopelicula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `peliculaxgenero`
--

DROP TABLE IF EXISTS `peliculaxgenero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `peliculaxgenero` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_pelicula` int NOT NULL,
  `id_genero` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pelicula_pxg_fk` (`id_pelicula`),
  KEY `genero_pxg_fk` (`id_genero`),
  CONSTRAINT `genero_pxg_fk` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`),
  CONSTRAINT `pelicula_pxg_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `peliculaxreparto`
--

DROP TABLE IF EXISTS `peliculaxreparto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `peliculaxreparto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_pelicula` int NOT NULL,
  `id_reparto` int NOT NULL,
  `rol` varchar(20) DEFAULT NULL,
  `personaje` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pelicula_fk` (`id_pelicula`),
  KEY `reparto_fk` (`id_reparto`),
  CONSTRAINT `pelicula_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`),
  CONSTRAINT `reparto_fk` FOREIGN KEY (`id_reparto`) REFERENCES `reparto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reparto`
--

DROP TABLE IF EXISTS `reparto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reparto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `id` int NOT NULL AUTO_INCREMENT,
  `precio` float DEFAULT NULL,
  `fecha_compra` timestamp NULL DEFAULT NULL,
  `id_sesion` int NOT NULL,
  `id_butaca` int NOT NULL,
  `id_usuario` int NOT NULL,
  `id_tc` bigint unsigned NOT NULL,
  `id_descuento` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sesion_reserva_fk` (`id_sesion`),
  KEY `butaca_reserva_fk` (`id_butaca`),
  KEY `usuario_reserva_fk` (`id_usuario`),
  KEY `tc_reserva_fk` (`id_tc`),
  KEY `descuento_reserva_fk` (`id_descuento`),
  CONSTRAINT `butaca_reserva_fk` FOREIGN KEY (`id_butaca`) REFERENCES `butaca` (`id`),
  CONSTRAINT `descuento_reserva_fk` FOREIGN KEY (`id_descuento`) REFERENCES `descuento` (`id`),
  CONSTRAINT `sesion_reserva_fk` FOREIGN KEY (`id_sesion`) REFERENCES `sesion` (`id`),
  CONSTRAINT `tc_reserva_fk` FOREIGN KEY (`id_tc`) REFERENCES `tarjetacredito` (`numero`),
  CONSTRAINT `usuario_reserva_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `formato` varchar(3) DEFAULT NULL,
  `capacidad` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sesion`
--

DROP TABLE IF EXISTS `sesion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sesion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NULL DEFAULT NULL,
  `id_sala` int NOT NULL,
  `id_pelicula` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sala_sesion_fk` (`id_sala`),
  KEY `pelicula_sesion_fk` (`id_pelicula`),
  CONSTRAINT `pelicula_sesion_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`),
  CONSTRAINT `sala_sesion_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tarjetacredito`
--

DROP TABLE IF EXISTS `tarjetacredito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjetacredito` (
  `numero` bigint unsigned NOT NULL,
  `banco` varchar(20) DEFAULT NULL,
  `titular` varchar(60) DEFAULT NULL,
  `fecha_caducidad` date DEFAULT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `usuario_tc_fk` (`id_usuario`),
  CONSTRAINT `usuario_tc_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tipopelicula`
--

DROP TABLE IF EXISTS `tipopelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipopelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `formato` varchar(3) DEFAULT NULL,
  `idioma` varchar(12) DEFAULT NULL,
  `subtitulada` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `dni` int unsigned NOT NULL,
  `fecha_nac` date DEFAULT NULL,
  `contrasenia` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-22 12:12:20
