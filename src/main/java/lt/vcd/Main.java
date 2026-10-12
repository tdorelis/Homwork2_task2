package lt.vcd;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite valandas: ");
        int h = scanner.nextInt();
        System.out.print("Iveskite minutes: ");
        int m = scanner.nextInt();
        System.out.print("Iveskite sekundes: ");
        int s = scanner.nextInt();


        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59){
            System.out.print("Neteisingai įvestas laikas");
        } else {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60){
                    m = 0;
                    h++;
                    if (h == 24){
                        h = 0;
                        m = 0;
                        s = 0;
                    }
                }
            }
            System.out.print("laikas po 1 sekundės: " +h+  " " +m+ " " + s);

        }



    }

}