package th.ac.utcc.cpe.nc252.suparerk.data;

public class SubjectLinkedList {
	private SubjectList first;
	
	public SubjectLinkedList() {
		first = null;
	}
	
	public void insertFirst(SubjectList s) {
		s.next = first;
		first  = s;
	}
	
	public SubjectList search(String code) {
		SubjectList current = first;
		while(!current.subject.getCode().equals(code)) {
			if(current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		
		return current;
	}
	
	public void displayAll() {
		SubjectList current = first;
		while(current != null) {
			System.out.println(current);
			current = current.next;
		}
	}
}
