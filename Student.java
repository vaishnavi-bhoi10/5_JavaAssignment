package Assignment_5;

public class Student {

		private String name;
		private int age;
		private String address;

		public Student() {
			name = "Unknown";
			age = 0;
			address = "Not Available";
		}

		public void setInfo(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void setInfo(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public void displayInfo() {
			System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
		}

		public static void main(String[] args) {
			Student[] students = new Student[10];
			for (int i = 0; i < students.length; i++) {
				students[i] = new Student();
			}

			students[0].setInfo("Yash", 20, "Goa");
			students[1].setInfo("Meet", 22, "Nashik");
			students[2].setInfo("Nia ", 19);
			students[3].setInfo("Veena", 21, "Pune");
			students[4].setInfo("Malti", 23);
			students[5].setInfo("Rushi", 24, "Mumbai");
			students[6].setInfo("Vinay", 25);
			students[7].setInfo("Abhii", 18, "Goa");
			students[8].setInfo("Kavya", 20);
			students[9].setInfo("Aditi", 22, "Shimla");

			for (Student student : students) {
				student.displayInfo();
			}
		}
	}