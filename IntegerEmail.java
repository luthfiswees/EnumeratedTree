import java.util.ArrayList;

/*
	@author Luthfi Kurnia Putra
	for Email Retrieval Simulation Experiment

	@class IntegerEmail 
	Represent an Email indexed in integer values
	span from 0 to 9.
*/

class IntegerEmail implements Comparable{

	public int key;
	public String value;
	public ArrayList<String> list;

	public IntegerEmail(int key){
		this.key = key;
		list = new ArrayList<String>();
	}

	@Override
    public int compareTo(Object other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
       return this.key - ((IntegerEmail) other).key;
    }

    public IntegerEmail add(String input){
    	list.add(input);
    	return this;
    }

    public boolean contains(String target){
    	return list.contains(target);
    }

    public void print(){
    	System.out.println(list.size());
    	for(int i = 0; i < list.size(); i++)
    	{
    		System.out.print(list.get(i));
    	}
    }
}