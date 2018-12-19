package module001.zzMytests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("module001.ExerciseIfCondtion");
			Method m = c.getMethod("main", String[].class);
			String[] params = null;
			m.invoke(null, (Object)params);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
	}
}
