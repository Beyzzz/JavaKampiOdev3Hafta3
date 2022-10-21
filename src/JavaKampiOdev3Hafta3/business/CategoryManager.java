package JavaKampiOdev3Hafta3.business;

import java.util.List;

import JavaKampiOdev3Hafta3.core.logging.FileLogger;
import JavaKampiOdev3Hafta3.core.logging.ILogger;
import JavaKampiOdev3Hafta3.dataAcsses.EntitiesDao;
import JavaKampiOdev3Hafta3.entities.BaseEntities;
import JavaKampiOdev3Hafta3.entities.Category;
import JavaKampiOdev3Hafta3.entities.Course;

public class CategoryManager {
	private EntitiesDao entitesDao;
	private List<Category> category;
	private ILogger[] loggers;

	public CategoryManager(EntitiesDao entitesDao, List<Category> category, ILogger[] loggers) {
		super();
		this.entitesDao = entitesDao;
		this.category = category;
		this.loggers = loggers;
	}

	public void add(Category categorys) throws Exception {
		int sayac = 0;
		// TODO Auto-generated method stub
		for (Category c : this.category) {
			if (categorys.getName() == c.getName()) {
				sayac = sayac + 1;
				if (sayac > 1) {
					throw new Exception("Kurs ismi aynı olamaz");
				}

			}
		}
	}

}
