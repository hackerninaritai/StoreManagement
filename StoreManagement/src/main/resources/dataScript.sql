CREATE DATABASE `store` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `item` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `item_purchase_price` float NOT NULL,
  `item_selling_price` float NOT NULL,
  `item_instock` int NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) NOT NULL,
  `customer_discount_rate` float DEFAULT '0',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bill` (
  `bill_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `bill_total` float DEFAULT '0',
  `customer_current_discount_rate` float NOT NULL,
  PRIMARY KEY (`bill_id`),
  KEY `Fk_Bill_Customer_idx` (`customer_id`),
  CONSTRAINT `Fk_Bill_Customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bill_item` (
  `bill_item_id` int NOT NULL AUTO_INCREMENT,
  `item_id` int NOT NULL,
  `item_quantity` int NOT NULL,
  `bill_id` int NOT NULL,
  PRIMARY KEY (`bill_item_id`),
  KEY `Fk_BI_Item_idx` (`item_id`),
  KEY `Fk_BI_Bill_idx` (`bill_id`),
  CONSTRAINT `Fk_BI_Bill` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`),
  CONSTRAINT `Fk_BI_Item` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


