public class Data 
{
    int dia, mes, ano;

    //setters
    public void setDia(int dia) {
        if(dia > 0 && dia <= 31)
            this.dia = dia;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12)
            this.mes = mes;
    }

    public void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
    }

    //getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}