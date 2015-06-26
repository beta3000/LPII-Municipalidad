-- MySQL Script generated by MySQL Workbench
-- 06/23/15 00:44:52
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Proyecto.LPII
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Proyecto.LPII` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `Proyecto.LPII` ;

-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`AsuntoMemorando`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`AsuntoMemorando` (
  `idAsuntoMemorando` INT NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoMemorando` VARCHAR(45) NULL,
  PRIMARY KEY (`idAsuntoMemorando`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`EstadoMemorando`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`EstadoMemorando` (
  `idEstadoMemorando` INT NOT NULL AUTO_INCREMENT,
  `descripcionEstadoMemorando` VARCHAR(45) NULL,
  PRIMARY KEY (`idEstadoMemorando`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`TipoUsuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`TipoUsuario` (
  `idTipoUsuario` INT NOT NULL AUTO_INCREMENT,
  `descripcionTipoUsuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipoUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Distrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Distrito` (
  `idDistrito` INT NOT NULL AUTO_INCREMENT,
  `nombreDistrito` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDistrito`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Sexo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Sexo` (
  `idSexo` INT NOT NULL AUTO_INCREMENT,
  `descripcionSexo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSexo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`AreaMunicipal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`AreaMunicipal` (
  `idAreaMunicipal` INT NOT NULL AUTO_INCREMENT,
  `nombreAreaMunicipal` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAreaMunicipal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`EstadoUsuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`EstadoUsuario` (
  `idEstadoUsuario` INT NOT NULL AUTO_INCREMENT,
  `descripcionEstadoUsuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstadoUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombresUsuario` VARCHAR(45) NOT NULL,
  `apellidoPaternoUsuario` VARCHAR(45) NOT NULL,
  `apellidoMaternoUsuario` VARCHAR(45) NOT NULL,
  `fechaNacimientoUsuario` DATE NOT NULL,
  `direccionUsuario` VARCHAR(45) NOT NULL,
  `correoUsuario` VARCHAR(45) NOT NULL,
  `telefonoUsuario` VARCHAR(45) NULL,
  `dniUsuario` INT NOT NULL,
  `loginUsuario` VARCHAR(45) NOT NULL,
  `passwordUsuario` VARCHAR(45) NOT NULL,
  `idTipoUsuario` INT NOT NULL,
  `idDistrito` INT NOT NULL,
  `idSexo` INT NOT NULL,
  `idAreaMunicipal` INT NOT NULL,
  `idEstadoUsuario` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_TipoUsuario1_idx` (`idTipoUsuario` ASC),
  INDEX `fk_Usuario_Ditrito1_idx` (`idDistrito` ASC),
  INDEX `fk_Usuario_Sexo1_idx` (`idSexo` ASC),
  INDEX `fk_Usuario_AreaMunicipal1_idx` (`idAreaMunicipal` ASC),
  INDEX `fk_Usuario_EstadoUsuario1_idx` (`idEstadoUsuario` ASC),
  CONSTRAINT `fk_Usuario_TipoUsuario1`
    FOREIGN KEY (`idTipoUsuario`)
    REFERENCES `Proyecto.LPII`.`TipoUsuario` (`idTipoUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Ditrito1`
    FOREIGN KEY (`idDistrito`)
    REFERENCES `Proyecto.LPII`.`Distrito` (`idDistrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Sexo1`
    FOREIGN KEY (`idSexo`)
    REFERENCES `Proyecto.LPII`.`Sexo` (`idSexo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_AreaMunicipal1`
    FOREIGN KEY (`idAreaMunicipal`)
    REFERENCES `Proyecto.LPII`.`AreaMunicipal` (`idAreaMunicipal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_EstadoUsuario1`
    FOREIGN KEY (`idEstadoUsuario`)
    REFERENCES `Proyecto.LPII`.`EstadoUsuario` (`idEstadoUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Memorando`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Memorando` (
  `idMemorando` INT NOT NULL AUTO_INCREMENT,
  `fechaMemorando` DATE NOT NULL,
  `contenidoMemorando` TEXT NULL,
  `AsuntoMemorando_idAsuntoMemorando` INT NOT NULL,
  `EstadoMemorando_idEstadoMemorando` INT NOT NULL,
  `idUsuarioRemitente` INT NOT NULL,
  `idUsuarioDestinatario` INT NOT NULL,
  PRIMARY KEY (`idMemorando`),
  INDEX `fk_Memorando_AsuntoMemorando_idx` (`AsuntoMemorando_idAsuntoMemorando` ASC),
  INDEX `fk_Memorando_EstadoMemorando1_idx` (`EstadoMemorando_idEstadoMemorando` ASC),
  INDEX `fk_Memorando_Usuario1_idx` (`idUsuarioRemitente` ASC),
  INDEX `fk_Memorando_Usuario2_idx` (`idUsuarioDestinatario` ASC),
  CONSTRAINT `fk_Memorando_AsuntoMemorando`
    FOREIGN KEY (`AsuntoMemorando_idAsuntoMemorando`)
    REFERENCES `Proyecto.LPII`.`AsuntoMemorando` (`idAsuntoMemorando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Memorando_EstadoMemorando1`
    FOREIGN KEY (`EstadoMemorando_idEstadoMemorando`)
    REFERENCES `Proyecto.LPII`.`EstadoMemorando` (`idEstadoMemorando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Memorando_Usuario1`
    FOREIGN KEY (`idUsuarioRemitente`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Memorando_Usuario2`
    FOREIGN KEY (`idUsuarioDestinatario`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`TallerMecanico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`TallerMecanico` (
  `idTallerMecanico` INT NOT NULL AUTO_INCREMENT,
  `nombreTallerMecanico` VARCHAR(45) NOT NULL,
  `direccionTallerMecanico` VARCHAR(45) NOT NULL,
  `telefonoTallerMecanico` VARCHAR(45) NOT NULL,
  `idDistrito` INT NOT NULL,
  PRIMARY KEY (`idTallerMecanico`),
  INDEX `fk_TallerMecanico_Distrito1_idx` (`idDistrito` ASC),
  CONSTRAINT `fk_TallerMecanico_Distrito1`
    FOREIGN KEY (`idDistrito`)
    REFERENCES `Proyecto.LPII`.`Distrito` (`idDistrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`EstadoSolicitud`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`EstadoSolicitud` (
  `idEstadoSolicitud` INT NOT NULL AUTO_INCREMENT,
  `descripcionEstadoSolicitud` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstadoSolicitud`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`AsuntoSolicitud`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`AsuntoSolicitud` (
  `idAsuntoSolicitud` INT NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoSolicitud` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAsuntoSolicitud`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Solicitud`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Solicitud` (
  `idSolicitud` INT NOT NULL AUTO_INCREMENT,
  `fechaSolicitud` DATE NOT NULL,
  `contenidoSolicitud` TEXT NOT NULL,
  `idEstadoSolicitud` INT NOT NULL,
  `idAsuntoSolicitud` INT NOT NULL,
  `idUsuarioRemitente` INT NOT NULL,
  `idUsuarioDestinatario` INT NOT NULL,
  `idMemorando` INT NOT NULL,
  PRIMARY KEY (`idSolicitud`),
  INDEX `fk_Solicitud_EstadoSolicitud1_idx` (`idEstadoSolicitud` ASC),
  INDEX `fk_Solicitud_AsuntoSolicitud1_idx` (`idAsuntoSolicitud` ASC),
  INDEX `fk_Solicitud_Usuario1_idx` (`idUsuarioRemitente` ASC),
  INDEX `fk_Solicitud_Usuario2_idx` (`idUsuarioDestinatario` ASC),
  INDEX `fk_Solicitud_Memorando1_idx` (`idMemorando` ASC),
  CONSTRAINT `fk_Solicitud_EstadoSolicitud1`
    FOREIGN KEY (`idEstadoSolicitud`)
    REFERENCES `Proyecto.LPII`.`EstadoSolicitud` (`idEstadoSolicitud`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Solicitud_AsuntoSolicitud1`
    FOREIGN KEY (`idAsuntoSolicitud`)
    REFERENCES `Proyecto.LPII`.`AsuntoSolicitud` (`idAsuntoSolicitud`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Solicitud_Usuario1`
    FOREIGN KEY (`idUsuarioRemitente`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Solicitud_Usuario2`
    FOREIGN KEY (`idUsuarioDestinatario`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Solicitud_Memorando1`
    FOREIGN KEY (`idMemorando`)
    REFERENCES `Proyecto.LPII`.`Memorando` (`idMemorando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`AsuntoInforme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`AsuntoInforme` (
  `idAsuntoInforme` INT NOT NULL AUTO_INCREMENT,
  `descripcionAsuntoInforme` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAsuntoInforme`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`EstadoInforme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`EstadoInforme` (
  `idEstadoInforme` INT NOT NULL AUTO_INCREMENT,
  `descripcionEstadoInforme` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstadoInforme`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Vehiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Vehiculo` (
  `idVehiculo` INT NOT NULL AUTO_INCREMENT,
  `placaVehiculo` VARCHAR(45) NULL,
  `marcaVehiculo` VARCHAR(45) NULL,
  `modeloVehiculo` VARCHAR(45) NULL,
  `anioFabricacionVehiculo` INT NULL,
  `colorVehiculo` VARCHAR(45) NULL,
  PRIMARY KEY (`idVehiculo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Proyecto.LPII`.`Informe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proyecto.LPII`.`Informe` (
  `idInforme` INT NOT NULL AUTO_INCREMENT,
  `fechaInforme` DATE NOT NULL,
  `contenidoInforme` TEXT NULL,
  `idUsuarioRemitente` INT NULL,
  `idUsuarioDestinatario` INT NOT NULL,
  `idAsuntoInforme` INT NOT NULL,
  `idEstadoInforme` INT NOT NULL,
  `idTallerMecanico` INT NULL,
  `idVehiculo` INT NULL,
  PRIMARY KEY (`idInforme`),
  INDEX `fk_Informe_Usuario1_idx` (`idUsuarioRemitente` ASC),
  INDEX `fk_Informe_Usuario2_idx` (`idUsuarioDestinatario` ASC),
  INDEX `fk_Informe_AsuntoInforme1_idx` (`idAsuntoInforme` ASC),
  INDEX `fk_Informe_EstadoInforme1_idx` (`idEstadoInforme` ASC),
  INDEX `fk_Informe_TallerMecanico1_idx` (`idTallerMecanico` ASC),
  INDEX `fk_Informe_Vehiculo1_idx` (`idVehiculo` ASC),
  CONSTRAINT `fk_Informe_Usuario1`
    FOREIGN KEY (`idUsuarioRemitente`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_Usuario2`
    FOREIGN KEY (`idUsuarioDestinatario`)
    REFERENCES `Proyecto.LPII`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_AsuntoInforme1`
    FOREIGN KEY (`idAsuntoInforme`)
    REFERENCES `Proyecto.LPII`.`AsuntoInforme` (`idAsuntoInforme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_EstadoInforme1`
    FOREIGN KEY (`idEstadoInforme`)
    REFERENCES `Proyecto.LPII`.`EstadoInforme` (`idEstadoInforme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_TallerMecanico1`
    FOREIGN KEY (`idTallerMecanico`)
    REFERENCES `Proyecto.LPII`.`TallerMecanico` (`idTallerMecanico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Informe_Vehiculo1`
    FOREIGN KEY (`idVehiculo`)
    REFERENCES `Proyecto.LPII`.`Vehiculo` (`idVehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;