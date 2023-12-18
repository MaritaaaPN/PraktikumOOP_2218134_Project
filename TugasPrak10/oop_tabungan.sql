-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2023 at 11:14 AM
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
-- Database: `oop_tabungan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_tabungan`
--

CREATE TABLE `tb_tabungan` (
  `id` int(11) NOT NULL,
  `No_Tabungan` int(8) NOT NULL,
  `Tanggal` date NOT NULL,
  `Nama_Siswa` varchar(20) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Sekolah` varchar(20) NOT NULL,
  `Informasi_Saldo` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_tabungan`
--

INSERT INTO `tb_tabungan` (`id`, `No_Tabungan`, `Tanggal`, `Nama_Siswa`, `Jenis_Kelamin`, `Sekolah`, `Informasi_Saldo`) VALUES
(7, 2218134, '2023-12-12', 'Marita Putri Nabila', 'P', 'SMA Negeri Batu', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id` int(11) NOT NULL,
  `No_Tabungan` int(8) NOT NULL,
  `Sawal` int(15) NOT NULL,
  `Setor` int(10) NOT NULL,
  `Tarik` int(10) NOT NULL,
  `Total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id`, `No_Tabungan`, `Sawal`, `Setor`, `Tarik`, `Total`) VALUES
(3, 2218134, 2000000, 1500000, 0, 3500000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_tabungan`
--
ALTER TABLE `tb_tabungan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_tabungan`
--
ALTER TABLE `tb_tabungan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
