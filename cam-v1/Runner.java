import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        
         VirtualPet p = new VirtualPet() ;
    
        p.exercise();
         takeABeat(1000);  
         p.feed(); 
         int ans1 = getAge("how much money do we have?");
         if(ans1<50) {
            p.cry();
            p.message("NOOOOOO!!!!!");
            takeABeat(1500);
         }

         else {
            p.happy();
            takeABeat(1500);
            p.sus();
            String ans2 = getResponse("Can I play with you?");
            if(ans2.equals("yes")) {
                p.ecstatic();
                takeABeat(1500);
            }
            else {
                p.depressed();
                takeABeat(1500);
            }
         }
         
         int ans=getAge("How old are you");
         System.out.println(ans);
         if(ans<18){
            p.youngerThan18();
            p.message("so young!!");
         }
         else{
            p.message("so old");
            p.olderThan18();
         }
         System.out.println(buttonQuestion("are you on the gay radar"));
         

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


    public String buttonQuestion(String q){
        int n = JOptionPane.showConfirmDialog(
            new JFrame(),
            q,
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);
    return null;
    }

}
