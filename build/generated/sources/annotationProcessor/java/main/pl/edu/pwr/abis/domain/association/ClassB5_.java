package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB5.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB5_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB5#id
	 **/
	public static volatile SingularAttribute<ClassB5, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB5#attributeB
	 **/
	public static volatile SingularAttribute<ClassB5, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB5
	 **/
	public static volatile EntityType<ClassB5> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB5#classA5
	 **/
	public static volatile SetAttribute<ClassB5, ClassA5> classA5;

	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";
	public static final String CLASS_A5 = "classA5";

}

