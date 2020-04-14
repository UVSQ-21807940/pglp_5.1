package uvsq21807940;

import java.io.FileNotFoundException;
import java.io.IOException;



public class PersonnelDao extends Dao<Personnel> {

	public PersonnelDao(int id) throws IOException {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Personnel create(Personnel obj) throws IOException {
		// TODO Auto-generated method stub
		Personnel perso =null;
		return perso;
	}

	@Override
	public void delete(Personnel obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personnel update(Personnel obj) throws IOException {
		// TODO Auto-generated method stub
		Personnel perso = null;
		return perso;
	}

	@Override
	public Personnel find(String string) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Personnel perso = null;
		return perso;
	}

	Personnel read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object read(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
