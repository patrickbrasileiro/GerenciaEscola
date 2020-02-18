package controller;

import model.Professor;

public class ProfessorController {
	
	public void testeProfessor() {
// estancia		
		 Professor p1 = new Professor();
		 p1.setNome("Joel");
		 p1.setCpf("11145612318");
		 p1.setSalario(1000);
		 p1.setMateria("matematica");
		 p1.exibe();
	}

}
