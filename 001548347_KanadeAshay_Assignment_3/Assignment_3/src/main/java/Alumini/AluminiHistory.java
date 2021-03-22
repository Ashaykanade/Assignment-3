/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumini;

import java.util.ArrayList;

/**
 *
 * @author kanad
 */
public class AluminiHistory {
    
    private ArrayList<Alumini> history;
    
    public AluminiHistory(){
        
        this.history= new ArrayList<Alumini>();
        
    }

    public ArrayList<Alumini> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Alumini> history) {
        this.history = history;
    }
    
    public Alumini addNewAlumini(){
        
        Alumini newAlumini = new Alumini();
        history.add(newAlumini);
        return newAlumini;
    
    }
    
    public void deleteVitals(Alumini a){
        history.remove(a);
    }
    
}
