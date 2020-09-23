/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalunos;

import java.util.Scanner;

/**
 *
 * @author Alessandro Sollar Jr
 */
public class NotasAlunos {
    
    /*ECO130
    Prática 2 - While
    Nome: Alessandro
    Data: 16/09/2020
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
                
        double n1, n2, n3;
        double mediaIndividual = 0;
        int matricula;
        int aprovados = 0;
        int reprovados = 0;
        int totalEstudantes = 0;
        double equacaoGeral = 0;
        double mediaTotal = 0;
        
        System.out.print("Digite a matrícula do aluno: ");
        matricula=scan.nextInt();
        
        
        while (matricula!=0){
        System.out.print("Digite a 1ª nota: ");
        n1 = scan.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        n2 = scan.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        n3 = scan.nextDouble();
        System.out.println("");   
        System.out.println("____________________________________________________"); 
        System.out.println(""); 
        mediaIndividual = (n1+n2+n3)/3;
        System.out.println("A média do aluno " + matricula + " é " + mediaIndividual);
        
        if(mediaIndividual >=60){ 
            System.out.println("Parabéns, você foi aprovado(a)!");
             System.out.println("");
            aprovados++;
        }
            
            else if(mediaIndividual<60) {
                System.out.println("Você foi reprovado(a)!");
                System.out.println("");
                  
                    reprovados++;}
        
        
        mediaTotal = mediaTotal + mediaIndividual;
        System.out.print("Digite a matrícula do aluno: ");
        matricula=scan.nextInt();   
        totalEstudantes++;
        }
        
        
        equacaoGeral =  (mediaTotal/(double)totalEstudantes);
              
        
        System.out.println("Resultado final");
        System.out.println("A média da turma é: " +equacaoGeral);
        System.out.println("Total de alunos aprovados foi de:" +aprovados);
        System.out.println("Total de alunos reprovados foi de:" +reprovados);
        System.out.println("");
        System.out.println("Total de alunos cadastrados é de: " +totalEstudantes);
        
               
        }
}
        
    
