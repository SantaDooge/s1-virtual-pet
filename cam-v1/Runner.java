import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        
         VirtualPet p = new VirtualPet() ;
    
        p.exercise();
         takeABeat(1000);  
         p.feed(); 
         String ans= "3";

    }

    public void takeABeat(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch(Exception e){

        }
    }
    String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         "How many balls do you have?",
         "Question?",
         JOptionPane.PLAIN_MESSAGE
       );

    public static void main(String[] args){
        new Runner();
    }
}
