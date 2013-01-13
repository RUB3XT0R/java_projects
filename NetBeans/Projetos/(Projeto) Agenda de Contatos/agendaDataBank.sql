USE [master]
GO
/****** Object:  Database [Agenda]    Script Date: 10/16/2010 15:33:11 ******/
CREATE DATABASE [Agenda] ON  PRIMARY 
( NAME = N'Agenda', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.LUCASBIASON\MSSQL\DATA\Agenda.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Agenda_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.LUCASBIASON\MSSQL\DATA\Agenda_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Agenda] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Agenda].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Agenda] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [Agenda] SET ANSI_NULLS OFF
GO
ALTER DATABASE [Agenda] SET ANSI_PADDING OFF
GO
ALTER DATABASE [Agenda] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [Agenda] SET ARITHABORT OFF
GO
ALTER DATABASE [Agenda] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [Agenda] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [Agenda] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [Agenda] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [Agenda] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [Agenda] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [Agenda] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [Agenda] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [Agenda] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [Agenda] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [Agenda] SET  DISABLE_BROKER
GO
ALTER DATABASE [Agenda] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [Agenda] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [Agenda] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [Agenda] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [Agenda] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [Agenda] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [Agenda] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [Agenda] SET  READ_WRITE
GO
ALTER DATABASE [Agenda] SET RECOVERY SIMPLE
GO
ALTER DATABASE [Agenda] SET  MULTI_USER
GO
ALTER DATABASE [Agenda] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [Agenda] SET DB_CHAINING OFF
GO
USE [Agenda]
GO
/****** Object:  Table [dbo].[contato]    Script Date: 10/16/2010 15:33:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[contato](
	[id] [int] NOT NULL,
	[nome] [varchar](50) NULL,
	[endereco] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[sexo] [varchar](1) NULL,
	[telefone] [varchar](10) NULL,
 CONSTRAINT [PK_contato] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
