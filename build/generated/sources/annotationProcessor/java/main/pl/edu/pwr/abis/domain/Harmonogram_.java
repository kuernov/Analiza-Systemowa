package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Harmonogram.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Harmonogram_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#DataRaportuZWizytyStudyjnej
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> DataRaportuZWizytyStudyjnej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#webinaria
	 **/
	public static volatile ListAttribute<Harmonogram, Webinarium> webinaria;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#DataOcenyWstepnej
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> DataOcenyWstepnej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#dataDostarczeniaRaportuAplikacyjnego
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> dataDostarczeniaRaportuAplikacyjnego;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#spotkanie
	 **/
	public static volatile ListAttribute<Harmonogram, Spotkanie> spotkanie;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#id
	 **/
	public static volatile SingularAttribute<Harmonogram, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#DataOcenyIndywidualnej
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> DataOcenyIndywidualnej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram
	 **/
	public static volatile EntityType<Harmonogram> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#dataZglaszaniaAplikacji
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> dataZglaszaniaAplikacji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#DataOcenyKoncowej
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> DataOcenyKoncowej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Harmonogram#dataWizytyStudyjnej
	 **/
	public static volatile SingularAttribute<Harmonogram, LocalDateTime> dataWizytyStudyjnej;

	public static final String DATA_RAPORTU_ZWIZYTY_STUDYJNEJ = "DataRaportuZWizytyStudyjnej";
	public static final String WEBINARIA = "webinaria";
	public static final String DATA_OCENY_WSTEPNEJ = "DataOcenyWstepnej";
	public static final String DATA_DOSTARCZENIA_RAPORTU_APLIKACYJNEGO = "dataDostarczeniaRaportuAplikacyjnego";
	public static final String SPOTKANIE = "spotkanie";
	public static final String ID = "id";
	public static final String DATA_OCENY_INDYWIDUALNEJ = "DataOcenyIndywidualnej";
	public static final String DATA_ZGLASZANIA_APLIKACJI = "dataZglaszaniaAplikacji";
	public static final String DATA_OCENY_KONCOWEJ = "DataOcenyKoncowej";
	public static final String DATA_WIZYTY_STUDYJNEJ = "dataWizytyStudyjnej";

}

