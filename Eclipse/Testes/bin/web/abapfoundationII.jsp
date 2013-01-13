<%-- 
    Document   : abapfoundationII
    Created on : 24/Out/2011, 12:22:06
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div align="justify">
    <table border="0"><tr>
            <td>
                <h2>SAP ABAP Foundation II</h2>
                <p>O curso ABAP/4 tem como objetivo mostrar as principais características do sistema SAP, do ponto de vista do desenvolvedor de programas. É apresentada toda a informação técnica (sintaxe, comandos básicos, transações, conceito de dicionário de dados, tipos de programas e etc) para que seja possível construir programas na linguagem ABAP/4 dentro do sistema SAP e/ou entender seu funcionamento. </p></td>
            <td><img src="img/carga40.png" width="162" height="162" /></td>
        </tr></table>
    <p>Por esse motivo o curso também é de grande utilidade para profissionais funcionais ou analistas de negócios, que já atuam com SAP ou desejam atuar. </p>
    <p>Inicialmente aborda-se todo o conteúdo conceitual do sistema SAP e é feita a criação de componentes do dicionário de dados (tabela, campo, elemento de dados e domínio). Em seguida estuda-se especificamente a criação de Report List e Report ALV, geralmente responsáveis pelo maior número de desenvolvimentos dentro de um projeto. A análise de programas em tempo de execução (Debug) é especialmente abordada durante todo o curso, uma vez que é um conhecimento aplicado durante os testes e a manutenção dos programas ABAP.</p>
    <p>A seguir apresenta-se a aplicação Module Pool, também conhecido como on-line, com criação de programa, telas e etc.</p>
    <p>Logo em seguida estuda-se o processo de carga em massa – batch input – através da criação de um programa específico. Essa aplicação é muito utilizada em projetos e essencial para um programador ABAP. </p>
    <p><strong>Instrutores:</strong><br/><br/>
        <strong>Carlos Renato Fabri - Instrutor SAP/ABAP</strong><br/>
        Graduado em Engenharia da Computação pela Faculdade de Engenharia da Fundação Santo André. Possui mais de 5 anos como Consultor ABAP, construindo a carreira nas reconhecidas e premiadas parceiras SAP Accenture e Softtek, atuando em projetos de implementação e manutenção com grandes clientes como: Braskem, BMS, Movistar, Unilever, Camargo Correa, entre outros. Líder da
        equipe de Abap do módulo HR da Softtek Brasil no projeto Camargo Correa nacional e internacional. Experiência com Abap: Report List, ALV e ALV orientada a objeto; Formulários Sapscript, Smartform e HRform; Module Pool(on-line), Funções, BAPIs, BADIs, Field-Exit, User-Exit,
        Batch Input, IDOC, Dicionário de dados, entre outras.

        <br/><br/>
        <strong>Juan Jaramillo – Instrutor SAP Funcional / módulos logísticos e financeiros.</strong><br/>
        Graduado em Engenharia Industrial Mecânica pela UBC e pós-graduado em Administração de empresas pela UniFEI. Tem vivência de 10 anos na área da engenharia em empresas multinacionais e nacionais e desde 2006 na área da Tecnologia da Informação. Na área da TI iniciou no grupo Paranapanema como analista funcional SAP e adquiriu experiência nos módulos de Projetos (PS), Investimentos (IM) e Contabilidade Financeira (FI). Atuou na implantação do sistema SAP nos módulos de PS e IM do grupo, na elaboração de material didático, treinamentos aos usuários finais, configuração e suporte técnico aos usuários das empresas do grupo. Possui treinamento nos módulos de PS, IM e FI pela SAP Educational Brazil.</p>

    <p><strong>Ementa:</strong><br/></p>

    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="566" align="center">  Introdução ao SAP </th></tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p>-Introdução conceitual do que é o Sistema SAP, seu funcionamento e sua divisão por módulos funcionais;</p>
                <p>-Explicação de como um projeto é realizado dentro de uma fábrica de software;										  </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="585" align="center">  Programas ABAP </th></tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p>-Transações ABAP, acessando e demonstrando as principais transações e atalhos utilizadas pelos programadores ABAP;</p>
                <p>-Tipos de programas ABAP, apresentação dos tipos de programas abap: Reports, Formulários, Funções, Conversões e Interfaces;</p>
                <p>-O que são REQUESTS, , apresentando o processo de transporte entre ambientes dentro de um projeto;<br/>
                </p></td>
        </tr>
    </table>
    <br />
    <table width="100%" height="58" border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="603" align="center">   Componentes ABAP </th></tr>
        <tr bgcolor="white">
            <td align="left" valign="top">  -Dicionário de dados e apresentação de como o SAP se organiza através de tabelas;
                <p>-Elementos de dados, domínios e etc.</p>
                <p>-Criação de Tabela, Elementos de dados, Dominio, Visão e Transação com diálogo de atualização da tabela.</p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="599" align="center"> Criação de programas </th></tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p>-Apresentação da estrutura de um programa ABAP.</p>
                <p>-Apresentação dos principais comandos e utilização do editor de programas ABAP;</p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="594" align="center"> Desenvolvimento Principal </th></tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p>-Relatório tipo List utilizando tela de seleção. Nesse ponto são apresentados os comandos fundamentais para criação de uma tela de seleção e validações básicas;</p>
                <p>-Seleção de dados em tabelas transparentes. Também é relembrado conceitos de modelagem e banco de dados;</p>
                <p>-Saída de dados na forma de relatório List, com criação de cabeçalho e rodapés e controles para quebra de página;</p>
                <p>-Criação de Relatório ALV como segunda opção de saída do programa anterior.</p>
                <p>-Utilização da função que imprime o relatório ALV e alterações de layout de linha, colunas além de realização de interações neste tipo de relatório através de parâmetros dessa função.</p>
                <p>-Download de relatório em arquivo TXT na maquina local.</p>
                <p><strong> Module Pool: </strong></p>
                <p>-Criação de Module Pool criando telas e botões, demonstrando as principais características desse tipo de programa e apresentando as funcionalidades do mesmo;</p>
                <p>-Validações dos campos da tela;</p>
                <p>-Gravação em tabelas transparentes através da lógica do programa em tempo de execução.</p>
                <p><strong>Batch Input:</strong></p>
                <p>- Criação de um programa de Batch Input (carga em massa);</p>
                <p>- Criação de mapeamento (SHDB) de Batch Input e utilização dentro do programa criado;</p>
                <p> - Execução da carga em massa através de Call Transaction e de criação de pastas de Batch Input (SM35), baseado em dados recebidos pelo programa através de arquivo .txt.</p>
                <p>- Esse projeto envolve utilização de diversas funções standards, debug e mapeamento SHDB.</p>
                <p>-Todas as fases do projeto são acompanhadas e é utilizado o DEBUG como ferramenta importante para entendimento e análise de problemas no programa.</p></td>
        </tr>
    </table>
</div>
