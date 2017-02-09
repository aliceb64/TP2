package article;

public class TestArticle {
	public static void main(String[] args) {
		Article[] stock = new Article[Article.MAX_ARTICLES];
		int nbArticles = 0;

		stock[nbArticles++] = new Article(10001, "Choucroute garnie bio minceur - 1 Kg (2 portions)", (float) 12.0,
				2000);
		stock[nbArticles++] = new Article(20010, "Nutella spécial étudiant - Pot 10 Kg", (float) 120.0, 500);
		stock[nbArticles++] = new Article(20010, "La pensée de Nicolas S. (24 rouleaux + 6 gratuits)", (float) 8.0,
				1000);

		for (int i = 0; i < nbArticles; i++)
			System.out.println(stock[i]);

		System.out.println(stock[0].getIntitule() + " : " + stock[0].getQuantiteEnStock() + " unités");
		boolean res = stock[0].vendre(25);
		System.out.println("vente réussie " + (res ? "oui" : "non"));
		System.out.println(stock[0].getIntitule() + " : " + stock[0].getQuantiteEnStock() + " unités");
		stock[0].approvisionner(100);
		System.out.println(stock[0].getIntitule() + " : " + stock[0].getQuantiteEnStock() + " unités");
	}
}
