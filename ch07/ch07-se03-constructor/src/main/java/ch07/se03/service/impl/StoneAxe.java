package ch07.se03.service.impl;

import ch07.se03.service.Axe;

public class StoneAxe implements Axe {

	@Override
	public String chop() {
		return "石斧砍柴很慢！";
	}

}
