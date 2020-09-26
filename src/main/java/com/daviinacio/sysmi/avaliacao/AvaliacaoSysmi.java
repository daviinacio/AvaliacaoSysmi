package com.daviinacio.sysmi.avaliacao;

import java.util.Scanner;

/**
 * @author daviinacio
 */
public class AvaliacaoSysmi {
    public static void main(String[] args){
        // Cenário de utilização para countNumbers
        AvaliacaoSysmi.countNumbers(new int [] { 7, 3, 5, 1 }, 4);
        
        System.out.println('\n');
        
        
        // Cenário de utilização para TrainComposition
        TrainComposition trainComposition = new TrainComposition();
        
        trainComposition.dockWagonLeft(7);
        System.out.println("Vagao 7 atracado pelo lado esquerdo");
        
        trainComposition.dockWagonLeft(13);
        System.out.println("Vagao 13 atracado pelo lado esquerdo");
        
        System.out.println(trainComposition);
        System.out.println();
        
        System.out.println(String.format(
                "Vagao %s desatracado pelo lado direito", 
                trainComposition.undockWagonRight()
        ));
        
        System.out.println(String.format(
                "Vagao %s desatracado pelo lado esquerdo", 
                trainComposition.undockWagonLeft()
        ));
        
        System.out.println(trainComposition);
        System.out.println();
        
        System.out.println("Pressione qualquer tecla para fechar o programa...");
        new Scanner(System.in).nextLine();
    }
    
    public static int countNumbers(int [] array, int lessThan){
        // Ordenação
        for(int i = 0; i < array.length; i++){
            int aux, min = Integer.MAX_VALUE, min_pos = 0;
            
            // Encontra o menor número do array após a posição atual
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    min_pos = j;
                }
            }
            
            // Troca os valores da posição atual com o menor número
            aux = array[i];
            array[i] = array[min_pos];
            array[min_pos] = aux;
        }
        
        // Mostra o array ordenado em ordem crescente
        for(int num : array)
            System.out.print(String.format("[%s]\t", num));
        
        
        System.out.println('\n');
        
        // Soma quantos elementos são menores que o argumento lessThan
        int lessThanResult = 0;
        
        for(int num : array){
            if(num < lessThan)
                lessThanResult++;
        }
        
        // Informa quantos elementos são menores que o argumento lessThan
        System.out.println(String.format(
                "%s elementos do array sao menores que %s",
                lessThanResult, lessThan
        ));
        
        return lessThanResult;
    }
}
