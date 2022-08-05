-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Items
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Items
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Items` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `Items` ;

-- -----------------------------------------------------
-- Table `Items`.`Comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Items`.`Comment` (
  `commentId` INT NOT NULL,
  `commentDate` DATE NULL DEFAULT NULL,
  `commentType` VARCHAR(70) NULL DEFAULT NULL,
  `numberOfComment` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`commentId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Items`.`Friends`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Items`.`Friends` (
  `friendId` INT NOT NULL,
  `dateOfFriendship` DATE NULL DEFAULT NULL,
  `acceptedFriend` VARCHAR(45) NULL DEFAULT NULL,
  `rejectedFriend` VARCHAR(45) NULL DEFAULT NULL,
  `Friendcol` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`friendId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Items`.`Post`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Items`.`Post` (
  `PostId` INT NOT NULL,
  `Liked` VARCHAR(45) NULL DEFAULT NULL,
  `disliked` VARCHAR(45) NULL DEFAULT NULL,
  `typesOfPost` VARCHAR(45) NULL DEFAULT NULL,
  `postDescription` VARCHAR(70) NULL DEFAULT NULL,
  `dateOfPost` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`PostId`),
  CONSTRAINT `commentId`
    FOREIGN KEY (`PostId`)
    REFERENCES `Items`.`Comment` (`commentId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Items`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Items`.`User` (
  `userId` INT NOT NULL,
  `firstName` VARCHAR(45) NULL DEFAULT NULL,
  `lastName` VARCHAR(45) NULL DEFAULT NULL,
  `age` INT NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `place` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(10) NULL DEFAULT NULL,
  `gender` VARCHAR(10) NULL DEFAULT NULL,
  `work` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`),
  CONSTRAINT `friendId`
    FOREIGN KEY (`userId`)
    REFERENCES `Items`.`Friends` (`friendId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Items`.`Request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Items`.`Request` (
  `requestId` INT NOT NULL,
  `accepted` VARCHAR(45) NULL DEFAULT NULL,
  `rejected` VARCHAR(45) NULL DEFAULT NULL,
  `dateOfRequest` DATE NULL DEFAULT NULL,
  `pending` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`requestId`),
  CONSTRAINT `userId`
    FOREIGN KEY (`requestId`)
    REFERENCES `Items`.`User` (`userId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;