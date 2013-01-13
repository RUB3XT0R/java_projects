<%-- 
    Document   : dba2
    Created on : 21/Out/2011, 16:54:37
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div align="justify">                    
    <table border="0"><tr>
            <td>
                <h2> <strong><strong>DBA I - Oracle Database 11g  Workshop de Administração I</strong></strong>I</h2>
                <strong>Objetivos do Curso:</strong><br />
                <p> Este curso foi projetado para oferecer ao participante uma base sólida sobre tarefas administrativas avançadas.    Neste curso, serão abordados temas relativos a configuração de uma base de dados Oracle para aplicações multilíngües, prática de diversos métodos de backup e recovery o banco de dados usando RMAN e utilização da tecnologia de Flashback.   </p>
            </td>
            <td><img src="img/carga25.png" width="162" height="162" /></td>
        </tr></table>
    <p> Além disso, tratará de recursos para monitoramento, controle e otimização de desempenho, Resource Manager, Scheduler, Automatic Storage Management (ASM) e das funcionalidades do VLDB. Trabalhará conceitos de segurança utilizando o Virtual Private Database e de movimentação de dados entre bases. </p>
    <strong>Pré-requisito:</strong><br/>
    <p> Ter cursado o módulo de &quot; Oracle 11g: Formação DBA I&quot;. </p>
    <p><strong>Instrutores:</strong><br/><br/>
        <strong>Cleber de Castro Pereira - Instrutor Oracle  </strong><br/>
        Mestrando em Software para Automação e Robótica pela Universidade de São Paulo (USP), graduado em Engenharia da Computação pela Universidade de Campinas (Unicamp) e especialista em Metodologias e Orientação à Objetos pela Universidade Municipal de São Caetano do Sul (USCS). Atualmente como Arquiteto de Soluções da T-Systems do Brasil, atua com vasta experiência em Análise (Levantamento e Especificação), Desenvolvimento e Gerenciamento de Projetos de Pequeno, Médio e Grande Porte.Sua carreira resume-se em 14 anos de experiência na área de Tecnologia da Informação, desenvolvendo soluções destinadas à Transportadoras, Montadoras e Instituições Financeiras.Atuou em diversas empresas, tais como: Volkswagen, Gedas do Brasil, Banco Santander, Banco Itaú, Microsoft Consulting, Transportadora Americana e SENAI/SP.<br />
        Seu portifólio contempla atuação em projetos desenvolvidos sob plataforma Open Source, Microsoft, Sun, Oracle e IBM. <br/><br/>
        <strong>Rodrigo Bonela - Instrutor Oracle  </strong><br/>
        Graduando em Gestão da Tecnologia da Informação, especialista em Desenvolvimento de Sistemas com o Banco de Dados Oracle, Ferramentas Developer, Oracle E-Business Suite e Modelagem de Dados. Com experiência profissional de cinco anos em Análise, Desenvolvimento e Consultoria de sistemas utilizando ferramentas Oracle (PL/SQL, Forms, Reports e Designer), Oracle EBS, ERwin, Unix e Linux. Conhecimentos com ERPs Oracle E-Business Suite e Oracle Peoplesoft. Atualmente atua como Consultor Oracle EBS em um grande parceiro Oracle a nível mundial. <br/><br/>
        <strong>André Otávio Ronchi - Instrutor Oracle  </strong><br/>
        MBA em Gerenciamento de projetos pela Fundação Getúlio Vargas, Pós-graduado em Gestão estratégica de Empresas em negócios pela Veris IBTA e Graduado em Ciência da Computação pela Faculdade de Ciência e Tecnologia de Joinville(SC) . Atualmente Administrador de Banco de Dados Oracle/SQL Server na empresa Netshoes e consultor Oracle Senior da Usina São Paulo(Maior distribuidora de combustível do País). Oracle Certified Professional com 11 anos de experiência em Administração em Banco de Banco de Dados Oracle/SQL Server. Forte atuação em Administração de bancos de dados em empresas como: Netshoes, Usina São Paulo, Grupo Equipav, Motorola, Caterpillar, Elektro, Companhia Paulista de Força e Luz(CPFL), Unilever, Sodexo e Banco Santander. Seu portifólio contempla atuação em projetos em Bancos de Dados Oracle, SQL Server, Informix e Mainframe Adabas.<br/><br/>
        <strong>Roberto Fernandes Sobrinho - Instrutor Oracle  </strong><br/>
        Graduado em Ciência da Computação, Possui 08 anos de experiência com tecnologia Oracle especialista em análise e desenvolvimento de aplicações baseados em estrutura Oracle atuando fortemente com desenvolvimento PL/SQL, PL/SQL Web Toolkit,, Forms &amp; Reports (4.5, 6i, 6i Web, 10g, 11g) e integrações sistêmicas entre Oracle E-Business Suite, Synchro Solução Fiscal, Synchro Nota Fiscal Eletrônica. Atualmente atua como analista de sistemas sênior em uma grande Editora brasileira e é responsável pelo sistema de faturamento nota fiscal eletrônica, além disso, presta atendimento pontual de análise, desenvolvimento, Tuning de Aplicação para diversas empresas através da sua consultoria Fast Systems LTDA.							    </p>
    <p><strong>Ementa:</strong><strong></strong><br/>
    </p>
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th width="566" align="center">  Introdução</th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Computação em Grade<br />
                    Controles do Produto Oracle Enterprise Manager 10g<br />
                    Revisão da Arquitetura do Banco de Dados </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th width="585" align="center"><strong>Configurando o Recovery Manager</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Recursos e Componentes do Recovery Manager<br />
                    Usando uma Área de Recuperação Flash com o RMAN<br />
                    Configurando o RMAN<br />
                    Backups Automáticos do Arquivo de Controle<br />
                    Políticas de Retenção e Alocação de Canais<br />
                    Usando o Recovery Manager para estabelecer conexão com um banco de dados de destino no modo default NOCATALOG<br />
                    Exibindo as definições atuais do RMAN<br />
                    Alterando a política de retenção de backup para um banco de dados <br/>
                </p></td>
        </tr>
    </table>
    <br />
    <table width="100%" height="58" border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC">
        <tr bgcolor="white">
            <th width="603" align="center">    <strong>Usando o Recovery Manager</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"> Visão Geral dos Comandos do RMAN<br />
                Paralelização de Conjuntos de Backup<br />
                Backups Compactados<br />
                Cópia-Imagem<br />
                Backups Completos e Incrementais do Banco de Dados<br />
                Comandos LIST e REPORT<br />
                Habilitar o modo ARCHIVELOG para o banco de dados<br />
                Usar o Recovery Manager </td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Oracle Secure Backup</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Instalação e Configuração<br />
                    Implementar a estratégia sugerida pela Oracle<br />
                    RMAN e Oracle Secure Backup<br />
                    Backup/restauração em fita de arquivos do banco de dados e do sistema de arquivos<br />
                    Usando o obtool e a interface Web para configurar dispositivos do Oracle Secure Backup (CLI/GUI)<br />
                    Configurando o EM para o Oracle Secure Backup e para backup de teste em fita (EM)<br />
                    Usando o RMAN para fazer backup do banco de dados em fita (CLI)<br />
                    Usando a ferramenta Web OB para fazer backup dos arquivos do sistema de arquivos </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Recuperação de Perdas Não Críticas</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Recuperação de Arquivos Não Críticos<br />
                    Criando Novos Tablespaces Temporários<br />
                    Recriando Arquivos de Redo Log, Tablespaces de Índice e Índices<br />
                    Recuperação de Tablespaces Somente para Leitura<br />
                    Métodos de Autenticação para Administradores de Bancos de Dados<br />
                    Perda do Arquivo de Autenticação de Senha<br />
                    Criando um novo tablespace temporário<br />
                    Alterando o tablespace temporário default de um banco de dados </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Recuperação Incompleta</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Etapas da Recuperação<br />
                    Comandos de Recuperação Gerenciada pelo Servidor e pelo Usuário<br />
                    Recuperando um Backup Automático do Arquivo de Controle<br />
                    Criando um Novo Arquivo de Controle<br />
                    Visão Geral da Recuperação Incompleta<br />
                    Melhores Práticas da Recuperação Incompleta<br />
                    Recuperação Simplificada com RESETLOGS<br />
                    Recuperação pontual usando o RMAN </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Flashback</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Arquitetura do Flashback de Banco de Dados<br />
                    Configurando e Monitorando o Flashback de Banco de Dados<br />
                    Backup da Área de Recuperação Flash<br />
                    Usando V$FLASH_RECOVERY_AREA_USAGE<br />
                    Considerações sobre o Flashback de Banco de Dados<br />
                    Usando a Interface de Flashback de Banco de Dados do RMAN<br />
                    Usando a Interface de Flashback de Banco de Dados do EM<br />
                    Gerenciando e monitorando operações de Flashback de Banco de Dados </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Lidando com Bancos de Dados Danificados</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Sintomas de Danos em Bloco de Dados: ORA-1578<br />
                    Utilitário DBVERIFY e comando ANALYZE<br />
                    Parâmetro de inicialização DB_BLOCK_CHECKING<br />
                    Verificação e Dump de Metadados de Segmentos<br />
                    Usando o Flashback para Danos Lógicos e usando o DBMS_REPAIR<br />
                    Recuperação de Mídia de Bloco<br />
                    Interface BMR do RMAN<br />
                    Fazendo Dump e Verificando Metadados de Segmentos </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Monitorando e Gerenciando a Memória</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Estruturas de Memória Oracle<br />
                    Gerenciamento Automático da Memória Compartilhada<br />
                    Princípios do Ajuste da SGA<br />
                    Database Control e Gerenciamento Automático da Memória Compartilhada<br />
                    Comportamento dos Parâmetros Auto-ajustáveis e Manuais da SGA<br />
                    Redimensionando o Parâmetro SGA_TARGET<br />
                    Recursos de Gerenciamento da PGA<br />
                    Usando o Memory Advisor </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Gerenciamento Automático de Desempenho</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Identificando Componentes Ajustáveis<br />
                    Eventos de Espera Oracle e Estatísticas do Sistema<br />
                    Diagnóstico e Solução de Problemas e Ajuste de Views<br />
                    Associação Direta à SGA para Coleta de Estatísticas<br />
                    Workload Repository<br />
                    Advisory Framework<br />
                    Dicas de Uso e Cenários de ADDM<br />
                    Usando o SQL Tuning Advisor e o SQL Access Advisor </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Monitorando e Gerenciando o Armazenamento I</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Estruturas de Armazenamento de Banco de Dados<br />
                    Visão Geral do Gerenciamento de Espaço<br />
                    OMF (Oracle Managed Files)<br />
                    Migração e Encadeamento de Linhas<br />
                    Monitoramento Pró-ativo de Tablespaces<br />
                    Gerenciando a Alocação de Espaço Retomável<br />
                    Tablespace SYSAUX<br />
                    Monitorando o uso do espaço de tabela e de índice </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Monitorando e Gerenciando o Armazenamento II</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Gerenciamento Automático de Undo<br />
                    Arquivos de Redo Log<br />
                    Tipos de Tabelas<br />
                    Tabelas Particionadas<br />
                    IOTs (Tabelas Organizadas por Índice)<br />
                    Gerenciando o espaço de índice com o SQL<br />
                    Configurar o tamanho ideal do arquivo de redo log<br />
                    Verificar o Ajuste Automático da Retenção de Undo </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>ASM (Automatic Storage Management)</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Arquitetura Geral e Funcionalidades do ASM<br />
                    Adições de Views Dinâmicas de Desempenho<br />
                    Gerenciando uma Instância ASM<br />
                    Grupos de Discos ASM<br />
                    Usando a Linha de Comandos asmcmd<br />
                    Migrando o Banco de Dados para o Armazenamento do ASM<br />
                    Criando uma instância ASM em um Oracle Home separado<br />
                    Migrando um tablespace para usar o armazenamento do ASM </p></td>
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Suporte a VLDB</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Criando Tablespaces para Arquivos Grandes<br />
                    Alterações em pacotes e dicionário de dados para suporte a VLDB<br />
                    Criando e mantendo TTGs (grupos de tablespaces temporários)<br />
                    Particionamento e Índices Particionados<br />
                    Ignorando índices inutilizáveis<br />
                    Criando e usando índices globais particionados por hash<br />
                    Log de Erros DML<br />
                    Interpretando ROWIDs de Arquivos Grandes <br />
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Gerenciando Recursos</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Configuração e Conceitos do Database Resource Manager<br />
                    Criando um Novo Plano de Recursos<br />
                    Mecanismo do Pool de Sessões Ativas<br />
                    Tempo Máximo de Execução Estimado<br />
                    Criando um Plano Complexo<br />
                    Administrando e Monitorando o Resource Manager<br />
                    Diretivas do Plano de Recursos<br />
                    Criando Grupos de Consumidores de Recursos                                                                              </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Automatizando Tarefas com o Scheduler</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Conceitos do Scheduler<br />
                    Criando uma Classe de Job e um Intervalo<br />
                    Gerenciando Jobs, Programas, Cadeias, Eventos, Programações e Prioridades<br />
                    Exibindo e Expurgando Logs de Jobs<br />
                    Criando um programa e uma programação<br />
                    Criando um job que usa um programa e uma programação<br />
                    Alterando o programa e a programação do job e observando a mudança de comportamento desse job<br />
                    Monitorando execuções de jobs                                                                              </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Segurança do Banco de Dados</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Virtual Private Database: Visão Geral<br />
                    Criando uma Política em Nível de Coluna<br />
                    Gravando uma Função de Política<br />
                    Tipos de Políticas<br />
                    VPD em nível de coluna com mascaramento de coluna<br />
                    Criptografia Transparente de Dados<br />
                    Definindo a senha do listener<br />
                    Implementar o VPD                                                                              </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Movimentação de Dados</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Conceitos de Tabelas Externas<br />
                    Criando um Objeto de Diretório e uma Tabela Externa<br />
                    Data Pump<br />
                    Banco de Dados de Transporte<br />
                    Comando RMAN CONVERT DATABASE<br />
                    Transportar Tablespace<br />
                    Criar um Objeto de Diretório<br />
                    Criar uma Tabela Temporária <br />
        </tr>
    </table>
    <br />
    <table border='0' cellpadding="3" cellspacing="2" bgcolor="#CCCCCC" width="100%">
        <tr bgcolor="white">
            <th align="center"><strong>Usando o Suporte à Globalização</strong></th>
        </tr>
        <tr bgcolor="white">
            <td align="left" valign="top"><p> Recursos do Suporte à Globalização<br />
                    Esquemas de Codificação<br />
                    Conjuntos de Caracteres de Banco de Dados e Conjuntos de Caracteres Nacionais<br />
                    Especificando um Comportamento Dependente do Idioma<br />
                    Variantes de Definições Locais<br />
                    Usando Classificação e Comparação Lingüística<br />
                    Conversão de Dados entre Conjuntos de Caracteres de Cliente e Servidor<br />
                    Determinando as Definições de NLS Default <br />
        </tr>
    </table>
    <br />
</div>

