package jdbc_connection;

import java.util.List;

public class StudentDB_Connection {

	public static void main(String[] args) {
		 StudentDao sDao = new StudentDao();
		 
//		sDao.insertStudent(new Student("5","John", "A++"));
//		sDao.updateStudent(new Student("6", "john","C--"),"5");
//		 sDao.deleteStudent(new Student("5","",""));
//		 System.out.println(sDao.selectAll());
		 List<Student> list = sDao.selectAll();
//		 System.out.println(list);
		 for(Student each : list)
			 System.out.println(each.toString());
//		 System.out.println(sDao.selectOne("4"));
		 
	}
}
