/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5;

/**
 *
 * @author marin
 */
public class Chapter extends Document{
    Paragraph pr;
    
    public Chapter() {
       super(); 
    }
    public void addParagraph(Paragraph pr) {
        this.pr = pr;
        
    }
    
}