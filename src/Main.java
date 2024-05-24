import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Variables
        double promedio;
        String condicionFinal;

        //Objeto de tipo scanner;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio del alumno: ");
        promedio = teclado.nextDouble();

        condicionFinal= (promedio >= 7) ? "Aprobado" : "Reprobado";
        System.out.println("El alumno esta: " + condicionFinal);
    }
}