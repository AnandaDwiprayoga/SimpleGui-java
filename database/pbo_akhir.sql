-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2019 at 11:43 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_akhir`
--

-- --------------------------------------------------------

--
-- Table structure for table `ambil_matkul`
--

CREATE TABLE `ambil_matkul` (
  `id` int(11) NOT NULL,
  `semester` int(2) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_matkul` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ambil_matkul`
--

INSERT INTO `ambil_matkul` (`id`, `semester`, `id_user`, `id_matkul`) VALUES
(1, 1, 1831710119, 26),
(2, 1, 1831710119, 6),
(3, 1, 1831710119, 11),
(4, 1, 1831710119, 10),
(5, 1, 1831710119, 12),
(6, 1, 1831710119, 23),
(7, 1, 1831710119, 2),
(8, 1, 1831710119, 25),
(9, 1, 1831710119, 1),
(10, 1, 1831710119, 1);

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `id_matkul` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jumlah` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`id_matkul`, `nama`, `jumlah`) VALUES
(1, 'Design Interface', 3),
(2, 'Dasar Pemrograman', 2),
(3, 'Konsep Teknologi Informasi', 3),
(4, 'Sistem Operasi', 2),
(5, 'Matematika Diskrit', 3),
(6, 'Bahasa Inggris', 2),
(7, 'Sistem Informasi', 2),
(8, 'Pemrograman Web', 3),
(9, 'Pemrograman Web Lanjut', 3),
(10, 'Basis Data', 3),
(11, 'Bahasa Inggris Lanjut', 3),
(12, 'Basis Data Lanjut', 3),
(13, 'Pemrograman Web Lanjut', 3),
(14, 'Pemrograman FrameWork', 3),
(15, 'Jaringan', 3),
(16, 'Pemrograman Jaringan', 3),
(17, 'Design Jaringan', 2),
(18, 'Pengamanan Sistem', 3),
(19, 'Pemrograman Mobile', 3),
(20, 'Pendidikan Agama Islam', 3),
(21, 'Pendidikan Kewarganegaraan', 2),
(22, 'Komunikasi dan Organisasi', 2),
(23, 'Big Data', 3),
(24, 'Machine Learning', 3),
(25, 'Data Saintics', 3),
(26, 'Artificial Intelegent', 3),
(27, 'Sistem Robot', 3),
(28, 'Projek1', 3),
(29, 'Projek2', 3),
(30, 'Projek3', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `NIM` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`NIM`, `nama`, `password`, `alamat`) VALUES
(1831710118, 'Kharisma Tri Hayuningtyas', '1831710118', 'Desa Mojoarum Gondang'),
(1831710119, 'Ananda dwi prayoga', '1831710119', 'Desa mojoarum kecamatan gondang');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ambil_matkul`
--
ALTER TABLE `ambil_matkul`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_matkul` (`id_matkul`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`id_matkul`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`NIM`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ambil_matkul`
--
ALTER TABLE `ambil_matkul`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `matkul`
--
ALTER TABLE `matkul`
  MODIFY `id_matkul` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ambil_matkul`
--
ALTER TABLE `ambil_matkul`
  ADD CONSTRAINT `ambil_matkul_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`NIM`),
  ADD CONSTRAINT `ambil_matkul_ibfk_2` FOREIGN KEY (`id_matkul`) REFERENCES `matkul` (`id_matkul`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
