package MyMavenProject.MymavenProject;

import org.testng.annotations.Test;

public class carloan {
	
   @Test(groups={"sanity"})
	public void carloanbyweb() 
	{
		
		System.out.println("car loan by Web");
	}
	@Test(groups={"sanity"})
	public void carloanbyapp() 
	{
		
		System.out.println("car loan by app");
	}
	@Test(groups={"regression"})
	public void carloanbybranch() 
	{
		
		System.out.println("car loan by branch");
	}
}

