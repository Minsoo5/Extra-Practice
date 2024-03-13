import java.io.*;
import java.util.*;

// This class implements "Serializable" to let the system know
// it's ok to do it. You as programmer are aware of that.
public class SerializationSample implements Serializable {

    // These attributes conform the "value" of the object.

    // These two will be serialized;
    private String aString = "The value of that string";
    private int    someInteger = 0;

    // But this won't since it is marked as transient.
    private transient List<File> unInterestingLongLongList;

    public SerializationSample() {}

    public void setaString(String string) {
        aString = string;
    }
    public String getaString() {
        return aString;
    }

    // Main method to test.
    public static void main( String [] args ) throws IOException, ClassNotFoundException {

        // Create a sample object, that contains the default values.
        SerializationSample instance = new SerializationSample();

        instance.setaString("Testing");
        // The "ObjectOutputStream" class has the default 
        // definition to serialize an object.
        ObjectOutputStream oos = new ObjectOutputStream(
                // By using "FileOutputStream" we will
                // Write it to a File in the file system
                // It could have been a Socket to another
                // machine, a database, an in memory array, etc.
                new FileOutputStream(new File("o.ser")));

        // do the magic  
        oos.writeObject( instance );
        // close the writing.
        oos.close();

        SerializationSample holder = null;

        FileInputStream file = new FileInputStream("o.ser");
        ObjectInputStream objIn = new ObjectInputStream(file);

        holder = (SerializationSample) objIn.readObject();

        System.out.println("Deserialized Object's Value: " + holder.getaString());

    }
}