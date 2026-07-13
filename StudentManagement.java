import java.util.*;
class StudentClass
{
	private int id;
	private String name;
	private double marks;
	StudentClass(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getMarks(){
		return marks;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMarks(double marks){
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);
	}
	
}
class StudentManagement
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	ArrayList<StudentClass> student = new ArrayList<>();
	 int choice;
	do
	{
	    System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Exit");
          
	
	 System.out.print("Enter choice: ");
             choice = sc.nextInt();
	switch(choice)
	{
		case 1:
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			sc.nextLine();
		        System.out.println("Enter name of student: ");
			String name=sc.nextLine();
			System.out.println("Enter marks of student: ");
			double marks=sc.nextDouble();
			student.add(new StudentClass(id,name,marks));
			break;
		case 2:
			if(student.isEmpty())
				System.out.println("No student Found!");
			else{
			for(StudentClass s: student)
			{
				s.display();
			}}
			break;
		case 3:
			System.out.println("Enter id to search: ");
			int search = sc.nextInt();
			for(StudentClass s : student)
			{
				if(s.getId()==search)
				{
					System.out.println("Student found!!");
					System.out.println("ID: "+s.getId()+" Name: "+s.getName()+" Marks: "+s.getMarks());
				}
			}
			break;
		case 4:
			System.out.println("Enter id to update: ");
			int updateId = sc.nextInt();
			for(StudentClass s : student)
			{
			   if(s.getId()==updateId)
			   {
				System.out.println("Enter Marks: ");
				s.setMarks(sc.nextDouble());
			   }
			}
			break;
		case 5:
			Iterator itr = student.iterator();
			System.out.println("Enter Id to delete : ");
			int delId=sc.nextInt();
			while(itr.hasNext())
			{
				StudentClass s = (StudentClass) itr.next();
				if(s.getId()==delId)
				{
				   itr.remove();
				}
			}
		case 6:
			System.out.println("Exiting..");
			break;
		default:
			System.out.println("Invalid input! Please try again ?");
	}
	}
	while(choice!=6);
	}
}
