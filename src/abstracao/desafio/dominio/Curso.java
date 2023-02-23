package abstracao.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    //Construtor
    public Curso() {
    }

    // ToString
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    //Get e Set
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
