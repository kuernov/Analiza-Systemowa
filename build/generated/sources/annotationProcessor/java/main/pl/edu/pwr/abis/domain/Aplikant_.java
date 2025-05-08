package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Aplikant.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Aplikant_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#projekty
	 **/
	public static volatile ListAttribute<Aplikant, Projekt> projekty;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#systemKsiegowy
	 **/
	public static volatile SingularAttribute<Aplikant, SystemKsiegowy> systemKsiegowy;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#daneWczesniejszegoUczestnictwa
	 **/
	public static volatile SingularAttribute<Aplikant, DaneUczestnictwaWPPEA> daneWczesniejszegoUczestnictwa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#czyCzlonekIPMA
	 **/
	public static volatile SingularAttribute<Aplikant, Boolean> czyCzlonekIPMA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#przedstawicieleOrganizacji
	 **/
	public static volatile ListAttribute<Aplikant, PrzedstawicielOrganizacji> przedstawicieleOrganizacji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#id
	 **/
	public static volatile SingularAttribute<Aplikant, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#adres
	 **/
	public static volatile SingularAttribute<Aplikant, Adres> adres;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#organizacja
	 **/
	public static volatile SingularAttribute<Aplikant, Organizacja> organizacja;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant
	 **/
	public static volatile EntityType<Aplikant> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#nazwa
	 **/
	public static volatile SingularAttribute<Aplikant, String> nazwa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#email
	 **/
	public static volatile SingularAttribute<Aplikant, String> email;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Aplikant#daneZarzadzajacego
	 **/
	public static volatile SingularAttribute<Aplikant, DaneZarzadzajacegoAplikantem> daneZarzadzajacego;

	public static final String PROJEKTY = "projekty";
	public static final String SYSTEM_KSIEGOWY = "systemKsiegowy";
	public static final String DANE_WCZESNIEJSZEGO_UCZESTNICTWA = "daneWczesniejszegoUczestnictwa";
	public static final String CZY_CZLONEK_IP_MA = "czyCzlonekIPMA";
	public static final String PRZEDSTAWICIELE_ORGANIZACJI = "przedstawicieleOrganizacji";
	public static final String ID = "id";
	public static final String ADRES = "adres";
	public static final String ORGANIZACJA = "organizacja";
	public static final String NAZWA = "nazwa";
	public static final String EMAIL = "email";
	public static final String DANE_ZARZADZAJACEGO = "daneZarzadzajacego";

}

