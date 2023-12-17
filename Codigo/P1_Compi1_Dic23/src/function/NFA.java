/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author edujr
 */
public class NFA {
    State start, accept;
    String transition;

    public NFA(State start, State accept, String transition) {
        this.start = start;
        this.accept = accept;
        this.accept.transition = transition;
    }
    @Override
    public String toString() {
        return "NFA{start=" + start.label + ", accept=" + accept.label + ", transition='" + accept.transition + "'}";
    }
}
