public class MainApp {

	public static void main(String[] args){
		
		DBConnection conn = DBConnection.getinstance();

        CompositeMsg comp = new CompositeMsg();
	
        Etudiant etudiant0 =new Etudiant(24, "jobs", "boom", "naz@gmail.com","xxxx",123);
		 
		IJournal j1 = new ScrennMsg();
		IJournal j2 = new DateMsg();
		IJournal j3 = new FileMsg();
		
		comp.add(j1);
		comp.add(j2);
		comp.add(j3);
		
		
		IEtudiantRep ETUDUNIVR = new EtudiantRepository(conn, comp);
		
		IUniversityRep UnivRep = new UniversiteRepository(conn, comp);
		
		EtudiantService serv = new EtudiantService(ETUDUNIVR ,UnivRep, comp);

		try {
			serv.inscription(etudiant0, 123);
			
		} catch (Exception e) {
			
			e.printStackTrace();

		}
	}

}
