-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         10.1.38-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para tienda_animales
CREATE DATABASE IF NOT EXISTS `tienda_animales` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tienda_animales`;

-- Volcando estructura para tabla tienda_animales.gato
CREATE TABLE IF NOT EXISTS `gato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tienda_animales.gato: ~9 rows (aproximadamente)
DELETE FROM `gato`;
/*!40000 ALTER TABLE `gato` DISABLE KEYS */;
INSERT INTO `gato` (`id`, `nombre`) VALUES
	(20, 'Sergi'),
	(21, 'Cariño'),
	(22, 'gato'),
	(23, 'Soy sara'),
	(24, 'Croasan con mermelada'),
	(25, 'Yate'),
	(26, 'Sarapova'),
	(27, 'Bisartxo'),
	(28, 'Ratatata_Pun'),
	(29, 'JUAN'),
	(30, 'TRISKIMISKI'),
	(32, 'Nuevo Gato'),
	(33, 'Misssi'),
	(34, 'Nuevo Gato'),
	(35, 'Nuevo Gato'),
	(36, 'Misssi'),
	(37, 'Garfield'),
	(39, 'Garfieldfdfdfdfdfdfdf'),
	(40, 'Mitxi'),
	(41, 'null'),
	(42, 'Garfield'),
	(43, 'Mitxi'),
	(44, 'DKing'),
	(45, 'ander'),
	(46, 'Garfield'),
	(47, 'Mitxi'),
	(48, 'Napoleon'),
	(49, 'Diosdado The King'),
	(50, 'MikelMitixi'),
	(51, 'uno'),
	(52, 'uno'),
	(53, 'dos'),
	(54, 'otro gato'),
	(55, 'ultimo gato'),
	(56, 'uno'),
	(57, 'dos'),
	(58, 'otro gato'),
	(59, 'ultimo gato'),
	(60, 'sadfdsafsdfsd');
/*!40000 ALTER TABLE `gato` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
