/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculator;

/**
 *
 * @author Farrel Haykal
 */
import java.util.ArrayList;
import java.util.List;

public class Family {
    private Spouse spouse;
    private List<Child> children = new ArrayList<>();

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public boolean hasSpouse() {
        return spouse != null;
    }

    public int getNumberOfChildren() {
        return Math.min(children.size(), 3);
    }
}

