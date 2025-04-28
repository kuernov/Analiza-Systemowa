package pl.edu.pwr.abis.domain;

import java.util.*;

public class EdycjaKonkursu {

	Collection<FormularzAplikacyjny> formularzAplikacyjny;
	Dokument listaFinalist�w;
	Dokument harmonogram;
	Dokument ulotka;
	Dokument regulamin;
	Dokument wynikiKonkursu;
	Collection<Jury> sk?ad;
	Jury przewodnicz?cy;
	Integer id;
	String nazwa;
	int kosztUczestnictwa;
	Integer minimalnyCzasTrwania;
	Integer minimalnaLiczbaCzlonkow;
	Integer minimalnaLiczbaPodwykonawcow;
	Real znizka;
	StatusEdycji statusEdycji;
	Data terminGali;
	Adres miejsceGali;
	Data dataZglaszaniaAplikacji;
	Data dataDostarczeniaRaportuAplikacyjnego;
	Data planowanaDataOpracowaniaOcenyIndywidualnej;
	Data planowanaDataOpracowaniaOcenyWst?pnej;
	Data planowanaDataOpracowaniaRaportuZWizytyStudyjnej;
	Data planowanaDataOpracowaniaOcenyKo?cowej;
	Data dataWizytyStudyjnej;
	Collection<SpotkanieJury> spotkaniaJury;

}
