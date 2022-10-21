package JavaKampiOdev3Hafta3;

import java.util.ArrayList;
import java.util.List;

import JavaKampiOdev3Hafta3.business.CategoryManager;
import JavaKampiOdev3Hafta3.business.CourseManager;
import JavaKampiOdev3Hafta3.core.logging.DataBaseLogger;
import JavaKampiOdev3Hafta3.core.logging.FileLogger;
import JavaKampiOdev3Hafta3.core.logging.ILogger;
import JavaKampiOdev3Hafta3.core.logging.MailLogger;
import JavaKampiOdev3Hafta3.dataAcsses.HibernateDao;
import JavaKampiOdev3Hafta3.dataAcsses.JdbcDao;
import JavaKampiOdev3Hafta3.entities.BaseEntities;
import JavaKampiOdev3Hafta3.entities.Category;
import JavaKampiOdev3Hafta3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Course course1 = new Course(1, "Java", 10.0);
		Course course2 = new Course(2, "Java", 10.0);
		Course course3 = new Course(1, "Kotlin", 5.0);

		List<Course> course = new ArrayList<Course>();
		course.add(course1);
		course.add(course2);
		course.add(course3);

		ILogger[] loggers = { new FileLogger(), new DataBaseLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, course);
		courseManager.add(course1);
		courseManager.add(course2);
		Category category1 = new Category(1, "Backend", "Yazılım");
		Category category2 = new Category(2, "Backend", "Yazılım");
		List<Category> category = new ArrayList<Category>();
		category.add(category1);
		category.add(category2);

		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), category, loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);

	}
}