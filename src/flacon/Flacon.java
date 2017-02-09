package flacon;

public class Flacon {
	private final float capacite;
    private float volume;
    private float concentration;
    String etiquette;

    public Flacon(String etiquette, float capacite) {
        this.etiquette = etiquette;
        this.capacite = capacite;
        this.volume = 0;
    }

    public void verser(float volumeSirop, float volumeEau) {
        if (volume + volumeSirop + volumeEau > capacite) {
            System.err.println("ERREUR - Capacite insuffisante");
            System.exit(0);
        }
        float s = volume * concentration + volumeSirop;
        volume += volumeSirop + volumeEau;
        concentration = s / volume;
    }

    public void transvaser(Flacon bouteille, float volume) {
        if (volume > bouteille.volume || this.volume + volume > capacite) {
            System.out.println("ERREUR - Volume excessif");
            System.exit(0);
        }
        bouteille.volume -= volume;
        float s = this.volume * this.concentration + volume
                * bouteille.concentration;
        this.volume += volume;
        concentration = s / this.volume;
    }

    public String toString() {
        String r = etiquette + " - " + volume + " ml";
        if (volume > 0)
            r += " (à " + concentration * 100 + "%)";
        return r;
    }
}
