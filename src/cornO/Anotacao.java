package cornO;

import java.util.ArrayList;
import java.util.HashSet;

public class Anotacao {
	private String nomeDisciplina;
	private String data;
	private String texto;
	private int idAnotacao;
	private ArrayList <Questao> questoes;
	private HashSet <String> sumario;
	
	public Anotacao (String nomeDisciplina, String data, String texto) {
		this.nomeDisciplina = nomeDisciplina;
		this.data = data;
		this.texto = texto;
		this.questoes = new ArrayList<>();
		this.sumario = new HashSet<>();
		
	}
	public void setId(int id) {
		this.idAnotacao = id;
	}
	public int getId() {
		return this.idAnotacao;
	}
	public void defineSumario(String sumario) {
		this.sumario.add(sumario);
	}
	public void cadastrarQuestaoAberta(String enunciado, int prioridade, String gabarito) {
		QuestaoAberta novaQuestaoAberta = new QuestaoAberta(enunciado, prioridade, gabarito);
		this.questoes.add(novaQuestaoAberta);
		novaQuestaoAberta.setOrdemQuestao(this.questoes.indexOf(novaQuestaoAberta));
	}
	public void cadastrarQuestaoMultiplaEscolha(String enunciado, String[] alternativas, int prioridade, String gabarito) {
		QuestaoME novaQuestaoME = new QuestaoME(enunciado, alternativas, prioridade, gabarito);
		this.questoes.add(novaQuestaoME);
		novaQuestaoME.setOrdemQuestao(this.questoes.indexOf(novaQuestaoME));
	}
	public String exibirQuestao(int ordemQuestao) {
		return questoes.get(ordemQuestao).exibirQuestao();
	}
	public String toString() {
		String exibir = "";
		if (this.sumario.size() == 0) {
		exibir += "Disciplina: " + this.nomeDisciplina + "\n" +
				"Data: " + this.data + "\n" +
				"Texto: " + this.texto;}
		else {
			exibir = "Disciplina: " + this.nomeDisciplina + "\n" +
			"Data: " + this.data + "\n" +
			"Texto: " + this.texto + "\n" +
			"Sumário: " + this.sumario;
		}
		return exibir;
	}
	public boolean responderQuestao(int ordemQuestao, String resposta) {
		Questao question = questoes.get(ordemQuestao);
		return question.responderQuestao(resposta);
	}
}
