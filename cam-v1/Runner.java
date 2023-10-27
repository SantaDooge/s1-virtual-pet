import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
    public  boolean Answer;
    public boolean answerBoolean;

    public Runner(){
        
        
         VirtualPet p = new VirtualPet() ;
    
        p.exercise();
         takeABeat(1000);  
         p.feed(); 
        p.message("Hello I am death and I have come to speak to you");
        takeABeat(1500);
        p.bamboozled();
      
        int ans4= buttonQuestion("Would you like to know when you'll die?");
        if (ans4==0){
            int ans=getAge("How old are you");
         System.out.println(ans);
         if(ans<18){
            p.bamboozled();
            p.message("so young!!");
         }
         else{
            p.message("so old");
            p.olderThan18();
         }
         
         int randomNum = ThreadLocalRandom.current().nextInt(1, 60 + 1);
         System.out.println(randomNum);

    
        
           optionSelect("you have " +randomNum+ " years to live!", "omg!", "wowzers!");
           p.bamboozled();
         p.message("I will grant you one wish");
        String ans5=optionSelect("do you want fame", "no I don't need fame", "yes");
        takeABeat(1000);
        String ans6= optionSelect("would you like money", "no I don't need money", "yes");
        if (ans5.equals("yes")|| ans6.equals("yes")){
            p.message("you are too greedy");
            p.shocked();
            takeABeat(1500);
            p.minecraftdeath();
            
        }
        else{
            p.message("you passed the test");
            takeABeat(1000);
            p.message("you did not choose fame or money so I will let you live your life peacefully" );
            p.happy();
            takeABeat(1500);
            p.ecstatic();
            takeABeat(1000);
            p.backflip();
            
        }



    }
        else{
            p.message("BORRINGG");
            p.sick();
            takeABeat(2000);
            p.sadge();
             takeABeat(2000);
            p.dead();
             takeABeat(2000);
            p.skeleton();
             takeABeat(2000);
            p.grave();
             takeABeat(2000);
             p.angel();
             takeABeat(2000);
        }

         

    }

    public void takeABeat(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch(Exception e){

        }
    }
    public String getResponse(String q){
    String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         q,
         "Question?",
         JOptionPane.PLAIN_MESSAGE
       );

       return s;
       
    }
    public int getAge(String q){
         String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         q,
         "Question?",
         JOptionPane.PLAIN_MESSAGE
       );
       int x = Integer.parseInt(s);
       return x;

    
    }

    public static void main(String[] args){
        new Runner();
    }


    public int buttonQuestion(String q){
        int n = JOptionPane.showConfirmDialog(
            new JFrame(),
            q,
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);
    return n;
    }
    public String optionSelect(String a, String b, String c) {
        Object[] options = {b,
                            c};
        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            a,
            null,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title);
        if(JOptionPane.YES_OPTION == n) {
            answerBoolean = true;
            return "yes";
        }
        else {
            answerBoolean = false;
            return "no";
        }
    }

}
