import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Numeros Contando1 = new Numeros(100);

        System.out.println("\n numeros del 1 al 100");
        Numeros.displayInfo();
    }*/

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int numero;

        //En la clase main muestra los números del 1 al 100 (usa un bucle while).
        do{
            System.out.println("numero: " + count);
            count++;
        }while (count < 101);


        //En la clase main muestra los números del 1 al 100 (usa un bucle for).
        for(int i = 1; i <= 100; i++){

            //Crea un módulo donde se muestren los números del 1 al 100 divisibles entre 2 y 3 (utiliza el bucle que desees y la condicional if).
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println(i + " Se puede dividir en 2 y 3");
            }
        }

        //Crea un módulo donde leas un número por teclado y compruebes que es mayor o igual a cero, si no le deberá pedir al usuario nuevamente el número (usa un do while).
        do{
            System.out.println("Tecle un numero que sea mayor o igual a cero");
            numero = scanner.nextInt();

            if(numero < 0){
                System.out.println("Numero invalido, teclee otro numero");
            }
        }while (numero < 0);
        System.out.println("tu numero es: " + numero);

    }


}
