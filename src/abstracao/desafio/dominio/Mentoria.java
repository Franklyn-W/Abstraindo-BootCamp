package abstracao.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    
    //Construtor
    public Mentoria(){
    }

    //ToString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    //Get e Set
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


}
