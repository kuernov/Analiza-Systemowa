package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Dokument.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Dokument_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Dokument#dataUtworzenia
	 **/
	public static volatile SingularAttribute<Dokument, LocalDateTime> dataUtworzenia;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Dokument#dataModyfikacji
	 **/
	public static volatile SingularAttribute<Dokument, LocalDateTime> dataModyfikacji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Dokument#zawartosc
	 **/
	public static volatile SingularAttribute<Dokument, String> zawartosc;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Dokument
	 **/
	public static volatile EmbeddableType<Dokument> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Dokument#nazwa
	 **/
	public static volatile SingularAttribute<Dokument, String> nazwa;

	public static final String DATA_UTWORZENIA = "dataUtworzenia";
	public static final String DATA_MODYFIKACJI = "dataModyfikacji";
	public static final String ZAWARTOSC = "zawartosc";
	public static final String NAZWA = "nazwa";

}

