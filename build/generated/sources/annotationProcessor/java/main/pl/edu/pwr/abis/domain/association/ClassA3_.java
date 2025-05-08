package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA3.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA3_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA3#otherClassB3
	 **/
	public static volatile ListAttribute<ClassA3, ClassB3> otherClassB3;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA3#attributeA
	 **/
	public static volatile SingularAttribute<ClassA3, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA3#classB3
	 **/
	public static volatile ListAttribute<ClassA3, ClassB3> classB3;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA3#id
	 **/
	public static volatile SingularAttribute<ClassA3, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA3
	 **/
	public static volatile EntityType<ClassA3> class_;

	public static final String OTHER_CLASS_B3 = "otherClassB3";
	public static final String ATTRIBUTE_A = "attributeA";
	public static final String CLASS_B3 = "classB3";
	public static final String ID = "id";

}

