package Fission.FL_AppiumFramework.TestSteps;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/");
		System.out.println(appDir);
	}

}
