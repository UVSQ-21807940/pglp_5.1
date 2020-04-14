package uvsq21807940;

public abstract class AbstactDaoFactory {

public enum DAOType {JDBC, Serial};
	
	public abstract Dao<Personnel> getPersonnelDAO();
	
	public abstract Dao<GroupePersonnel> getPersonnelGroupeDAO();
	
	public static DaoFactory getFactory(DAOType type) {
		
		if (type == DAOType.Serial) return new DaoFactory();
		return null;
	}
	
}
