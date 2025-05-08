package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(EkspertIPMA.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class EkspertIPMA_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#czyZweryfikowany
	 **/
	public static volatile SingularAttribute<EkspertIPMA, Boolean> czyZweryfikowany;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#imie
	 **/
	public static volatile SingularAttribute<EkspertIPMA, String> imie;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#nazwisko
	 **/
	public static volatile SingularAttribute<EkspertIPMA, String> nazwisko;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#propozycjeWspolpracy
	 **/
	public static volatile ListAttribute<EkspertIPMA, PropozycjaWspolpracy> propozycjeWspolpracy;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#id
	 **/
	public static volatile SingularAttribute<EkspertIPMA, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#organizacja
	 **/
	public static volatile SingularAttribute<EkspertIPMA, Organizacja> organizacja;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA
	 **/
	public static volatile EntityType<EkspertIPMA> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.EkspertIPMA#email
	 **/
	public static volatile SingularAttribute<EkspertIPMA, String> email;

	public static final String CZY_ZWERYFIKOWANY = "czyZweryfikowany";
	public static final String IMIE = "imie";
	public static final String NAZWISKO = "nazwisko";
	public static final String PROPOZYCJE_WSPOLPRACY = "propozycjeWspolpracy";
	public static final String ID = "id";
	public static final String ORGANIZACJA = "organizacja";
	public static final String EMAIL = "email";

}

