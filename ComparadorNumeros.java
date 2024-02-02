
   import java.util.Scanner;
        public class ComparadorNumeros {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                // Solicitar al usuario que ingrese el primer número
                System.out.print("Ingrese el primer número: ");
                double numero1 = scanner.nextDouble();


                // Solicitar al usuario que ingrese el segundo número
                System.out.print("Ingrese el segundo número: ");
                double numero2 = scanner.nextDouble();


                // Determinar cuál es mayor
                if (numero1 > numero2) {
                    System.out.println(numero1 + " es mayor que " + numero2);
                } else if (numero1 < numero2) {
                    System.out.println(numero2 + " es mayor que " + numero1);
                } else {
                    System.out.println("Ambos números son iguales");
                }


                // Cerrar el objeto Scanner
                scanner.close();
            }
        }

