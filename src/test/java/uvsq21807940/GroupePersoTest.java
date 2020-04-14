package uvsq21807940;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class GroupePersoTest {

	GroupePersonnel G,K,L;
	
	
	@Before
	public void SetUp(){
		G = new GroupePersonnel("departement");
		K = new GroupePersonnel("groupe personnel 2");
		L = new GroupePersonnel("groupe personnel 3");
	
	}
	
	
	  
	@Test
	public void containsTest(){
       G.add(K);
       G.add(L);
       assertEquals("departement", G.getName());
       assertTrue(G.contains(K));
       assertTrue(G.contains(L));
     
       
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
	        byte[] serialisable = serialize(G);
	        byte[] serialisable2= serialize(G);

	        Object deserialisable = deserialize(serialisable);
	        Object deserialisable2 = deserialize(serialisable2);
	        Assert.assertEquals(deserialisable, deserialisable2);
	        Assert.assertEquals(G, deserialisable);
	        Assert.assertEquals(G, deserialisable2);
	    }
	   
	
}