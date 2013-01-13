

package dao;

import java.sql.*;
import java.util.List;
import modelo.BancoDeDados;
import modelo.Campo;
import modelo.Tabela;

public class BancoDao extends Dao{

    public String makeDataBase(BancoDeDados bd) throws SQLException {

        String sql="create database "+bd.getNome()+";\n";
        executeCommand("create database "+bd.getNome()+"; ");

        List<Tabela> tabelas = bd.getTabelas();
        String s;
        for(Tabela t : tabelas){
            s =makeDataBankTables(t,bd);
            executeCommand(s);
            sql+=s+"\n";
        }
        
        return sql;
    }

    private String makeDataBankTables(Tabela t,BancoDeDados bd) {

        String sql = "create table "+bd.getNome()+"."+t.getNome()+" (";
        List<Campo> campos = t.getCampos();
        for(Campo c : campos) sql+=makeTableFields(c,t);
        sql+="primary key("+t.getChaveprimaria()+"));";

        return sql;
    }

    private String makeTableFields(Campo c,Tabela t){

        String sql=c.getNome()+" "+c.getTipo();
        if(c.isVarcharOrChar()) sql+="("+c.getTamanho()+")";
        if(!c.isNulo()) sql+=" not null";
        if(!t.getChaveprimaria().equals(c) && c.getPadrao()!=null) sql+=" default '"+c.getPadrao()+"'";
        if(c.getTipo().equalsIgnoreCase("INTEGER") && c.getAutoIncremento()==true)sql+=" auto_increment";
        sql+=" ,";
        
        return sql;
    }


}
