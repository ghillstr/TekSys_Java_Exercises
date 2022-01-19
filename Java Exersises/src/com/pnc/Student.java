package com.pnc;



public class Student {
	
	public static void main(String[] args) {
		Student george = new Student( 1, "George", "Hillstrom", "georgehillstrom@gmail.com", "555-555-5555");
		System.out.println(george.toString());
	}
		@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fristName=" + fristName + ", lastName=" + lastName
				+ ", studentEmail=" + studentEmail + ", studentPhone=" + studentPhone + "]";
	}
		int studentId; 
		String fristName;
		String lastName;
		String studentEmail;
		String studentPhone;
		
		public Student (int studentId, String fristName, String lastName, String studentEmail, String studentPhone) {
			this.studentId = studentId;
			this.fristName = fristName;
			this.lastName = lastName;
			this.studentEmail = studentEmail;
			this.studentPhone = studentPhone;
			
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getFristName() {
			return fristName;
		}

		public void setFristName(String fristName) {
			this.fristName = fristName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getStudentEmail() {
			return studentEmail;
		}

		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}

		public String getStudentPhone() {
			return studentPhone;
		}

		public void setStudentPhone(String studentPhone) {
			this.studentPhone = studentPhone;
		}
}
