package pl.edu.pwr.abis.domain;

import java.util.*;

public class Aplikant {

	Collection<Projekt> projekty;
	Collection<PrzedstawicielAplikanta> przedstawiciele;
	String email;
	String nazwa;
	Adres adres;
	DaneZarzadzajacegoAplikantem daneZarzadzajacego;
	Boolean czyCzlonekIPMA;
	DaneUczestnictwaWPPEA daneWczesniejszegoUczestnictwa;
	Boolean czyZweryfikowany;

}
