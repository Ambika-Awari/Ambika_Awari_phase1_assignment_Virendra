package Assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serialization 
{

	public static void main(String[] args) throws IOException
	{
	     emp2 obj=new emp2("ambika", 3, 21, "sw", "ambika.com", 155236558, "f");
	     emp2 obj1=new emp2("ambika", 3, 21, "sw", "ambika.com", 155236558, "f");
	     
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("H:\\simplinering//Student.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj1);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
     emp2 o=null;
     try{
       FileInputStream fis = new FileInputStream("H:\\simplinering//Student.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (emp2)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("emp Name:"+o.getname());
     System.out.println("emp id :"+o.getid());
     System.out.println("emp age:"+o.getage());
     System.out.println("emp deptname:"+o.getdeptname());
     System.out.println("emp email:"+o.getemail());
     System.out.println("emp contact:"+o.getcontact());
     System.out.println("emp gender:"+o.getgender());
     

	}

}
class emp2 implements java.io.Serializable
{
	
	  private String name; 
	  private int id;
	  private  int age;
	  private String deptname;  
	  private String email; 
	  private  int contact;
	  private String gender;	  
	
	  
	  public emp2(String name, int id, int age, String deptname,String email, int contact, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.deptname = deptname;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
	}
	
	  public String getgender() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getcontact() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getemail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getdeptname() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getid() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStuHeight() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStuAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStuRollNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStuAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStuName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	} 
}
