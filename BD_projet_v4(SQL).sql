-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Sam 09 Janvier 2021 à 14:35
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `examens`
--

CREATE TABLE `examens` (
  `titre` text NOT NULL,
  `Durée` int(11) NOT NULL,
  `étudiants` text NOT NULL,
  `type` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `examens`
--

INSERT INTO `examens` (`titre`, `Durée`, `étudiants`, `type`) VALUES
('CC maths', 120, 'maths', 'oral');

-- --------------------------------------------------------

--
-- Structure de la table `salles`
--

CREATE TABLE `salles` (
  `nom` text NOT NULL,
  `capacité` int(11) NOT NULL,
  `disponibilité` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `salles`
--

INSERT INTO `salles` (`nom`, `capacité`, `disponibilité`) VALUES
('F21', 70, 3);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `identifiant` text NOT NULL,
  `Password` text NOT NULL,
  `AddyMail` text NOT NULL,
  `admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`identifiant`, `Password`, `AddyMail`, `admin`) VALUES
('Martin', '123456', 'Martin@gmail.com', 1),
('Bernard', '123456', 'Bernard@gmail.com', 0);

-- --------------------------------------------------------

--
-- Structure de la table `élèves`
--

CREATE TABLE `élèves` (
  `nom` text NOT NULL,
  `prénom` text NOT NULL,
  `numéro étudiant` int(11) NOT NULL,
  `filière` text NOT NULL,
  `année` text NOT NULL,
  `niveau` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `élèves`
--

INSERT INTO `élèves` (`nom`, `prénom`, `numéro étudiant`, `filière`, `année`, `niveau`) VALUES
('DUPONT', 'Patrick', 21904886, 'INFO', '2020-2021', 'L1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
