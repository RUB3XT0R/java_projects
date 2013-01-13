
package Modelo;

import java.sql.Date;
import java.util.List;

public class Venda {
    
    private int id;
    private Date data;
    private double total;
    
    private Funcionario vendedor;
    
    private List<VendaItens> itens;
    
}
