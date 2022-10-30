-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: natflix
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(30) DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `summary` varchar(255) NOT NULL,
  `logo_url` varchar(50) DEFAULT NULL,
  `banner_url` varchar(50) DEFAULT NULL,
  `thumbnail_url` varchar(50) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `content_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `type_id` FOREIGN KEY (`type_id`) REFERENCES `content_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
INSERT INTO `content` VALUES (1,'PS',2,2,'This movie is historic scene of Rajas in 19 th centurary','/api/logo1.png','/api/logo1.png','/api/logo1.png','I'),(2,'Roja',1,1,'This movie is romantic story btween local boy and girl','/api/logo.png','/api/logo.png','/api/logo.png','A'),(3,'Seinfield',1,3,'The show about nothing is a sitcom landmark, with comic Jerry and his three sardonic friends finding laughs in both the mundane and the ridiculous','/api/1.png','/api/1.png','/api/1.png','A'),(4,'Gundam II',1,2,'Amet commodo nulla facilisi nullam vehicula ipsum. Sit amet luctus venenatis lectus magna fringilla urna. Felis bibendum ut tristique et egestas quis ipsum.','/api/2.png','/api/2.png','/api/2.png','A'),(5,'Uncoupled',1,3,'Ipsum dolor sit amet consectetur adipiscing elit ut. ','/api/3.png','/api/3.png','/api/3.png','A'),(6,'Archer',2,3,'Pellentesque habitant morbi tristique senectus et netus et malesuada fames. Mauris rhoncus aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque.','/api/4.png','/api/4.png','/api/4.png','A'),(7,'Ghost in the Shell SAC 2045',2,2,'At erat pellentesque adipiscing commodo.','/api/5.png','/api/5.png','/api/5.png','A'),(8,'Cowboy Bebop',1,2,'Tincidunt eget nullam non nisi est sit.','/api/6.png','/api/6.png','/api/6.png','A'),(9,'Money Heist',2,2,'Sem nulla pharetra diam sit amet nisl. ','/api/7.png','/api/7.png','/api/7.png','A'),(10,'The last dance',3,5,'Directed by Jason Hehir,','/api/22.png','/api/22.png','/api/22.png','A'),(11,'Blackfish',3,5,'Ipsum dolor sit amet consectetur adipiscing elit ut.','/api/23.png','/api/23.png','/api/23.png','A'),(12,'Groundhog Day',2,4,'Iaculis eu non diam phasellus vestibulum lorem sed risus.','/api/20.png','/api/20.png','/api/20.png','A'),(13,'Servant of the people',2,2,'A political satire comedy about a high-school history teacher in his thirties who is unexpectedly elected President after a viral video filmed by one of his students shows him making a profane rant against government corruption','/api/16.png','/api/16.png','/api/16.png','A'),(14,'Mission Impossible Fallout',2,2,'Sem nulla pharetra diam sit amet nisl. Sed risus pretium quam vulputate. Massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin','/api/17.png','/api/17.png','/api/17.png','A');
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content_category`
--

DROP TABLE IF EXISTS `content_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content_category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category` (`category`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content_category`
--

LOCK TABLES `content_category` WRITE;
/*!40000 ALTER TABLE `content_category` DISABLE KEYS */;
INSERT INTO `content_category` VALUES (2,'Action'),(3,'Comedy'),(4,'Drama'),(1,'Horror'),(5,'Other');
/*!40000 ALTER TABLE `content_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content_type`
--

DROP TABLE IF EXISTS `content_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content_type`
--

LOCK TABLES `content_type` WRITE;
/*!40000 ALTER TABLE `content_type` DISABLE KEYS */;
INSERT INTO `content_type` VALUES (3,'documentry'),(2,'movies'),(1,'tv-series');
/*!40000 ALTER TABLE `content_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `details_content`
--

DROP TABLE IF EXISTS `details_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `details_content` (
  `id` int NOT NULL,
  `content_id` int DEFAULT NULL,
  `video_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `content_id_idx` (`content_id`),
  CONSTRAINT `content_id` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details_content`
--

LOCK TABLES `details_content` WRITE;
/*!40000 ALTER TABLE `details_content` DISABLE KEYS */;
INSERT INTO `details_content` VALUES (1,1,'ENr5nwHWnJE'),(2,10,'nVYAxJXza34'),(3,11,'4x8ptoX4r2o'),(4,12,'n4uB9hdzwjc'),(5,13,'6wwRatzY9-8'),(6,14,'d9xABu3ApIQ'),(7,6,'xgeY6rHJL9A'),(8,7,'BvBTcySEj4A'),(9,9,'Uafg97czxeQ');
/*!40000 ALTER TABLE `details_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `details_series`
--

DROP TABLE IF EXISTS `details_series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `details_series` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content_id` int NOT NULL,
  `season_number` int NOT NULL,
  `episode_number` int NOT NULL,
  `series_title` varchar(50) NOT NULL,
  `summary` varchar(255) NOT NULL,
  `thumbnail_url` varchar(50) DEFAULT NULL,
  `video_code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cont_id` (`content_id`),
  CONSTRAINT `cont_id` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details_series`
--

LOCK TABLES `details_series` WRITE;
/*!40000 ALTER TABLE `details_series` DISABLE KEYS */;
INSERT INTO `details_series` VALUES (1,2,1,1,'begning','new view','/api/logo1.png','D4qAQYlgZQs'),(2,3,1,1,'Seinfeld (pilot)','A woman Jerry met in Michigan flies into New York and asks to stay with him, but he\'s unsure if it\'s intended to be a romantic situation','/api/1.png','A72K4M1R1tg'),(3,3,1,2,'The Stake Out','After recently breaking up with Elaine, Jerry meets a woman at a party but only learns where she works, leading him to stake out her office','/api/episode/2.png','jVJ7Vs3Y10w'),(4,3,1,3,'The Robbery','Jerry\'s apartment gets robbed, leading him to want to move to a different place and give his current apartment to Elaine.','/api/episode/3.png','hQXKyIG_NS4'),(5,3,2,1,'The Ex-Girlfriend','After George breaks up with a woman he finds annoying, Jerry','/api/episode/4.png','PaPxSsK6ZQA'),(6,3,2,2,'The Pony Remark','When Jerry\'s parents visit New York, Jerry upsets a family member with a remark about ponies. Kramer wants to build \\\"levels\\\" in his apartment','/api/episode/5.png','uzda2bjj6YI'),(7,4,1,1,'The new start','Young Shiro Amada is en route to Earth to take command of a ground unit of Gundams fighting in the jungles of Southeast Asia.','/api/2.png','ISsWc5nVUDo'),(8,5,1,1,'Investigation','We are investigating the Archer, a.k.a.  FH77BW L52, or Artillerisystem 08, the most advanced ','/api/3.png','xgeY6rHJL9A'),(9,8,1,1,'COWBOY BEBOP ','COWBOY BEBOP is an action-packed space Western about three bounty hunters, aka “cowboys,” all trying to outrun the past. ','/api/6.png','ULCIHP5dc44');
/*!40000 ALTER TABLE `details_series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL,
  `hashed_password` varchar(30) NOT NULL,
  `creation_date` date NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`),
  UNIQUE KEY `UKsb8bbouer5wak8vyiiy4pf2bx` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-29 21:05:19
