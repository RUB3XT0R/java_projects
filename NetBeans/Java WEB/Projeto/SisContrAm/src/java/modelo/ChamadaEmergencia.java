
package modelo;

import controle.tipos.NivelPrioridade;
import java.sql.Date;
import java.util.List;

public class ChamadaEmergencia {

    private Date horario;
    private String descricao;
    private String endereco;
    private String nomeCidadao;
    private NivelPrioridade nivelPrioridade;
    private boolean encaminhada;

    private Funcionario operador;

    private Funcionario despachante;

    private List<Despacho> despachos;

    public ChamadaEmergencia() {
    }

    public ChamadaEmergencia(Date horario, String descricao, String endereco, String nomeCidadao, NivelPrioridade nivelPrioridade, boolean encaminhada) {
        this.horario = horario;
        this.descricao = descricao;
        this.endereco = endereco;
        this.nomeCidadao = nomeCidadao;
        this.nivelPrioridade = nivelPrioridade;
        this.encaminhada = encaminhada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getDespachante() {
        return despachante;
    }

    public void setDespachante(Funcionario despachante) {
        this.despachante = despachante;
    }

    public List<Despacho> getDespachos() {
        return despachos;
    }

    public void setDespachos(List<Despacho> despachos) {
        this.despachos = despachos;
    }

    public boolean isEncaminhada() {
        return encaminhada;
    }

    public void setEncaminhada(boolean encaminhada) {
        this.encaminhada = encaminhada;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public NivelPrioridade getNivelPrioridade() {
        return nivelPrioridade;
    }

    public void setNivelPrioridade(NivelPrioridade nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    public String getNomeCidadao() {
        return nomeCidadao;
    }

    public void setNomeCidadao(String nomeCidadao) {
        this.nomeCidadao = nomeCidadao;
    }

    public Funcionario getOperador() {
        return operador;
    }

    public void setOperador(Funcionario operador) {
        this.operador = operador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChamadaEmergencia other = (ChamadaEmergencia) obj;
        if (this.horario != other.horario && (this.horario == null || !this.horario.equals(other.horario))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.horario != null ? this.horario.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return horario + ", " + descricao + ", Prioridade=" + nivelPrioridade ;
    }


}
