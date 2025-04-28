package pl.edu.pwr.abis.domain;

import java.util.*;

public class Projekt {

	OcenaKo?cowa ocenaKo?cowa;
	Collection<OcenyAsesora> ocenyAsesora;
	FormularzAplikacyjny formularzAplikacyjny;
	String nazwa;
	Real budzet;
	Boolean czyUkonczony;
	String opis;
	Boolean czyZgodnyZICB4;
	Boolean czyDostepnyDoPublikacji;
	Real calkowityKosztUczestnictwa;
	StopienNagrody status = rozpatrywany;
	OcenaPEM ocenaWst?pna;
	StatusDecyzji statusDecyzji;
	Boolean czyOp?acony;
	String powodOdrzucenia;
	String komentarzWyjasniajacyOdrzucenieOceny;
	String kierownikProjektu;

}
