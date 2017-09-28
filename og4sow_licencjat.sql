-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Host: sqloslo.dhosting.pl
-- Generation Time: Sep 28, 2017 at 08:02 AM
-- Server version: 10.1.24-MariaDB-cll-lve
-- PHP Version: 5.3.23-dh103

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `og4sow_licencjat`
--

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE IF NOT EXISTS `characters` (
  `name` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `accountBalance` int(11) NOT NULL DEFAULT '0',
  `tetrisLVL` int(11) NOT NULL DEFAULT '1',
  `saperLVL` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`name`),
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`name`, `password`, `accountBalance`, `tetrisLVL`, `saperLVL`) VALUES
('muszkie', 'passwd', 33892, 43, 33),
('muszro', 'passswd', 100, 3, 5),
('muszkie23', 'passwd', 500, 11, 13),
('muszki', 'passswd', 0, 1, 1),
('', '', 5831, 5, 7);

-- --------------------------------------------------------

--
-- Table structure for table `pacman`
--

CREATE TABLE IF NOT EXISTS `pacman` (
  `name` varchar(30) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pacman`
--

INSERT INTO `pacman` (`name`, `score`) VALUES
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0);

-- --------------------------------------------------------

--
-- Table structure for table `saper`
--

CREATE TABLE IF NOT EXISTS `saper` (
  `name` varchar(30) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saper`
--

INSERT INTO `saper` (`name`, `score`) VALUES
('', 22),
('', 22),
('empty', 999),
('empty', 999),
('empty', 999),
('empty', 999),
('empty', 999),
('empty', 999),
('empty', 999),
('empty', 999);

-- --------------------------------------------------------

--
-- Table structure for table `tetris`
--

CREATE TABLE IF NOT EXISTS `tetris` (
  `name` varchar(30) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tetris`
--

INSERT INTO `tetris` (`name`, `score`) VALUES
('', 126),
('', 28),
('', 14),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0),
('empty', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
