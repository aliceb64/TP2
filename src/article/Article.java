package article;

public class Article {
	static final int MAX_ARTICLES = 100;
	static final float TAUX_TVA = 19.6f;
	private long reference;
	private String intitule;
	private float prixHT;
	private int quantiteEnStock;

	public Article(long reference, String intitule, float prixHT, int quantiteEnStock) {
		this.reference = reference;
		this.intitule = intitule;
		this.prixHT = prixHT;
		this.quantiteEnStock = quantiteEnStock;
	}

	public long getReference() {
		return reference;
	}

	public String getIntitule() {
		return intitule;
	}

	public float getPrixHT() {
		return prixHT;
	}

	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}

	public boolean vendre(int nombreUnites) {
		if (nombreUnites > quantiteEnStock)
			return false;
		quantiteEnStock -= nombreUnites;
		return true;
	}

	public void approvisionner(int nombreUnites) {
		quantiteEnStock += nombreUnites;
	}

	public float prixTTC() {
		return (1 + TAUX_TVA / 100) * prixHT;
	}

	public String toString() {
		return "ref. " + reference + " " + intitule + " (" + prixTTC() + "EUR TTC)";
	}

	public boolean equals(Article unArticle) {
		return reference == unArticle.reference;
	}
	
}
