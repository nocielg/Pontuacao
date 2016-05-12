
public class RegistroPontos {

	/**
	 * @param args
	 */
	private CalculadoraBonus bonus;
	public RegistroPontos(CalculadoraBonus cb){
		bonus = cb;
	}
	public void fazerComentario(Usuario u){
		u.pontos +=3 * bonus.bonus(u);
	}
	
	public void criarUmTopico(Usuario u){
		u.pontos +=5* bonus.bonus(u);
	}
	public void darumLike(Usuario u){
		u.pontos +=1*bonus.bonus(u);
	}
}
