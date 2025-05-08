package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA4.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA4_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA4#attributeA
	 **/
	public static volatile SingularAttribute<ClassA4, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA4#id
	 **/
	public static volatile SingularAttribute<ClassA4, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA4#classB4
	 **/
	public static volatile SetAttribute<ClassA4, ClassB4> classB4;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA4
	 **/
	public static volatile EntityType<ClassA4> class_;

	public static final String ATTRIBUTE_A = "attributeA";
	public static final String ID = "id";
	public static final String CLASS_B4 = "classB4";

}

