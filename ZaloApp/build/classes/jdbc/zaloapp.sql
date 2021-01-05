-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 05, 2021 lúc 05:24 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `zaloapp`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `keyword`
--

CREATE TABLE `keyword` (
  `stt` int(11) NOT NULL,
  `word` varchar(100) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `keyword`
--

INSERT INTO `keyword` (`stt`, `word`, `message`) VALUES
(1, 'xin chào', 'Xin chào bạn yêu!!'),
(2, 'bạn tên gì', 'Mình là server!!'),
(3, 'ok ', 'Cảm ơn bạn đã tham gia!!'),
(4, 'đang làm', 'Server đang nói chuyện với bạn yêu nè!!'),
(5, 'null', 'Không được để rổng nhé bạn eei!!!'),
(6, 'hi', 'xin chào bạn . mình chỉ biết tiếng việt thôi nha bạn eei!'),
(7, 'hello', 'xin chào bạn . mình chỉ biết tiếng việt thôi nha bạn eei!'),
(8, 'ở đâu', 'Mình được thiết lập ở trong máy nên mình không có địa chỉ?'),
(11, 'bao nhiêu tuổi', 'Mình sinh ngày 29/12/2020 Do Trà Hưởng Tạo Ra'),
(12, 'ơi', 'Mình nghe nè bạn eei!'),
(13, 'alo', 'mình nghe nè');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `message`
--

CREATE TABLE `message` (
  `ID` int(11) NOT NULL,
  `Guests` varchar(10) DEFAULT NULL,
  `Servers` varchar(10) DEFAULT NULL,
  `MessagesGuest` varchar(100) DEFAULT NULL,
  `MessagesServer` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `keyword`
--
ALTER TABLE `keyword`
  ADD PRIMARY KEY (`stt`);

--
-- Chỉ mục cho bảng `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `keyword`
--
ALTER TABLE `keyword`
  MODIFY `stt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `message`
--
ALTER TABLE `message`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
