
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ArrayList;

public class Record implements Serializable

{

    String doctor;
    String patient;
    
    private ArrayList<String> data = new ArrayList<String>();
    
    void addUsers(String doctor,String patient)
    {
    	this.doctor = doctor;
    	this.patient = patient;
    }
    
    void addData(String medData)
    {
    	this.data.add(medData);
    }
    
    void printData()
    {
    	for(int i=0;i<data.size();i++)
    	{
    		System.out.println(data.get(i));
    	}
    }
}