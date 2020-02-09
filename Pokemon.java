import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Pokemon{
    Scanner sc = new Scanner(System.in  );
    int hp  ;
    int exp  ;
    String name ;
   
    public Pokemon(){
        hp = 50 ;
        exp = 0 ;
        
    }
    
    //Set name charecter
    public String setName(){
        System.out.println(" Welcome to Pokemon Evolution ");
        name = sc.nextLine();
         return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("STATUS POINT");
        System.out.println("Pokemon Trainer : "+name );
        System.out.println("HP : "+hp+"  Point");
        System.out.println("EXP : "+exp+"  Point");
        
        return "";
    }
     public String startGame(){
     int i;
     for(i=0;i<15;i++ ){
       if(i == 2){
         exp += 6;
         System.out.println(" exp :"+exp);

       }
       else if(exp >= 18){
         hp -= 15;
         exp = 0;
         System.out.println(" exp :"+exp);
         System.out.println(" hp:"+hp);
       }
       else if(i == 14){
         i = 0;
       }
       else if(hp <= 0){
         System.out.println("***You Lose***");
         break;    
       }
     }
     return "";
   }

  
}
