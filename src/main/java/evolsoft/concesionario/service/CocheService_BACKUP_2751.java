package evolsoft.concesionario.service;

import java.util.List;

import evolsoft.concesionario.dto.CocheDTO;
import evolsoft.concesionario.exception.NotFoundExcept;
import evolsoft.concesionario.model.Coche;

public interface CocheService {

	CocheDTO findById(Integer id) throws NotFoundExcept;

	List<CocheDTO> findAll(Integer page, Integer size);

	CocheDTO create(CocheDTO cocheDTO);

	void update(Integer id, CocheDTO cocheDTO);

	void delete(Integer idCoche);

	public Coche map(CocheDTO coche);

	public CocheDTO map(Coche coche);

	public List<CocheDTO> listCochesSortedByPrice(Integer page, Integer size);

	public List<CocheDTO> findCarsAlreadySold();
	
	public List<CocheDTO> findCochesInPriceRange(Integer minPrice, Integer maxPrice);
	
	public List<CocheDTO> findCochesInStock();

	void newSell(Integer idCoche, Integer idCliente, Integer idVendedor) throws NotFoundExcept;

<<<<<<< HEAD
	void createList(List<CocheDTO> listCocheDto);

=======
	
	void createList(List<CocheDTO> listCocheDto);
	
>>>>>>> 2bfd22146355363d884093102f0d4b6b6ccf1686
}
