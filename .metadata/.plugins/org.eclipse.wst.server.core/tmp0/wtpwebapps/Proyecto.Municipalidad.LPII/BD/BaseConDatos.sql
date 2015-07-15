CREATE DATABASE  IF NOT EXISTS `proyecto.lpii` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `proyecto.lpii`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: proyecto.lpii
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `areamunicipal`
--

DROP TABLE IF EXISTS `areamunicipal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areamunicipal` (
  `idAreaMunicipal` int(11) NOT NULL AUTO_INCREMENT,
  `nombreAreaMunicipal` varchar(45) NOT NULL,
  PRIMARY KEY (`idAreaMunicipal`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areamunicipal`
--

LOCK TABLES `areamunicipal` WRITE;
/*!40000 ALTER TABLE `areamunicipal` DISABLE KEYS */;
INSERT INTO `areamunicipal` VALUES (1,'Sistemas'),(2,'Servicios Generales'),(3,'Sub Gerencia Logística'),(4,'Seguridad Ciudadana'),(5,'Desarrollo Urbano'),(6,'Transporte Urbano');
/*!40000 ALTER TABLE `areamunicipal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asuntocronograma`
--

DROP TABLE IF EXISTS `asuntocronograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asuntocronograma` (
  `idAsuntoCronograma` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoCronograma` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAsuntoCronograma`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asuntocronograma`
--

LOCK TABLES `asuntocronograma` WRITE;
/*!40000 ALTER TABLE `asuntocronograma` DISABLE KEYS */;
INSERT INTO `asuntocronograma` VALUES (1,'Servicio Vehicular'),(2,'Reparación Vehicular');
/*!40000 ALTER TABLE `asuntocronograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asuntoinforme`
--

DROP TABLE IF EXISTS `asuntoinforme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asuntoinforme` (
  `idAsuntoInforme` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoInforme` varchar(45) NOT NULL,
  PRIMARY KEY (`idAsuntoInforme`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asuntoinforme`
--

LOCK TABLES `asuntoinforme` WRITE;
/*!40000 ALTER TABLE `asuntoinforme` DISABLE KEYS */;
INSERT INTO `asuntoinforme` VALUES (1,'Servicio Vehicular'),(2,'Reparación Vehicular');
/*!40000 ALTER TABLE `asuntoinforme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asuntomemorando`
--

DROP TABLE IF EXISTS `asuntomemorando`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asuntomemorando` (
  `idAsuntoMemorando` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoMemorando` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAsuntoMemorando`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asuntomemorando`
--

LOCK TABLES `asuntomemorando` WRITE;
/*!40000 ALTER TABLE `asuntomemorando` DISABLE KEYS */;
INSERT INTO `asuntomemorando` VALUES (1,'Requerimiento Vehicular'),(2,'Reparación Vehicular');
/*!40000 ALTER TABLE `asuntomemorando` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cronograma`
--

DROP TABLE IF EXISTS `cronograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cronograma` (
  `idCronograma` int(11) NOT NULL AUTO_INCREMENT,
  `fechaCronograma` date DEFAULT NULL,
  `fechaEntregaCronograma` date DEFAULT NULL,
  `idVehiculo` int(11) NOT NULL,
  `idAsuntoCronograma` int(11) NOT NULL,
  `idEstadoCronograma` int(11) NOT NULL,
  PRIMARY KEY (`idCronograma`),
  KEY `fk_Cronograma_Vehiculo1_idx` (`idVehiculo`),
  KEY `fk_Cronograma_AsuntoCronograma1_idx` (`idAsuntoCronograma`),
  KEY `fk_Cronograma_EstadoCronograma1_idx` (`idEstadoCronograma`),
  CONSTRAINT `fk_Cronograma_AsuntoCronograma1` FOREIGN KEY (`idAsuntoCronograma`) REFERENCES `asuntocronograma` (`idAsuntoCronograma`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cronograma_EstadoCronograma1` FOREIGN KEY (`idEstadoCronograma`) REFERENCES `estadocronograma` (`idEstadoCronograma`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cronograma_Vehiculo1` FOREIGN KEY (`idVehiculo`) REFERENCES `vehiculo` (`idVehiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cronograma`
--

LOCK TABLES `cronograma` WRITE;
/*!40000 ALTER TABLE `cronograma` DISABLE KEYS */;
/*!40000 ALTER TABLE `cronograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distrito`
--

DROP TABLE IF EXISTS `distrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `distrito` (
  `idDistrito` int(11) NOT NULL AUTO_INCREMENT,
  `nombreDistrito` varchar(45) NOT NULL,
  PRIMARY KEY (`idDistrito`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distrito`
--

LOCK TABLES `distrito` WRITE;
/*!40000 ALTER TABLE `distrito` DISABLE KEYS */;
INSERT INTO `distrito` VALUES (1,'Ate'),(2,'Breña'),(3,'Cercado');
/*!40000 ALTER TABLE `distrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadocronograma`
--

DROP TABLE IF EXISTS `estadocronograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadocronograma` (
  `idEstadoCronograma` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionEstadoCronograma` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstadoCronograma`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadocronograma`
--

LOCK TABLES `estadocronograma` WRITE;
/*!40000 ALTER TABLE `estadocronograma` DISABLE KEYS */;
INSERT INTO `estadocronograma` VALUES (1,'iniciado'),(2,'revisado'),(3,'archivado');
/*!40000 ALTER TABLE `estadocronograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadoinforme`
--

DROP TABLE IF EXISTS `estadoinforme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadoinforme` (
  `idEstadoInforme` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionEstadoInforme` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstadoInforme`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadoinforme`
--

LOCK TABLES `estadoinforme` WRITE;
/*!40000 ALTER TABLE `estadoinforme` DISABLE KEYS */;
INSERT INTO `estadoinforme` VALUES (1,'iniciado'),(2,'revisado'),(3,'archivado');
/*!40000 ALTER TABLE `estadoinforme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadomemorando`
--

DROP TABLE IF EXISTS `estadomemorando`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadomemorando` (
  `idEstadoMemorando` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionEstadoMemorando` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstadoMemorando`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadomemorando`
--

LOCK TABLES `estadomemorando` WRITE;
/*!40000 ALTER TABLE `estadomemorando` DISABLE KEYS */;
INSERT INTO `estadomemorando` VALUES (1,'iniciado'),(2,'revisado'),(3,'archivado');
/*!40000 ALTER TABLE `estadomemorando` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadousuario`
--

DROP TABLE IF EXISTS `estadousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadousuario` (
  `idEstadoUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionEstadoUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstadoUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadousuario`
--

LOCK TABLES `estadousuario` WRITE;
/*!40000 ALTER TABLE `estadousuario` DISABLE KEYS */;
INSERT INTO `estadousuario` VALUES (1,'activo'),(2,'desactivo');
/*!40000 ALTER TABLE `estadousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informe`
--

DROP TABLE IF EXISTS `informe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `informe` (
  `idInforme` int(11) NOT NULL AUTO_INCREMENT,
  `fechaInforme` date NOT NULL,
  `fechaEntregaInforme` date DEFAULT NULL,
  `contenidoInforme` text,
  `idUsuarioRemitente` int(11) DEFAULT NULL,
  `idAsuntoInforme` int(11) NOT NULL,
  `idEstadoInforme` int(11) NOT NULL,
  `idTallerMecanico` int(11) DEFAULT NULL,
  `idVehiculo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idInforme`),
  KEY `fk_Informe_Usuario1_idx` (`idUsuarioRemitente`),
  KEY `fk_Informe_AsuntoInforme1_idx` (`idAsuntoInforme`),
  KEY `fk_Informe_EstadoInforme1_idx` (`idEstadoInforme`),
  KEY `fk_Informe_TallerMecanico1_idx` (`idTallerMecanico`),
  KEY `fk_Informe_Vehiculo1_idx` (`idVehiculo`),
  CONSTRAINT `fk_Informe_AsuntoInforme1` FOREIGN KEY (`idAsuntoInforme`) REFERENCES `asuntoinforme` (`idAsuntoInforme`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_EstadoInforme1` FOREIGN KEY (`idEstadoInforme`) REFERENCES `estadoinforme` (`idEstadoInforme`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_TallerMecanico1` FOREIGN KEY (`idTallerMecanico`) REFERENCES `tallermecanico` (`idTallerMecanico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_Usuario1` FOREIGN KEY (`idUsuarioRemitente`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_Vehiculo1` FOREIGN KEY (`idVehiculo`) REFERENCES `vehiculo` (`idVehiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informe`
--

LOCK TABLES `informe` WRITE;
/*!40000 ALTER TABLE `informe` DISABLE KEYS */;
INSERT INTO `informe` VALUES (1,'2015-07-15','2015-07-01','			 aaaaaa',4,1,1,NULL,1),(2,'2015-07-15','2015-07-17','			  bbbbb',4,1,1,NULL,1);
/*!40000 ALTER TABLE `informe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memorando`
--

DROP TABLE IF EXISTS `memorando`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memorando` (
  `idMemorando` int(11) NOT NULL AUTO_INCREMENT,
  `fechaMemorando` date NOT NULL,
  `contenidoMemorando` text,
  `idAsuntoMemorando` int(11) NOT NULL,
  `idEstadoMemorando` int(11) NOT NULL,
  `idUsuarioRemitente` int(11) NOT NULL,
  PRIMARY KEY (`idMemorando`),
  KEY `fk_Memorando_AsuntoMemorando_idx` (`idAsuntoMemorando`),
  KEY `fk_Memorando_EstadoMemorando1_idx` (`idEstadoMemorando`),
  KEY `fk_Memorando_Usuario1_idx` (`idUsuarioRemitente`),
  CONSTRAINT `fk_Memorando_AsuntoMemorando` FOREIGN KEY (`idAsuntoMemorando`) REFERENCES `asuntomemorando` (`idAsuntoMemorando`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Memorando_EstadoMemorando1` FOREIGN KEY (`idEstadoMemorando`) REFERENCES `estadomemorando` (`idEstadoMemorando`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Memorando_Usuario1` FOREIGN KEY (`idUsuarioRemitente`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memorando`
--

LOCK TABLES `memorando` WRITE;
/*!40000 ALTER TABLE `memorando` DISABLE KEYS */;
INSERT INTO `memorando` VALUES (1,'2015-07-15','			  aaaaaaaaaaaaaaaa',1,1,3),(2,'2015-07-15','			 bbbb',2,1,3);
/*!40000 ALTER TABLE `memorando` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tallermecanico`
--

DROP TABLE IF EXISTS `tallermecanico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tallermecanico` (
  `idTallerMecanico` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTallerMecanico` varchar(45) NOT NULL,
  `direccionTallerMecanico` varchar(45) NOT NULL,
  `telefonoTallerMecanico` varchar(45) NOT NULL,
  `idDistrito` int(11) NOT NULL,
  PRIMARY KEY (`idTallerMecanico`),
  KEY `fk_TallerMecanico_Distrito1_idx` (`idDistrito`),
  CONSTRAINT `fk_TallerMecanico_Distrito1` FOREIGN KEY (`idDistrito`) REFERENCES `distrito` (`idDistrito`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tallermecanico`
--

LOCK TABLES `tallermecanico` WRITE;
/*!40000 ALTER TABLE `tallermecanico` DISABLE KEYS */;
INSERT INTO `tallermecanico` VALUES (1,'El Rapido','Jr. Gardenias 322','581-2158',1);
/*!40000 ALTER TABLE `tallermecanico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `idTipoUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionTipoUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idTipoUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'Administrador'),(2,'Jefe de Área'),(3,'Chofer'),(4,'Secretaria');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombresUsuario` varchar(45) NOT NULL,
  `apellidoPaternoUsuario` varchar(45) NOT NULL,
  `apellidoMaternoUsuario` varchar(45) NOT NULL,
  `fechaNacimientoUsuario` date NOT NULL,
  `direccionUsuario` varchar(45) NOT NULL,
  `correoUsuario` varchar(45) NOT NULL,
  `telefonoUsuario` varchar(45) DEFAULT NULL,
  `dniUsuario` int(11) NOT NULL,
  `sexoUsuario` varchar(45) NOT NULL,
  `loginUsuario` varchar(45) NOT NULL,
  `passwordUsuario` varchar(45) NOT NULL,
  `idTipoUsuario` int(11) NOT NULL,
  `idDistrito` int(11) NOT NULL,
  `idAreaMunicipal` int(11) NOT NULL,
  `idEstadoUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_Usuario_TipoUsuario1_idx` (`idTipoUsuario`),
  KEY `fk_Usuario_Ditrito1_idx` (`idDistrito`),
  KEY `fk_Usuario_AreaMunicipal1_idx` (`idAreaMunicipal`),
  KEY `fk_Usuario_EstadoUsuario1_idx` (`idEstadoUsuario`),
  CONSTRAINT `fk_Usuario_AreaMunicipal1` FOREIGN KEY (`idAreaMunicipal`) REFERENCES `areamunicipal` (`idAreaMunicipal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Ditrito1` FOREIGN KEY (`idDistrito`) REFERENCES `distrito` (`idDistrito`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_EstadoUsuario1` FOREIGN KEY (`idEstadoUsuario`) REFERENCES `estadousuario` (`idEstadoUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_TipoUsuario1` FOREIGN KEY (`idTipoUsuario`) REFERENCES `tipousuario` (`idTipoUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Uno1','Uno','Uno','2015-07-14','Uno','Uno@gmail.com','12345',12345,'Masculino','asd','asd',1,1,1,1),(2,'Uno1','Uno','Uno','2015-07-10','Uno','Uno@gmail.com','54896',142542,'Masculino','ert','ert',3,2,1,1),(3,'JaPrueba','JaPrueba','JaPrueba','2015-01-01','JaPrueba','JaPrueba@gmail.com','12345',12345,'Femenino','qwe','qwe',2,1,4,1),(4,'ChoferPrueba','ChoferPrueba','ChoferPrueba','2015-07-14','ChoferPrueba','ChoferPrueba@gmail.com','11111111',11111,'Masculino','chofer1','chofer1',3,2,4,1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculo` (
  `idVehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `placaVehiculo` varchar(45) DEFAULT NULL,
  `marcaVehiculo` varchar(45) DEFAULT NULL,
  `modeloVehiculo` varchar(45) DEFAULT NULL,
  `anioFabricacionVehiculo` int(11) DEFAULT NULL,
  `colorVehiculo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idVehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,'MSD-777','Toyota','Run 356',2015,'Azul');
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-15  7:46:15
