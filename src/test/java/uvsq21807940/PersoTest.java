package uvsq21807940;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uvsq21807940.Personnel.Builder;

public class PersoTest {
	Dao<Personnel> perso;
	Personnel ouvrier;
	
	 @Before
	    public void setUp() {
	   
	        NumeroTelephone portable = new NumeroTelephone("perso","07565434");
			Builder b = new Builder("hadj said","mohand", "chef", LocalDate.of(1995,06,28));
			b.numTelephones(portable);
			Personnel p = b.build();
			ouvrier = p;
	        
	 }
	 
	 @Test
	 public void PersoTest(){
		 
		 String nom = "hadj said";
		 String prenom = "mohand";
		 String fonction ="chef";
		 LocalDate date = LocalDate.of(1995, 06, 28);
		 
		 

	        assertEquals(nom, ouvrier.getNom());
	        assertEquals(prenom, ouvrier.getPrenom());
	        assertEquals(fonction, ouvrier.getFonction());
	        assertEquals(date, ouvrier.getDateNaissance());

	    }
	 
	 private Object deserialize(final byte[] bytes) throws ClassNotFoundException, IOException {
	        ByteArrayInputStream a = new ByteArrayInputStream(bytes);
	        ObjectInputStream b = new ObjectInputStream(a);
	        return b.readObject();
	 }
	 
	 private byte[] serialize(final Object obj) throws IOException {
	        ByteArrayOutputStream a = new ByteArrayOutputStream();
	        ObjectOutputStream b = new ObjectOutputStream(a);
	        b.writeObject(obj);
	        return a.toByteArray();
	    }
	 
	 
	 @Test
	    public void serialisableTest() throws IOException, ClassNotFoundException {
	        Personnel p = ouvrier;
	        byte[] serialisable = serialize(p);
	        byte[] serialisable2 = serialize(p);

	        Object deserialisable = deserialize(serialisable);
	        Object deserialisable2 = deserialize(serialisable2);
	        
	        Assert.assertEquals(deserialisable, deserialisable2);
	        Assert.assertEquals(p, deserialisable);
	        Assert.assertEquals(p, deserialisable2);
	 }
	 
	 
	 
	 }
	
