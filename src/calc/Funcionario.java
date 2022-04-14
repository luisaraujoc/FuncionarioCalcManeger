package calc;
public class Funcionario {
    String nome, cpf, rg, dataContratacao;
    int matricula, horasTrabalhadas;
    float salario;
    int salarioBase;


    public Funcionario(String nome, int horasTrabalhadas, int salarioBase)
    {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBase = salarioBase;
    }


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("José Garcia", 240, 70);

        f1.rg = "12312345";
        f1.cpf = "12312312344";
        f1.salario = f1.calculaSalario(salarioBase, horasTrabalhadas);
        String Mostrar = f1.printDados();

        System.out.println(Mostrar);

    }


    private String printDados() {
        String Mostrar = "Nome: "+f1.nome+"\nRG: "+f1.rg+"\nCPF: "+f1.cpf;
        return Mostrar;
    }


    private float calculaSalario(int salarioBase, int horasTrabalhadas) {
        float salarioT = calc.Calculo.calculoSalario(salarioBase, horasTrabalhadas);
        
        return salarioT;
        
    }
}
