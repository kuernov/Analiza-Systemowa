package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Projekt.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Projekt_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#budzet
	 **/
	public static volatile SingularAttribute<Projekt, Float> budzet;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#powodOdrzucenia
	 **/
	public static volatile SingularAttribute<Projekt, String> powodOdrzucenia;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#kategoria
	 **/
	public static volatile SingularAttribute<Projekt, Kategoria> kategoria;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#raportAplikacyjny
	 **/
	public static volatile SingularAttribute<Projekt, RaportAplikacyjny> raportAplikacyjny;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#formularzAplikacyjny
	 **/
	public static volatile SingularAttribute<Projekt, FormularzAplikacyjny> formularzAplikacyjny;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#ocenaWstepna
	 **/
	public static volatile SingularAttribute<Projekt, Ocena> ocenaWstepna;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#nazwa
	 **/
	public static volatile SingularAttribute<Projekt, String> nazwa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#ocenyIndywidualne
	 **/
	public static volatile SetAttribute<Projekt, OcenaIndywidualna> ocenyIndywidualne;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#czyZgodnyZICB4
	 **/
	public static volatile SingularAttribute<Projekt, Boolean> czyZgodnyZICB4;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#aplikant
	 **/
	public static volatile SingularAttribute<Projekt, Aplikant> aplikant;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#ocenaKoncowa
	 **/
	public static volatile ListAttribute<Projekt, OcenaKoncowa> ocenaKoncowa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#propozycjeWspolpracy
	 **/
	public static volatile ListAttribute<Projekt, PropozycjaWspolpracy> propozycjeWspolpracy;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#id
	 **/
	public static volatile SingularAttribute<Projekt, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt
	 **/
	public static volatile EntityType<Projekt> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#czyUkonczony
	 **/
	public static volatile SingularAttribute<Projekt, Boolean> czyUkonczony;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#czyDostepnyDoPublikacji
	 **/
	public static volatile SingularAttribute<Projekt, Boolean> czyDostepnyDoPublikacji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#czyOplacony
	 **/
	public static volatile SingularAttribute<Projekt, Boolean> czyOplacony;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#raportWizytyStudyjnej
	 **/
	public static volatile SingularAttribute<Projekt, RaportWizytyStudyjnej> raportWizytyStudyjnej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#opis
	 **/
	public static volatile SingularAttribute<Projekt, String> opis;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Projekt#status
	 **/
	public static volatile SingularAttribute<Projekt, StatusProjektu> status;

	public static final String BUDZET = "budzet";
	public static final String POWOD_ODRZUCENIA = "powodOdrzucenia";
	public static final String KATEGORIA = "kategoria";
	public static final String RAPORT_APLIKACYJNY = "raportAplikacyjny";
	public static final String FORMULARZ_APLIKACYJNY = "formularzAplikacyjny";
	public static final String OCENA_WSTEPNA = "ocenaWstepna";
	public static final String NAZWA = "nazwa";
	public static final String OCENY_INDYWIDUALNE = "ocenyIndywidualne";
	public static final String CZY_ZGODNY_ZI_CB4 = "czyZgodnyZICB4";
	public static final String APLIKANT = "aplikant";
	public static final String OCENA_KONCOWA = "ocenaKoncowa";
	public static final String PROPOZYCJE_WSPOLPRACY = "propozycjeWspolpracy";
	public static final String ID = "id";
	public static final String CZY_UKONCZONY = "czyUkonczony";
	public static final String CZY_DOSTEPNY_DO_PUBLIKACJI = "czyDostepnyDoPublikacji";
	public static final String CZY_OPLACONY = "czyOplacony";
	public static final String RAPORT_WIZYTY_STUDYJNEJ = "raportWizytyStudyjnej";
	public static final String OPIS = "opis";
	public static final String STATUS = "status";

}

