package ch08.se02.service.impl;

import org.springframework.stereotype.Component;

import ch08.se02.service.Axe;
import ch08.se02.service.Person;

@Component
public class Chinese implements Person {
	private Axe axe;
	
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
