import java.util.ArrayList;

/*
	@author Luthfi Kurnia Putra
	for Email Retrieval Simulation Experiment

	@class StringEmail 
	Represent an Email indexed in String values
	span from A to Z.
*/

class StringEmail implements Comparable{

	public String key;
	public String value;
	public ArrayList<String> list;

	public StringEmail(String key){
		this.key = key;
		list = new ArrayList<String>();
	}

	@Override
    public int compareTo(Object other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
       return (int) this.key.charAt(0) - ((StringEmail) other).key.charAt(0);
    }

     public StringEmail add(String input){
    	list.add(input);
    	return this;
    }

    public boolean contains(String target){
    	return list.contains(target);
    }
}