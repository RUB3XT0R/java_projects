
package modelo;

import java.util.Date;

public class Cheque {
    private Calendario calendario;
    private Cliente cliente;
    private int numeroCheque;
    private int numeroConta;
    private int numeroAgencia;
    private int numeroBanco;
    private int numeroDeParcela;
    private Date dataCompensacao;
    private String obs;
    private Boolean mau;

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCompensacao() {
        return dataCompensacao;
    }

    public void setDataCompensacao(Date dataCompensacao) {
        this.dataCompensacao = dataCompensacao;
    }

    public Boolean getMau() {
        return mau;
    }

    public void setMau(Boolean mau) {
        this.mau = mau;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroDeParcela() {
        return numeroDeParcela;
    }

    public void setNumeroDeParcela(int numeroDeParcela) {
        this.numeroDeParcela = numeroDeParcela;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
