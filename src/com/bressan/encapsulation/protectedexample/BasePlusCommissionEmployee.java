package com.bressan.encapsulation.protectedexample;

// BasePlusCommissionEmployee herda variáveis de instância protected de
// CommissionEmployee.
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override // indica que esse método substitui um método da superclasse
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    }
}
