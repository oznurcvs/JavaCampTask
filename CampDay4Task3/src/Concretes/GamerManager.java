package Concretes;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IGamerCheckService ýGamerCheckService ;
	
	public GamerManager(IGamerCheckService ýGamerCheckService) {
		this.ýGamerCheckService=ýGamerCheckService;
	}

	@Override
	public void Save(Gamer gamer) {
		if(ýGamerCheckService.CheckIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + "Gamer Has Been Saved");
		}
			else {
				System.out.println("Not A Valid Gamer");
			}
		//System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " " + " Gamer Has Been Saved");
		
		
	}

	@Override
	public void Update(Gamer gamer) {
		
		if(ýGamerCheckService.CheckIfRealGamer(gamer)) {
		System.out.println(gamer.getFirstName() + " Gamer Has Been Updated");}
		else {
			System.out.println("Not A Valid Gamer");
		}
		//System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " " + " Gamer Has Been Updated");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		if(ýGamerCheckService.CheckIfRealGamer(gamer)){
			System.out.println(gamer.getFirstName() + " Gamer Has Been Deleted");
		}
		else {
			System.out.println("Not A Valid Gamer");
		}
		
		//System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " " + " Gamer Has Been Deleted");
		
	}
	

}
