/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 *
 * @author emmanuelAdebiyi
 * @version 1.0 emmanuelAdebiyi
 */
public interface State {
    public String pressLeftPedalOnce(Context buggyContext);
    public String pressLeftPedalFor3Sec(Context buggyContext);
    public String pressRightPedalOnce(Context buggyContext);    
    public String pressRightPedalFor3Sec(Context buggyContext);
    
}
