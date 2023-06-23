package t13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receita{
    private List<Medicamento> receitaMedica;
    private Medico medicoResponsvel;
    private Date validade;

    public Receita(Medicamento med, Medico m, Date val){
        this.receitaMedica = new ArrayList<>();
        this.medicoResponsvel = m;
        this.validade = val;
    }
    public Medico getMedicoResponsvel() {
        return medicoResponsvel;
    }
    public List<Medicamento> getReceitaMedica() {
        return receitaMedica;
    }
    public Date getValidade() {
        return validade;
    }
    
}

