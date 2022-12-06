public  class Singleton {
	private static Singleton instance; // protégé contre l’accès externe et statique
	private Singleton() {} // constructeur privé avec protection d’accès externe
	public static Singleton getInstance() { // méthode publique, appel par code
		if (instance == nul) { // seulement si aucune instance n’existe, en créer une nouvelle
			instance = new Singleton();
		}
		return instance;
	}
}
