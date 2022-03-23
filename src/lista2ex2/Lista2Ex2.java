/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2ex2;
import java.util.Scanner; 
/**
 *
 * @author ALUNO
 */
public class Lista2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int segundos, minutos, horas, soma;
        
        
        Scanner leia = new Scanner(System.in);
        System.out.print("A duração do evento em segundos é: ");
        segundos = leia.nextInt();
        
        minutos= segundos/60;
        horas= segundos/3600;
        
        
        System.out.println(minutos);
        
        System.out.print(horas);
      
        
        
       
        
        
        
        
        
        
    }
    
}
