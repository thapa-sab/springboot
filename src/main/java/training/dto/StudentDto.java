package training.dto;

public class StudentDto {
	
	private int studentId;
	private String studentName;
	private String studentAdd;
	private int studentPhone;
	private String studentEmail;
	private String studentPwd;
	
	public StudentDto() {
		super();
	}

	public StudentDto(int studentId, String studentName, String studentAdd, int studentPhone, String studentEmail,
			String studentPwd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.studentPwd = studentPwd;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}

	public int getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(int studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPwd() {
		return studentPwd;
	}

	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}

	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", studentAdd=" + studentAdd
				+ ", studentPhone=" + studentPhone + ", studentEmail=" + studentEmail + ", studentPwd=" + studentPwd
				+ "]";
	}
	
	
	
	
	

}
