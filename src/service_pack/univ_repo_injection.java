package service_pack;
import db_repo_pack.UniversiteRepository;

// pour l'instanciation d'un objet de type UniversiteRepository 
public class univ_repo_injection {
	public static UniversiteRepository creat_univ() {
		return new UniversiteRepository(); 
		
	}

}

