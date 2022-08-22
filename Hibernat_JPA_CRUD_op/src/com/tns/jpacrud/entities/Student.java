package com.tns.jpacrud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
		@Id
		private int Student_id;
	
		private String Name;

		public int getStudent_id() {
			return Student_id;
		}

		public void setStudent_id(int Student_id) {
			this.Student_id = Student_id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			this.Name = name;
		}

		public Student() {
	
		}

		public Student(int Student_id, String name) {
			this.Student_id = Student_id;
			this.Name = name;
		}

		@Override
		public String toString() {
			return "Student [studentid=" + Student_id + ", name=" + Name + "]";
		}
}
