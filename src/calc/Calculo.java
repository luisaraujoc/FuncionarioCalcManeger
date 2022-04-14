package calc;
public class Calculo {
    private static int totalSalario;
    

    public static float calculoSalario(int salarioBase, int horasTrabalhadas) {
        totalSalario = salarioBase*horasTrabalhadas;
        return getTotalSalario(totalSalario);
    }

    public void setTotalSalario(int totalSalario) {
        Calculo.totalSalario = totalSalario;
    }

    public static int getTotalSalario(int totalSalario) {
        return totalSalario;
    }

}
