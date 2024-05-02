package week2.teknikIcerik3.salaryCalculator;

import java.util.Calendar;

public class salaryCalculator {

    // Degiskenler tanimlandi.
    private String name;
    private double salary;
    private int workHours;
    private int hireYear = 2021;

    //Kurucu fonksiyon tanimlanmasi
    public salaryCalculator(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // Vergi hesaplanmasi
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    //Bonus hesaplanmasi
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    //Maas artisi hesaplama
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        System.out.println(yearsWorked);
        double raisePercentage; // maas yüzdesi

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        double raiseAmount = salary * raisePercentage; //Maas artim miktari
        return raiseAmount;
    }

    //Bilgilerin ekrana yazdirilmasi
    @Override
    public String toString() {
        double raiseAmount = raiseSalary();
        double totalSalary = salary + raiseAmount - tax() + bonus(); //Zamlı maas
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseAmount + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
                "Toplam Maaş: " + (totalSalary);
    }

    public static void main(String[] args) {
        salaryCalculator employee = new salaryCalculator("kemal", 2000.0, 45, 1985);
        System.out.println(employee);
    }
}
