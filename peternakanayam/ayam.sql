-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2015 at 10:24 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ayam`
--
CREATE DATABASE IF NOT EXISTS `ayam` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ayam`;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_ayam`
--

CREATE TABLE IF NOT EXISTS `tbl_ayam` (
  `Id_jumlah` int(11) NOT NULL AUTO_INCREMENT,
  `Jumlah_ayam` varchar(100) NOT NULL,
  `Jumlah_Sehat` varchar(100) NOT NULL,
  `Jumlah_Sakit` varchar(100) NOT NULL,
  `Jumlah_Mati` varchar(100) NOT NULL,
  `Tanggal_Catat` date NOT NULL,
  PRIMARY KEY (`Id_jumlah`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=124 ;

--
-- Dumping data for table `tbl_ayam`
--

INSERT INTO `tbl_ayam` (`Id_jumlah`, `Jumlah_ayam`, `Jumlah_Sehat`, `Jumlah_Sakit`, `Jumlah_Mati`, `Tanggal_Catat`) VALUES
(8, '8578', '8758', '785', '755', '2001-08-10'),
(16, '400', '390', '5', '5', '2012-02-02'),
(100, '200', '100', '49', '51', '2012-02-03'),
(123, '4000', '900', '600', '500', '2001-09-12');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
