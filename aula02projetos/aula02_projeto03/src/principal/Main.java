package principal;

import controls.ControleProfessor;
import controls.ControleTurma;
import entities.Professor;
import entities.Turma;
import entities.types.Turno;

public class Main {

	public static void main(String[] args) {
		
		Turma t = new Turma(1, "Java BRQ SP", Turno.Tarde);
		Professor p = new Professor(1, "Sergio Mendes", "1234567890");
		
		//atribuir o professor à turma
		t.setProfessor(p);
		
		ControleTurma controleTurma = new ControleTurma();
		ControleProfessor controleProfessor = new ControleProfessor();
		
		try {
			
			controleProfessor.exportarDados(p);
			controleTurma.exportarDados(t);
			
			System.out.println("Dados gravados.");
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
}




