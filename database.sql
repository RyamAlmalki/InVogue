-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ecommerce
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `FName` varchar(15) NOT NULL,
  `Lname` varchar(15) NOT NULL,
  `CustID` int NOT NULL AUTO_INCREMENT,
  `Email` varchar(50) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  PRIMARY KEY (`CustID`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('demo','demo',1,'demo@gmail.com','1234');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `ProductID` int NOT NULL AUTO_INCREMENT,
  `Pname` varchar(20) NOT NULL,
  `Price` decimal(10,0) NOT NULL,
  `PDescription` varchar(50) DEFAULT NULL,
  `PImage` varchar(100) NOT NULL,
  `Size` varchar(50) NOT NULL,
  PRIMARY KEY (`ProductID`)
) ENGINE=InnoDB AUTO_INCREMENT=186 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Short dresses',12,'Item made in Italy','resources\\shortdress1.png','xl'),(2,'Short dresses',123,'Item made in Italy','resources\\shortdress2.png','s'),(3,'Short dresses',1213,'Item made in Italy','resources\\shortdress3.png','s'),(4,'Blazer dress',2121,'Item made in Italy','resources\\blazerdress1.png','s'),(5,'Short dresses',1212,'Item made in Italy','resources\\shortdress4.png','s'),(6,'Short dresses',12,'Item made in Italy','resources\\shortdress1.png','s'),(8,'Short dresses',12,'Item made in Italy','resources\\shortdress1.png','S'),(15,'Blazer dress',122,'Item made in Italy','resources\\blazerdress2.png','s'),(16,'Blazer dress',232,'Item made in Italy','resources\\blazerdress3.png','s'),(17,'Blazer dress',66,'Item made in Italy','resources\\blazerdress4.png','s'),(18,'Blazer dress',123,'Item made in Italy','resources\\blazerdress5.png','xl'),(19,'Blazer dress',12,'Item made in Italy','resources\\blazerdress6.png','s'),(20,'short dress',12,'Item made in Italy','resources\\shortdress1.png','s'),(21,'short dress',12,'Item made in Italy','resources\\shortdress1.png','s'),(22,'Blazer dress',12,'Item made in Italy','resources\\blazerdress7.png','s'),(23,'Blazer dress',12,'Item made in Italy','resources\\blazerdress1.png','s'),(24,'Blazer dress',12,'Item made in Italy','resources\\blazerdress2.png','s'),(25,'short dress',42,'Item made in Italy','resources\\shortdress1.png','s'),(26,'Blazer dress',23,'Item made in Italy','resources\\blazerdress3.png','s'),(27,'Blazer dress',23,'Item made in Italy','resources\\blazerdress4.png','s'),(28,'Blazer dress',23,'Item made in Italy','resources\\blazerdress6.png','s'),(29,'Blazer dress',2323,'Item made in Italy','resources\\blazerdress6.png','s'),(30,'Blazer dress',12,'Item made in Italy','resources\\blazerdress6.png','s'),(31,'Blazer dress',12,'Item made in Italy','resources\\blazerdress6.png','s'),(32,'Blazer dress',12,'Item made in Italy','resources\\blazerdress6.png','s'),(39,'Short dresses',43,'Item made in Italy','resources\\shortdress1.png','s'),(40,'Short dresses',12,'Item made in Italy','resources\\shortdress2.png','s'),(41,'Short dresses',12,'Item made in Italy','resources\\shortdress3.png','s'),(42,'Short dresses',12,'Item made in Italy','resources\\shortdress4.png','s'),(43,'Short dresses',35,'Item made in Italy','resources\\shortdress4.png','s'),(44,'Short dresses',13,'Item made in Italy','resources\\shortdress1.png','s'),(45,'Short dresses',12,'Item made in Italy','resources\\shortdress1.png','s'),(46,'Shoes',12,'Item made in Italy','resources\\shoes1.png','s'),(47,'Shoes',53,'Item made in Italy','resources\\shoes2.png','s'),(48,'Shoes',13,'Item made in Italy','resources\\shoes3.png','s'),(49,'Shoes',12,'Item made in Italy','resources\\shoes1.png','s'),(50,'Shoes',12,'Item made in Italy','resources\\shoes2.png','s'),(51,'Shoes',53,'Item made in Italy','resources\\shoes3.png','s'),(52,'Shoes',14,'Item made in Italy','resources\\shoes1.png','s'),(53,'Shoes',13,'Item made in Italy','resources\\shoes1.png','s'),(54,'Shoes',13,'Item made in Italy','resources\\shoes1.png','s'),(55,'Shoes',34,'Item made in Italy','resources\\shoes1.png','s'),(56,'Shoes',31,'Item made in Italy','resources\\shoes1.png','s'),(57,'Shoes',1,'Item made in Italy','resources\\shoes1.png','s'),(58,'Shoes',13,'Item made in Italy','resources\\shoes1.png','s'),(59,'Shoes',24,'Item made in Italy','resources\\shoes1.png','s'),(60,'Shoes',113,'Item made in Italy','resources\\shoes1.png','s'),(61,'Shoes',1,'Item made in Italy','resources\\shoes1.png','s'),(62,'Bag',242,'Item made in Italy','resources\\bag1.png','s'),(63,'Bag',1,'Item made in Italy','resources\\bag2.png','s'),(64,'Bag',13,'Item made in Italy','resources\\bag3.png','s'),(65,'Bag',35,'Item made in Italy','resources\\bag1.png','s'),(66,'Bag',13,'Item made in Italy','resources\\bag2.png','s'),(67,'Bag',25,'Item made in Italy','resources\\bag3.png','s'),(68,'Bag',1,'Item made in Italy','resources\\bag1.png','s'),(69,'Bag',13,'Item made in Italy','resources\\bag2.png','s'),(70,'Bag',24,'Item made in Italy','resources\\bag1.png','s'),(71,'Bag',24,'Item made in Italy','resources\\bag1.png','s'),(72,'Bag',13,'Item made in Italy','resources\\bag1.png','s'),(73,'Bag',13,'Item made in Italy','resources\\bag1.png','s'),(74,'Bag',13,'Item made in Italy','resources\\bag1.png','s'),(75,'Bag',24,'Item made in Italy','resources\\bag1.png','s'),(76,'Bag',1,'Item made in Italy','resources\\bag1.png','s'),(78,'Bag',13,'Item made in Italy','resources\\bag1.png','s'),(79,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(80,'Sunglasses',1,'Item made in Italy','resources\\sunglasses2.png','s'),(81,'Sunglasses',1,'Item made in Italy','resources\\sunglasses3.png','s'),(82,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(83,'Sunglasses',1,'Item made in Italy','resources\\sunglasses2.png','s'),(84,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(85,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(86,'Sunglasses',1,'Item made in Italy','resources\\sunglasses3.png','s'),(87,'Sunglasses',1,'Item made in Italy','resources\\sunglasses2.png','s'),(88,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(89,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(90,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(91,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(92,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(93,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(94,'Sunglasses',1,'Item made in Italy','resources\\sunglasses1.png','s'),(95,'Pants',1,'Item made in Italy','resources\\pants1.png','s'),(96,'Pants',13,'Item made in Italy','resources\\pants2.png','s'),(97,'Pants',12,'Item made in Italy','resources\\pants3.png','s'),(98,'Pants',12,'Item made in Italy','resources\\pants1.png','s'),(99,'Pants',242,'Item made in Italy','resources\\pants2.png','s'),(100,'Pants',11212,'Item made in Italy','resources\\pants3.png','s'),(101,'Pants',13,'Item made in Italy','resources\\pants1.png','s'),(102,'Pants',24,'Item made in Italy','resources\\pants2.png','s'),(103,'Pants',13,'Item made in Italy','resources\\pants1.png','s'),(104,'Pants',13,'Item made in Italy','resources\\pants3.png','s'),(105,'Pants',245,'Item made in Italy','resources\\pants1.png','s'),(106,'Pants',13,'Item made in Italy','resources\\pants2.png','s'),(107,'Pants',13,'Item made in Italy','resources\\pants3.png','s'),(108,'Pants',24,'Item made in Italy','resources\\pants1.png','s'),(109,'Pants',13,'Item made in Italy','resources\\pants1.png','s'),(110,'Pants',13,'Item made in Italy','resources\\pants1.png','s'),(111,'Skirt',13,'Item made in Italy','resources\\skirt1.png','s'),(112,'Skirt',24,'Item made in Italy','resources\\skirt2.png','s'),(113,'Skirt',423,'Item made in Italy','resources\\skirt3.png','s'),(114,'Skirt',13,'Item made in Italy','resources\\skirt1.png','s'),(115,'Skirt',36,'Item made in Italy','resources\\skirt2.png','s'),(116,'Skirt',235,'Item made in Italy','resources\\skirt3.png','s'),(117,'Skirt',13,'Item made in Italy','resources\\skirt3.png','s'),(118,'Skirt',13,'Item made in Italy','resources\\skirt2.png','s'),(119,'Skirt',355,'Item made in Italy','resources\\skirt3.png','s'),(120,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(121,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(122,'Skirt',35,'Item made in Italy','resources\\skirt3.png','s'),(123,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(124,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(125,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(126,'Skirt',35,'Item made in Italy','resources\\skirt1.png','s'),(127,'T-Shirt',35,'Item made in Italy','resources\\T-Shirt3.png','s'),(128,'T-Shirt',13,'Item made in Italy','resources\\T-Shirt2.png','s'),(129,'T-Shirt',1313,'Item made in Italy','resources\\T-Shirt1.png','s'),(130,'T-Shirt',1313,'Item made in Italy','resources\\T-Shirt3.png','s'),(131,'T-Shirt',1313,'Item made in Italy','resources\\T-Shirt1.png','s'),(132,'T-Shirt',131,'Item made in Italy','resources\\T-Shirt3.png','s'),(133,'T-Shirt',1313,'Item made in Italy','resources\\T-Shirt2.png','s'),(134,'T-Shirt',1133,'Item made in Italy','resources\\T-Shirt3.png','s'),(135,'T-Shirt',13,'Item made in Italy','resources\\T-Shirt3.png','s'),(136,'T-Shirt',13,'Item made in Italy','resources\\T-Shirt3.png','s'),(137,'T-Shirt',13,'Item made in Italy','resources\\T-Shirt1.png','s'),(138,'T-Shirt',13,'Item made in Italy','resources\\T-Shirt3.png','s'),(139,'T-Shirt',24,'Item made in Italy','resources\\T-Shirt3.png','s'),(140,'T-Shirt',24,'Item made in Italy','resources\\T-Shirt2.png','s'),(141,'T-Shirt',24,'Item made in Italy','resources\\T-Shirt3.png','s'),(142,'T-Shirt',24,'Item made in Italy','resources\\T-Shirt3.png','s'),(143,'Jacket',24,'Item made in Italy','resources\\jacket1.png','s'),(144,'Jacket',24,'Item made in Italy','resources\\jacket2.png','s'),(145,'Jacket',24,'Item made in Italy','resources\\jacket3.png','s'),(146,'Jacket',24,'Item made in Italy','resources\\jacket1.png','s'),(147,'Jacket',24,'Item made in Italy','resources\\jacket2.png','s'),(148,'Jacket',24,'Item made in Italy','resources\\jacket3.png','s'),(149,'Jacket',24,'Item made in Italy','resources\\jacket1.png','s'),(150,'Jacket',242,'Item made in Italy','resources\\jacket1.png','s'),(151,'Jacket',2424,'Item made in Italy','resources\\jacket3.png','s'),(152,'Jacket',2424,'Item made in Italy','resources\\jacket1.png','s'),(153,'Jacket',13,'Item made in Italy','resources\\jacket1.png','s'),(154,'Jacket',13,'Item made in Italy','resources\\jacket1.png','s'),(155,'Jacket',13,'Item made in Italy','resources\\jacket1.png','s'),(156,'Jacket',24,'Item made in Italy','resources\\jacket1.png','s'),(157,'Jacket',4324,'Item made in Italy','resources\\jacket1.png','s'),(158,'Jacket',13,'Item made in Italy','resources\\jacket1.png','s'),(159,'Accessories',1313,'Item made in Italy','resources\\accessories1.png','s'),(160,'Accessories',13,'Item made in Italy','resources\\accessories2.png','s'),(161,'Accessories',13,'Item made in Italy','resources\\accessories3.png','s'),(162,'Accessories',1313,'Item made in Italy','resources\\accessories1.png','s'),(163,'Accessories',1,'Item made in Italy','resources\\accessories2.png','s'),(164,'Accessories',213,'Item made in Italy','resources\\accessories3.png','s'),(165,'Accessories',35,'Item made in Italy','resources\\accessories1.png','s'),(166,'Accessories',2324,'Item made in Italy','resources\\accessories2.png','s'),(167,'Accessories',42,'Item made in Italy','resources\\accessories1.png','s'),(168,'Accessories',12,'Item made in Italy','resources\\accessories2.png','s'),(169,'Accessories',12,'Item made in Italy','resources\\accessories1.png','s'),(170,'Accessories',13,'Item made in Italy','resources\\accessories3.png','s'),(171,'Accessories',24,'Item made in Italy','resources\\accessories1.png','s'),(172,'Accessories',53,'Item made in Italy','resources\\accessories1.png','s'),(173,'Accessories',35,'Item made in Italy','resources\\accessories1.png','s'),(174,'Accessories',13,'f','resources\\accessories1.png','s');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-13 19:50:03
