package pack;
public class Viaggio {
    private String destinazione;
    private int durataGiorni;
    private double costoBase;




    public Viaggio(String destinazione, int durataGiorni, double costoBase) {
        this.destinazione = destinazione;
        this.durataGiorni = durataGiorni;
        this.costoBase = costoBase;
    }
    public Viaggio() {
        this("NON INSERITA",0,0.0);
    }
    
    public String getDestinazione() { return destinazione; }
    public int getDurataGiorni() { return durataGiorni; }
    public double getCostoBase() { return costoBase; }
    public void setDestinazione(String destinazione) { this.destinazione = destinazione; }
    public void setDurataGiorni(int durataGiorni) { this.durataGiorni = durataGiorni; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

 
    public String toString() {
        return "Destinazione='" + this.destinazione  + ", durataGiorni=" + this.durataGiorni + ", costoBase=" + this.costoBase;
    }
    
    public boolean equals(Object object){
        if (object instanceof Viaggio){
            Viaggio r=(Viaggio) object;
            return r.getDestinazione().equalsIgnoreCase(this.destinazione) && this.durataGiorni == r.getDurataGiorni() && this.costoBase == r.getCostoBase();
        }
        return false;
    }

    public double getCosto(){
        return getCostoBase();
    }
}