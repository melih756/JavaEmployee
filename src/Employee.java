import java.util.Scanner;
public class Employee {

    String name;
     int hireYear;
    int workHours;

     int salary;
    Scanner inp=new Scanner(System.in);

    public Employee(String name, int hireYear, int workHours, int salary) {

        this.name = name;
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
    }






    public int tax(){

        if (salary<1000){
            return 0;
        }else{
            int tax=(salary*3/100);
            return tax;
        }
    }

    public int bonus(){


        if (workHours>40){
            int bonus=workHours-40;
            return bonus*30;
        }else {
            System.out.println("bonus ücret yok");
            return 0;
        }

    }

    public int raiseSalary() {

        int raiseSalary;
        if (hireYear-2021<10){
           raiseSalary=(salary*5/100);
            return raiseSalary;
        } else if (hireYear-2021>9) {
             raiseSalary=(salary*10/100);
            return raiseSalary;
        }else {
            return 0;
        }

    }


    public String toString(){
        System.out.println("Çalışan Adı : " + name);
        System.out.println("Çalışan Maaşı : " + salary);
        System.out.println("Çalışma Saati : "  + workHours );
        System.out.println("İşe Giriş Yılı : " + hireYear);
        System.out.println("Bonus Ücret Miktarı : " +bonus());
        System.out.println("Vergi Kesinti Miktarı : " + tax());
        System.out.println("Yıla Göre Hesaplanan Kıdem Miktarı Miktarı  : " + raiseSalary());
        System.out.println("Toplam Maaş : " + ((salary+bonus()+raiseSalary())-tax()));


        return null;
    }


}
