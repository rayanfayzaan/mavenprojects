package MyMavenProject.MymavenProject;

import org.testng.annotations.Test;

public class peronalloan {
   
	@Test(groups={"regression"})
	public void Personalloanbyweb() 
	{
		
		System.out.println("personal loan by web");
	}
	
	@Test(groups={"sanity"})
	public void PersonalloanbyAapp()
	{
		
		System.out.println("personal loan by App");
	}
	@Test(groups={"sanity"})
	public void PersonalloanbyBranch() {
		
		System.out.println("personal loan by Branch");
	}
}


