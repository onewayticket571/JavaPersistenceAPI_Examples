package okul.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="students")
@PrimaryKeyJoinColumn(name = "studentId")
public class Student extends User {
	
	
	// Example numbers = 294,98012...
	@Column(name="school_number", nullable = false, length = 20)
	private int schoolNumber;
	
	// Example levels = 1-2-3-4-5-10-12
	@Column(name="class_level", nullable = false, length = 2)
	private int classLevel;
	
	// Example braches = A-Y-Z...
	//Example with levels = 9A - 12D - 1B - 5Z
	@Column(name="class_branch", nullable = false, length = 1)
	private char classBranch;

	public Student(String firstName, String lastName, int schoolNumber, int classLevel, char classBranch) {
		super(firstName, lastName);
		this.schoolNumber = schoolNumber;
		this.classLevel = classLevel;
		this.classBranch = classBranch;
	}
		
}
