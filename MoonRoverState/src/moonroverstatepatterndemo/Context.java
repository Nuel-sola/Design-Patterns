/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 * @author emmanuelAdebiyi
 * @version 1.0 
 */
class Context {
    State buggyState;
    
    
    public Context(){
    }
    
    public Context(State buggyState) {
        this.buggyState = buggyState;
    }

    public State getBuggyState() {
        return buggyState;
    }

    public void setBuggyState(State buggyState) {
        this.buggyState = buggyState;
    }
    
    
}
