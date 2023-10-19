package cornO;

public class QuestaoME implements Questao {
	private String enunciado;
	private String[] alternativas;
	private int prioridade;
	private String gabarito;
	private int ordemQuestao;
	
	public QuestaoME(String enunciado, String[] alternativas, int prioridade, String gabarito) {
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.prioridade = prioridade;
		this.gabarito = gabarito;
	}

	@Override
	public double peso() {
		return (prioridade * (alternativas.length / 5));
	}

	@Override
	public String exibirQuestao() {
		String[] alfabeto = {"a) ", "b) ", "c) ", "d) ", "e) "};
		String questao = this.enunciado + " (" + this.peso() + "):\n";
		for (int i = 0; i < alternativas.length; i++) {
			 questao += alfabeto[i] + alternativas[i];
	}
		return questao;
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
