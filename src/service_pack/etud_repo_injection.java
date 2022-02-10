package service_pack;
import db_repo_pack.EtudiantRepository;

public class etud_repo_injection {
	public static EtudiantRepository creat_etud() {
		return new EtudiantRepository(); 
		
	}

}