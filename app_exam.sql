-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : Dim 31 jan. 2021 à 17:07
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `app_exam`
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
-- Déchargement des données de la table `examens`
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
-- Déchargement des données de la table `salles`
--

INSERT INTO `salles` (`nom`, `capacité`, `disponibilité`) VALUES
('F21', 70, 3);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(30) COLLATE latin1_bin NOT NULL,
  `password` varchar(30) COLLATE latin1_bin NOT NULL,
  `email` varchar(30) COLLATE latin1_bin NOT NULL,
  `type` varchar(30) COLLATE latin1_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `email`, `type`) VALUES
(1, 'terrale', '123456', 'terralef@gmail.com', 'admin'),
(4, 'testsecr', '123456', 'secrétariat@gmail.com', 'secrétariat'),
(3, 'test', 'test1', 'test@test.fr', 'scolarité'),
(5, 'chase', '123456', 'chase@gmail.com', 'admin'),
(6, 'lol', '123456', 'lol@gmail.com', 'secrétariat');

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
-- Déchargement des données de la table `élèves`
--

INSERT INTO `élèves` (`nom`, `prénom`, `numéro étudiant`, `filière`, `année`, `niveau`) VALUES
('DUPONT', 'Patrick', 21904886, 'INFO', '2020-2021', 'L1');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
