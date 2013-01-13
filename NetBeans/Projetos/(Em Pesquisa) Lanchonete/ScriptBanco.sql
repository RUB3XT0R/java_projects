--drop database lanchonete;

create database lanchonete;

--use lanchonete;

-- phpMyAdmin SQL Dump
-- version 3.3.2deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Out 27, 2010 as 09:13 AM
-- Versão do Servidor: 5.1.41
-- Versão do PHP: 5.3.2-1ubuntu4.5

--ET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `lanchonete`
--

-- --------------------------------------------------------

--
-- Estrutura stand-in para visualizar `custo`
--

use lanchonete;

DROP VIEW IF EXISTS `custo`;
CREATE TABLE IF NOT EXISTS `custo` (
`codigo` int(11)
,`descricao` varchar(60)
,`custo` double
);
-- --------------------------------------------------------

--
-- Estrutura da tabela `INGREDIENTE`
--

DROP TABLE IF EXISTS `INGREDIENTE`;
CREATE TABLE IF NOT EXISTS `INGREDIENTE` (
  `lanche` int(11) NOT NULL,
  `produto` int(11) NOT NULL,
  `peso` double DEFAULT NULL,
  PRIMARY KEY (`lanche`,`produto`),
  KEY `produto` (`produto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `INGREDIENTE`
--

INSERT INTO `INGREDIENTE` (`lanche`, `produto`, `peso`) VALUES
(1, 1, 0.1),
(1, 2, 0.3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `LANCHE`
--

DROP TABLE IF EXISTS `LANCHE`;
CREATE TABLE IF NOT EXISTS `LANCHE` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

--
-- Extraindo dados da tabela `LANCHE`
--

INSERT INTO `LANCHE` (`codigo`, `descricao`, `preco`) VALUES
(1, 'XSalada', 5),
(2, 'XBacon', 4),
(3, 'XMaionese', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `PRODUTO`
--

DROP TABLE IF EXISTS `PRODUTO`;
CREATE TABLE IF NOT EXISTS `PRODUTO` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `preco` double DEFAULT NULL,
  `descricao` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

--
-- Extraindo dados da tabela `PRODUTO`
--

INSERT INTO `PRODUTO` (`codigo`, `preco`, `descricao`) VALUES
(1, 3, 'Pão'),
(2, 10, 'Queijo'),
(3, 15, 'Presunto'),
(4, 2, 'Alface'),
(5, 3, 'Tomate');

-- --------------------------------------------------------

--
-- Estrutura da tabela `VENDA`
--

DROP TABLE IF EXISTS `VENDA`;
CREATE TABLE IF NOT EXISTS `VENDA` (
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `dia` date DEFAULT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

--
-- Extraindo dados da tabela `VENDA`
--

DROP TABLE IF EXISTS `VENDAITEM`;
CREATE TABLE IF NOT EXISTS `VENDAITEM` (
  `numero` int(11) NOT NULL,
  `lanche` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`numero`,`lanche`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;
-- --------------------------------------------------------

--
-- Estrutura para visualizar `custo`
--
DROP TABLE IF EXISTS `custo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `custo` AS
    select `LANCHE`.`codigo` AS `codigo`,
           `LANCHE`.`descricao` AS `descricao`,
            sum((`PRODUTO`.`preco` * `INGREDIENTE`.`peso`)) AS `custo`
    from ((`LANCHE` join `INGREDIENTE`) join `PRODUTO`)
    where ((`LANCHE`.`codigo` = `INGREDIENTE`.`lanche`) and
          (`INGREDIENTE`.`produto` = `PRODUTO`.`codigo`))
    group by `LANCHE`.`codigo`;

drop view listaVenda;
create view listaVenda as
select VENDAITEM.numero,VENDA.dia,LANCHE.descricao,VENDAITEM.quantidade
   from VENDAITEM,VENDA,LANCHE
   where VENDAITEM.numero=VENDA.numero and
         VENDAITEM.lanche=LANCHE.codigo;