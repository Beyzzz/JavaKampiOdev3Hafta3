package JavaKampiOdev3Hafta3.dataAcsses;

import JavaKampiOdev3Hafta3.entities.BaseEntities;

public class HibernateDao implements EntitiesDao {

	@Override
	public void add(BaseEntities entities) {
		System.out.println("Hibernate'le veri tabanına eklendi");
	}

}
