package sorting;

public class Student implements Comparable<Student>{
		
		private String studentName;
		private int rollNo;
		private int studentAge;
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public int getStudentAge() {
			return studentAge;
		}
		public void setStudentAge(int studentAge) {
			this.studentAge = studentAge;
		}
		
		public Student(String studentName,int rollNo,int studentAge){
			this.studentName = studentName;
			this.studentAge = studentAge;
			this.rollNo = rollNo;
		}
		@Override
		public int compareTo(Student stuage) {
			int compareAge = ((Student)stuage).getStudentAge();
			return this.studentAge-compareAge;
		}
		
		@Override
		public String toString(){
			return  "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
		}
		
}
