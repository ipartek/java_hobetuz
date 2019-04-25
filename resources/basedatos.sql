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
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tienda_animales.gato: ~34 rows (aproximadamente)
DELETE FROM `gato`;
/*!40000 ALTER TABLE `gato` DISABLE KEYS */;
INSERT INTO `gato` (`id`, `nombre`) VALUES
	(25, 'Yate'),
	(26, 'Sarapova'),
	(30, 'TRISKIMISKI'),
	(32, 'Nuevo Gato'),
	(33, 'Misssi'),
	(35, 'Nuevo Gato'),
	(36, 'Misssi'),
	(37, 'Garfield'),
	(42, 'Garfield'),
	(44, 'DKing'),
	(45, 'ander'),
	(46, 'Garfield'),
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
	(60, 'sadfdsafsdfsd'),
	(62, 'Garfield'),
	(63, 'MitxiASD'),
	(64, 'FelixElGato'),
	(65, 'Garfield'),
	(67, 'Felix2'),
	(68, 'Garfield'),
	(70, 'izuuuuu'),
	(72, 'rata'),
	(73, ''),
	(74, 'PAPAPAPA');
/*!40000 ALTER TABLE `gato` ENABLE KEYS */;

-- Volcando estructura para procedimiento tienda_animales.paGatoBuscarPorNombre
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `paGatoBuscarPorNombre`(
	IN `pNombre` VARCHAR(150)
)
BEGIN


	SELECT id, nombre FROM gato WHERE nombre like CONCAT('%',pNombre,'%');

END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
