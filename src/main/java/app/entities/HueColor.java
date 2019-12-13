package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HueColor {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final boolean on;
    private final int sat;
    private final int bri;
    private final int hue;

    public HueColor() {
        this.on = false;
        this.sat = 0;
        this.bri = 0;
        this.hue = 0;
    }
    
    public HueColor(boolean on, int sat, int bri, int hue) {
        this.on = on;
        this.sat = sat;
        this.bri = bri;
        this.hue = hue;
    }
    
    public boolean getOn() {
        return on;
    }

    public int getSat() {
        return sat;
    }

    public int getBri() {
        return bri;
    }

    public int getHue() {
        return hue;
    }

    
    @Override
    public String toString() {
        return "Movie{" + "id=" + '}';
    }
}