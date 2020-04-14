package uvsq21807940;

import java.io.IOException;

import uvsq21807940.AbstactDaoFactory.DAOType;

public class DaoFactory {
	
		public static Dao<NumeroTelephone> getNumeroTelDAO() throws IOException {
			return getNumeroTelDAO();
			}
			
		
			
			public static Dao<Personnel> getPersonnelDAO(){ 
				return  getPersonnelDAO();
			}
		
		
			
			 public static Dao<GroupePersonnel> getGroupePersonnels() {
			        return getGroupePersonnels();
			        
			    }



			public static AbstactDaoFactory getFactory(DAOType serial) {
				// TODO Auto-generated method stub
				return null;
			}

}
