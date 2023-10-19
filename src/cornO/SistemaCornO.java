package cornO;

import java.util.*;

public class SistemaCornO {
	private HashMap <Integer, Anotacao> anotacoes;
	
	public SistemaCornO() {
		HashMap <Integer, Anotacao> anotacoes = new HashMap<>();
	}
	
	int cadastrarAnotacao (String nomeDisciplina, String data, String texto) {
		Anotacao novaAnotacao = new Anotacao (nomeDisciplina, data, texto);
		novaAnotacao.setId(anotacoes.size() + 1);
		anotacoes.put(novaAnotacao.getId(), novaAnotacao);
		return novaAnotacao.getId();
	}
	void definirSumario (int idAnotacao, String texto) {
		Anotacao anotation = anotacoes.get(idAnotacao);
		anotation.defineSumario(texto);
	}
	String exibirAnotacao (int idAnotacao) {
		return anotacoes.get(idAnotacao).toString();
	}
	void cadastrarQuestaoAberta(int idAnotacao, String enunciado, int prioridade, String gabarito) {
		Anotacao anotssss = anotacoes.get(idAnotacao);
		anotssss.cadastrarQuestaoAberta(enunciado, prioridade, gabarito);
	}
	void cadastrarQuestaoMultipla(int idAnotacao, String enunciado, String[] alternativas, int prioridade, String gabarito) {
		Anotacao anott = anotacoes.get(idAnotacao);
		anott.cadastrarQuestaoMultiplaEscolha(enunciado, alternativas, prioridade, gabarito);
	}
	String exibirQuestao(int idAnotacao, int ordemQuestao) {
		Anotacao anot = anotacoes.get(idAnotacao);
		return anot.exibirQuestao(ordemQuestao);
	}
	boolean responderQuestao(int idAnotacao, int ordemQuestao, String resposta) {
		Anotacao anotaaaa = anotacoes.get(idAnotacao);
		return anotaaaa.responderQuestao(ordemQuestao, resposta);
	}
}
