/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void bamboozled(){
        face.setImage("astonished");
    }

    public void message(String a) {
        face.setMessage(a);
    }
    public void olderThan18(){
        face.setImage("angry");
    }

    public void cry() {
        face.setImage("cry");
    }

    public void happy() {
        face.setImage("joyful");
    }

    public void sus() {
        face.setImage("love");
    }

    public void ecstatic () {
        face.setImage("ecstatic");
    }

    public void depressed() {
        face.setImage("depressed");
    }

    public void sick(){
        face.setImage("sick");
    }

    public void sadge(){
        face.setImage("verysad");
    }

    public void dead(){
        face.setImage("dead");
    
    }
    
    public void skeleton(){
        face.setImage("skeleton");
    }

    public void grave(){
        face.setImage("pushingdaisies");
    }

    public void angel(){
            face.setImage("angel");
    }


} // end Virtual Pet
