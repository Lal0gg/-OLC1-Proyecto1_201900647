/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author edujr
 */
    public class State {
        int label;
        State next1, next2;
        String transition;

        public State(int label) {
            this.label = label;
            this.next1 = this.next2 = null;
            this.transition = "";
        }
    }
