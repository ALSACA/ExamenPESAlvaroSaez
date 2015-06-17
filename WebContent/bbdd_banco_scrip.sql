-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `banco`;


-- Volcando estructura para tabla banco.tarjetas
DROP TABLE IF EXISTS `tarjetas`;
CREATE TABLE IF NOT EXISTS `tarjetas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(12) unsigned zerofill NOT NULL,
  `cupoMaximo` varchar(50) DEFAULT NULL,
  `cupoDisponible` varchar(50) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `numeroComprobacion` varchar(7) DEFAULT NULL,
  `contrasenha` varchar(4) DEFAULT NULL,
  `bloqueada` tinyint(1) DEFAULT NULL,
  UNIQUE KEY `numero` (`numero`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1 COMMENT='tarjetas banco';

-- Volcando datos para la tabla banco.tarjetas: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tarjetas` DISABLE KEYS */;
REPLACE INTO `tarjetas` (`id`, `numero`, `cupoMaximo`, `cupoDisponible`, `tipo`, `numeroComprobacion`, `contrasenha`, `bloqueada`) VALUES
	(1, 000000123456, '100', '500', 'master', '1234', '1111', 1),
	(5, 000000321654, '150', '1000', 'visa', '4561', '2222', 0),
	(7, 000000987456, '150', '2000', 'master', '1234', '4444', 1);
/*!40000 ALTER TABLE `tarjetas` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
