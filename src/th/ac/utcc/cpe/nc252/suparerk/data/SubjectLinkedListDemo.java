package th.ac.utcc.cpe.nc252.suparerk.data;

import th.ac.utcc.cpe.nc252.suparerk.data.SubjectLinkedList;
import th.ac.utcc.cpe.nc252.suparerk.data.SubjectList;

public class SubjectLinkedListDemo {

	public static void main(String[] args) {
		SubjectLinkedList subjectLinkedList = new SubjectLinkedList();
		
		SubjectList s1 = new SubjectList();
		s1.subject.setCode("NC252");
		s1.subject.setName("Data Structures");
		s1.subject.setUnit(3);
		s1.subject.setGrade("A");
		
		SubjectList s2 = new SubjectList();
		s2.subject.setCode("NC355");
		s2.subject.setName("Computer Organization");
		s2.subject.setUnit(3);
		s2.subject.setGrade("B+");
		
		SubjectList s3 = new SubjectList();
		s3.subject.setCode("NC255");
		s3.subject.setName("Digital");
		s3.subject.setUnit(4);
		s3.subject.setGrade("B");
		
		subjectLinkedList.insertFirst(s3);
		subjectLinkedList.insertFirst(s1);
		subjectLinkedList.insertFirst(s2);
		
		subjectLinkedList.displayAll();
		
		SubjectList s4 = subjectLinkedList.search("NC355");
		System.out.println("Result from searching:");
		System.out.println(s4);

	}

}
