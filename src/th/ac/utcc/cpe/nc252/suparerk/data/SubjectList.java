package th.ac.utcc.cpe.nc252.suparerk.data;

public class SubjectList {
	Subject subject;
	SubjectList next;
	
	public SubjectList() {
		subject = new Subject();
	}
	
	@Override
	public String toString() {
		return subject.getCode() + " " +
				subject.getName() + " " +
				subject.getUnit() + " " + 
				subject.getGrade();
	}
}
