package Abstract;

import Entities.Gamer;

public interface IGamerService { // oyuncular� sisteme kay�t etme, g�ncelleme, silme i�lemleri
	
	public void Save(Gamer gamer);
	public void Update(Gamer gamer);
	public void Delete(Gamer gamer);

}
