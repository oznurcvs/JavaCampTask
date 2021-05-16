package Abstract;

import Entities.Gamer;

public interface IGamerService { // oyuncularý sisteme kayýt etme, güncelleme, silme iþlemleri
	
	public void Save(Gamer gamer);
	public void Update(Gamer gamer);
	public void Delete(Gamer gamer);

}
