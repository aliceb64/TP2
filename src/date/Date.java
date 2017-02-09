package date;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	private int jourSemaine;

	public Date(int jour, int mois, int annee) {
		if (mois < 1 || mois > 12 || jour < 1 || jour > 31
				|| jour == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11) || jour == 30 && mois == 2
				|| jour == 29 && mois == 2 && annee % 4 != 0) {
			System.out.println("Date incorrecte");
			System.exit(0);
		}
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.jourSemaine = jourSemaine(jour, mois, annee);
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

	int getJourSemaine() {
		return jourSemaine;
	}

	public String toString() {
		return jours[jourSemaine] + " " + jour + " " + moiss[mois - 1] + " " + annee;
	}

	public boolean infeg(Date d) {
		return annee < d.annee || annee == d.annee && mois < d.mois
				|| annee == d.annee && mois == d.mois && jour <= d.jour;
	}

	private String[] jours = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };

	private String[] moiss = { "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "août", "septembre",
			"octobre", "novembre", "decembre" };

	private int jourSemaine(int jour, int mois, int annee) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.set(annee, mois - 1, jour);
		return (c.get(java.util.Calendar.DAY_OF_WEEK) + 5) % 7;
	}
}
