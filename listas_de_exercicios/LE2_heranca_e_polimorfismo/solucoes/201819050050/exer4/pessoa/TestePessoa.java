package exer4.pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Miseravel miseravel = new Miseravel("Bill", 34);
        Pobre pobre = new Pobre("Jeff", 44);
        Rica rico = new Rica("Lemann", 80, 16600000);

        Pessoa [] pessoas = new Pessoa[3];
        pessoas[0] = miseravel;
        pessoas[1] = pobre;
        pessoas[2] = rico;

        for (Pessoa pessoa : pessoas) {
            System.out.printf("%s\n%d\n", pessoa.getNome(), pessoa.getIdade());
            pessoa.atividade();
            if (pessoa instanceof Rica)
                pessoa.atividade(2500.6);
        }

    }
    
}