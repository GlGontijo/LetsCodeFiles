package br.com.letscode.poo.entity;

import br.com.letscode.poo.interfaces.ILampada;

public class LampadaIncandescente implements ILampada {
    private boolean isOn;

    @Override
    public void liga() {
        if (!isOn){
            this.isOn = true;
            System.out.println("Lâmpada Incandescente ligada!");
        } else {
            System.out.println("Lâmpada Incandescente já se encontra ligada!");
        }
    }

    @Override
    public void desliga() {
        if (isOn){
            this.isOn = false;
            System.out.println("Lâmpada Incandescente desligada!");
        } else {
            System.out.println("Lâmpada Incandescente já se encontra desligada!");
        }
    }

    public boolean isOn() { return isOn; }
}
