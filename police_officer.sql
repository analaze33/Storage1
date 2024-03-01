-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 05, 2023 at 10:45 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `traffic_fine_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `police_officer`
--

DROP TABLE IF EXISTS `police_officer`;
CREATE TABLE IF NOT EXISTS `police_officer` (
  `traffic_officer_id` int(30) NOT NULL AUTO_INCREMENT,
  `traffic_officer_email` varchar(100) CHARACTER SET utf32 NOT NULL,
  `traffic_officer_full_name` varchar(100) CHARACTER SET utf32 NOT NULL,
  `traffic_officer_password` varchar(100) CHARACTER SET utf32 NOT NULL,
  `police_station` varchar(100) CHARACTER SET utf32 NOT NULL,
  PRIMARY KEY (`traffic_officer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
