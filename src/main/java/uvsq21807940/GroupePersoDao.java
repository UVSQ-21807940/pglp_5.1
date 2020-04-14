package uvsq21807940;

import java.io.FileNotFoundException;
import java.io.IOException;



public class GroupePersoDao extends Dao<GroupePersonnel> {
	

	public GroupePersoDao(int id) throws IOException {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public GroupePersonnel create(GroupePersonnel obj){	
	GroupePersonnel groupe = null;
		return groupe;
}
	
	//effacer
	  public void delete(GroupePersonnel obj) {
	        
	    }
	
	  //mise a jour
	  public GroupePersonnel update(GroupePersonnel obj) { 
	        GroupePersonnel groupe= null;
	        return groupe;
	    }
	  //recherche
	  public GroupePersonnel find(String string) {
	        GroupePersonnel groupe = null;
	        return groupe;
	    }

	GroupePersonnel read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object read(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}