public class MakeFactory {
	
    public  AbstractFactory getFactory(boolean limite){   
         if(limite){
            return new Limited();         
         }else{
            return new Unlimited();
         }
      }
}
