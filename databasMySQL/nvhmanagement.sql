-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 26, 2023 lúc 04:56 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `nvhmanagement`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `userid` varchar(30) NOT NULL,
  `accountname` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `note` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`userid`, `accountname`, `password`, `note`) VALUES
('311', 'hoang11', 'hoang1', NULL),
('361', 'tuando', 'tuan1', NULL),
('362', 'tranthuan', 'thuan1', 'test1'),
('363', 'hoangtranvan1', '111111', 'test1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `activity`
--

CREATE TABLE `activity` (
  `activityid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `timestart` datetime NOT NULL,
  `tìmefinish` datetime NOT NULL,
  `note` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `activity`
--

INSERT INTO `activity` (`activityid`, `name`, `timestart`, `tìmefinish`, `note`) VALUES
(1, 'hop lop', '2023-12-19 13:29:41', '2023-12-19 13:29:41', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `device`
--

CREATE TABLE `device` (
  `deviceid` int(11) NOT NULL,
  `devicename` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(30) NOT NULL,
  `roomid` int(11) NOT NULL,
  `note` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Đang đổ dữ liệu cho bảng `device`
--

INSERT INTO `device` (`deviceid`, `devicename`, `amount`, `price`, `status`, `roomid`, `note`) VALUES
(1, 'quat', 10, 10000, 'ok', 1, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `manageraccount`
--

CREATE TABLE `manageraccount` (
  `userid` varchar(30) NOT NULL,
  `accountname` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `secques` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `manageraccount`
--

INSERT INTO `manageraccount` (`userid`, `accountname`, `password`, `secques`, `answer`) VALUES
('361', 'thuan123', 'thuan1234', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `person`
--

CREATE TABLE `person` (
  `id` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `hostid` varchar(30) NOT NULL,
  `sdt` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `note` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `person`
--

INSERT INTO `person` (`id`, `name`, `hostid`, `sdt`, `address`, `status`, `note`) VALUES
('333', 'hoang tran', '111', '12345', 'o nha', 'namdinh', NULL),
('361', 'do minh tuan', '362', '0123456789', 'nam dinh', 'trong pho', NULL),
('362', 'tran thuan', '362', '0123456788', 'nam dinh', 'trong pho', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rent`
--

CREATE TABLE `rent` (
  `activityid` int(11) NOT NULL,
  `deviceid` int(11) NOT NULL,
  `roomid` int(11) NOT NULL,
  `roomamount` int(11) NOT NULL,
  `deviceamount` int(11) NOT NULL,
  `renterid` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `rent`
--

INSERT INTO `rent` (`activityid`, `deviceid`, `roomid`, `roomamount`, `deviceamount`, `renterid`) VALUES
(1, 1, 1, 1, 1, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `renter`
--

CREATE TABLE `renter` (
  `renterid` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `sdt` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `note` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `renter`
--

INSERT INTO `renter` (`renterid`, `name`, `sdt`, `address`, `note`) VALUES
('361', 'do minh tuan', '0123456789', 'nam dinh', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `request`
--

CREATE TABLE `request` (
  `hostid` varchar(11) NOT NULL,
  `request` varchar(100) NOT NULL,
  `note` varchar(50) NOT NULL,
  `requestid` int(11) NOT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `request`
--

INSERT INTO `request` (`hostid`, `request`, `note`, `requestid`, `time`) VALUES
('362', 'chuyen nha', '', 1, NULL),
('362', 'chuyen nha', 'kcj', 2, NULL),
('362', 'chuyennha1', 'kcj', 3, '2023-12-25 09:57:29'),
('363', 'chuyennha', 'kcj', 4, '2023-12-25 09:50:05'),
('336', 'chuyennha', 'null', 5, '2023-01-01 12:00:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `roomid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `capacity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(30) NOT NULL,
  `note` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`roomid`, `name`, `capacity`, `price`, `status`, `note`) VALUES
(1, 'phong doan', 100, 1000000, 'ok', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `work`
--

CREATE TABLE `work` (
  `userid` int(11) NOT NULL,
  `timeloggin` datetime NOT NULL,
  `timeloggout` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `work`
--

INSERT INTO `work` (`userid`, `timeloggin`, `timeloggout`) VALUES
(361, '2023-12-25 12:40:37', '2023-12-25 12:44:37');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`userid`);

--
-- Chỉ mục cho bảng `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`activityid`);

--
-- Chỉ mục cho bảng `device`
--
ALTER TABLE `device`
  ADD PRIMARY KEY (`deviceid`);

--
-- Chỉ mục cho bảng `manageraccount`
--
ALTER TABLE `manageraccount`
  ADD PRIMARY KEY (`userid`);

--
-- Chỉ mục cho bảng `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `renter`
--
ALTER TABLE `renter`
  ADD PRIMARY KEY (`renterid`);

--
-- Chỉ mục cho bảng `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`requestid`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomid`);

--
-- Chỉ mục cho bảng `work`
--
ALTER TABLE `work`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `activity`
--
ALTER TABLE `activity`
  MODIFY `activityid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `device`
--
ALTER TABLE `device`
  MODIFY `deviceid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `request`
--
ALTER TABLE `request`
  MODIFY `requestid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `room`
--
ALTER TABLE `room`
  MODIFY `roomid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
