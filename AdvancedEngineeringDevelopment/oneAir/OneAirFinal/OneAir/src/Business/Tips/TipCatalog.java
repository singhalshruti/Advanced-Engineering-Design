/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tips;


import java.util.ArrayList;

public class TipCatalog {

    private ArrayList<Tip> tipList;

    public TipCatalog() {
        tipList = new ArrayList<Tip>();
    }

    public ArrayList<Tip> getTipList() {
        return tipList;
    }

    public void setTipList(ArrayList<Tip> tipList) {
        this.tipList = tipList;
    }

    public Tip addTip() {
        Tip tip = new Tip();
        tipList.add(tip);
        return tip;
    }

    public void deleteTip(Tip tip) {

        tipList.remove(tip);

    }
}
