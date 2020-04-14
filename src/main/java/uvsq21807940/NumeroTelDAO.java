package uvsq21807940;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;



public class NumeroTelDAO extends Dao<NumeroTelephone> {

	public NumeroTelDAO(int id) throws IOException {
		super(id);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public NumeroTelephone create(NumeroTelephone obj) throws IOException {
		// TODO Auto-generated method stub
		objOut.writeObject(obj);
		return obj;
	}

	@Override
	public void delete(NumeroTelephone obj) {
		// TODO Auto-generated method stub
		f.delete();

	}

	@Override
	public NumeroTelephone update(NumeroTelephone obj) throws IOException {
		// TODO Auto-generated method stub
		f.delete();
		this.create(obj);
		return obj;
	}

	@Override
	public NumeroTelephone find(String string) throws FileNotFoundException, ClassNotFoundException, IOException {
		File search = new File( ".txt");
        Object deserialized = null;
        if (search.exists()) {
            byte[] fileContent = Files.readAllBytes(search.toPath());
            deserialized = deserialize(fileContent);
        }
        NumeroTelephone numero = (NumeroTelephone) deserialized;
        System.out.println(numero.toString());
        return numero;

}


	@Override
	protected Object read(Object id) {
		// TODO Auto-generated method stub
		return null;
	}}
