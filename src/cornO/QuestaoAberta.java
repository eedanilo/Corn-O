package cornO;

public class QuestaoAberta implements Questao {
	private String enunciado;
	private int prioridade;
	private String gabarito;
	private int ordemQuestao;
	
	public QuestaoAberta(String enunciado, int prioridade, String gabarito) {
		this.enunciado = enunciado;
		this.prioridade = prioridade;
		this.gabarito = gabarito;
	}
	@Override
	public double peso() {
		return (prioridade * 1.2); 
	}
	@Override
	public String exibirQuestao() {
		return this.enunciado + " (" + this.peso() + ")";
	}
	@Override
	public boolean responderQuestao(String resposta) {
		if (resposta.equals(this.gabarito)) {
			return true;
		}
		return false;
	}
	public void setOrdemQuestao(int ordem) {
		this.ordemQuestao = ordem;
	}
}
