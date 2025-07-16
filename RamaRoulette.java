/*
    ###    ##   #   #   ##
    #  #  #  #  ## ##  #  #
    ###   ####  # # #  ####
    # #   #  #  #   #  #  #
    #  #  #  #  #   #  #  #


    ###    ##   #  #  #     ####  #####  #####  ####
    #  #  #  #  #  #  #     #       #      #    #
    ###   #  #  #  #  #     ###     #      #    ###
    # #   #  #  #  #  #     #       #      #    #
    #  #   ##    ##   ####  ####    #      #    ####
 */


import java.util.*;

public class RamaRoulette {
    public static void main(String[] args) {
        String[] ramas = {"Computacion", "Ingenieria del Software", "Ingenieria de Computadores", "Tencologias de la Informacion", "Sistemas de la Informacion"};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println(i + " --> " + ramas[i]);
        }
        System.out.println();
        System.out.println("Introduce los numeros correspondientes a tus opciones en una sola linea separados por espacios");
        String line = sc.nextLine();
        String[] aux = line.split(" ");
        int[] opciones = new int[aux.length];
        for(int i = 0; i < aux.length; i++){
            opciones[i] = Integer.parseInt(aux[i]);
        }
        int i = (int)(Math.random() * opciones.length);
        System.out.println();
        System.out.println("Deberías elegir " + ramas[opciones[i]]);
        sc.close();
    }
}