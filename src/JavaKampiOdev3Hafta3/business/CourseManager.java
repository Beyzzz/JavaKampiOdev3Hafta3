package JavaKampiOdev3Hafta3.business;

import java.util.List;
import java.util.logging.Logger;

import JavaKampiOdev3Hafta3.core.logging.DataBaseLogger;
import JavaKampiOdev3Hafta3.core.logging.FileLogger;
import JavaKampiOdev3Hafta3.core.logging.ILogger;
import JavaKampiOdev3Hafta3.core.logging.MailLogger;
import JavaKampiOdev3Hafta3.dataAcsses.EntitiesDao;
import JavaKampiOdev3Hafta3.dataAcsses.HibernateDao;
import JavaKampiOdev3Hafta3.entities.BaseEntities;
import JavaKampiOdev3Hafta3.entities.Course;

public class CourseManager {
	private EntitiesDao entitesDao;
	private ILogger[] loggers;
	private List<Course> courses;

	public CourseManager(EntitiesDao entitesDao, ILogger[] loggers, List<Course> courses) {
		super();
		this.entitesDao = entitesDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		// TODO Auto-generated method stub
		int sayac = 0;
		if (course.getCoursePrice() < 0) {
			throw new Exception("Fiyat sıfırdan küçük olamaz");
		}

		for (Course c : courses) {
			if (course.getName() == c.getName()) {
				sayac = sayac + 1;
				if (sayac > 1) {
					throw new Exception("Kurs ismi aynı olamaz");
				}

			}
		}

		entitesDao.add(course);
		for (ILogger iLogger : loggers) {
			iLogger.log();
		}

	}
}
