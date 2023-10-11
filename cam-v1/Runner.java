import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        
         VirtualPet p = new VirtualPet() ;
    
        p.exercise();
         takeABeat(1000);  
         p.feed(); 
         System.out.println(getResponse("how many balls do you have?"));
         
         int ans=getAge("How old are you");
         System.out.println(ans);
         if(ans<18){
            p.youngerThan18();
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
}
