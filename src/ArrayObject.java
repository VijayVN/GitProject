
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] emparr=new Employee[2];
		Employee emp=new Employee(1," Vijay ",21);
		emparr[0]=emp;
		emp=new Employee(2," Namrata ",19);
		emparr[1]=emp;
		for(Employee e:emparr)
		{
			System.out.println("Name- "+e.getEmpName()+" Age- "+e.getAge());
			System.out.println(e);
		}

	}

}
