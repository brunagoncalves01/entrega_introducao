package model;

import model.Agenda;
import model.Evento;
import model.Agendamento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AgendaTest implements Agendamento{
	
	Evento evento = new Evento();
	Agenda agenda = new Agenda();
	String resultado;
	
	
	
	@Test
	public Evento agendarTest(Evento e) {
		
		evento = e;
		int cont = 0;
		
		int id = 0;
        String nome = "Bruna";
        String dataInicial = "09/18/2020 01:00";
        String dataFinal = "09/19/2020 01:00";
        
        evento.setId(id);
        evento.setNome(nome);
        evento.setDataInicial(dataInicial);
        evento.setDataFinal(dataFinal);
        
        if(agenda.agendar(evento) != null) {
        	cont = 1;
        }
        assertEquals(1, cont);
        return evento;
	}
	
	@Test
	public int retornaTempoParaEventoTest() {
		String nome = "Bruna";
		int resultado = 0;
		if(nome.equals(evento.getNome())) {
			resultado = agenda.retornaTempoParaEvento();
		}
		assertEquals(1, resultado);
		return 1;  
	}
		

}
