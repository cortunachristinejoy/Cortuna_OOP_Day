/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity1.pkg2;
   
    import java.util.Scanner;

    public class LabActivity12 {


    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter message: ");
        String message = input.nextLine();
        String[] letters = message.split("\\s+");
        int upper = 0;
        
        for (String letter : letters){
            if (!letter.isEmpty()){
                
                letter = letter.substring(1);
                
                for (char j : letter.toCharArray()){
                    if ( j >= 'A' && j <= 'Z'){
                        upper++;
                        break;
                    }
                }
            }
        }
        if ( upper > 0){
            System.out.println("Jeje!");
        }
        else {
            System.out.println("uWu!");
        }
    }
    
}

 
    

