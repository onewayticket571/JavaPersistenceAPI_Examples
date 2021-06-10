package okul.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="teachers")
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "teacher_Id")
public class Teacher extends User {
	
	@Column(name="subject", nullable = false, length = 30)
	private String subject;
	
	@Column(name="experience", nullable = false, length = 2)
	private int experience;

	public Teacher(String firstName, String lastName, String subject, int experience) {
		super(firstName, lastName);
		this.subject = subject;
		this.experience = experience;
	}
	
	

}
