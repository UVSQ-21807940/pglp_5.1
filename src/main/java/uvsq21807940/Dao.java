package uvsq21807940;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Dao<T> {
	protected File f;
    protected FileOutputStream fileOut;
    protected ObjectOutputStream objOut;
    
  
    public Dao(int id) throws IOException{
    	f = new File(id +".txt");
    	fileOut = new FileOutputStream(f);
    	objOut = new ObjectOutputStream(fileOut);
    }
    

    
    public abstract T create (T obj) throws IOException;
    
   
    public abstract void delete(T obj);
    
    
    public abstract T update(T obj) throws IOException;
    
   
    public abstract T find(String string) throws FileNotFoundException, ClassNotFoundException, IOException;
    
    
    public Object deserialize(final byte[] bytes) throws ClassNotFoundException, IOException {
        ByteArrayInputStream a = new ByteArrayInputStream(bytes);
        ObjectInputStream b = new ObjectInputStream(a);
        return b.readObject();
    }
    
   
    public byte[] serialize(final Object obj) throws IOException {
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        ObjectOutputStream b = new ObjectOutputStream(a);
        b.writeObject(obj);
        return a.toByteArray();
    }

	protected abstract Object read(Object id);
    
}
