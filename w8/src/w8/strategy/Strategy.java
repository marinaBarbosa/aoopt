/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8.strategy;

/**
 *
 * @author marina
 */

public interface Strategy { 
    public abstract Move calculateNextMove(Board b) ;
}