package br.poo.geradorestatisticasbr;

/**
 * 
 */
public class DadosJogo {
	private int golsTimeVisitante;
	private int golsTimeMandante;
	private int totalGols;
	private int chutesAGolTimeVisitante;
	private int chutesAGolTimeMandante;
	private int posseBolaTimeVisitanteDefesaEmMin;
	private int posseBolaTimeVisitanteAtaqueEmMin;
	private int posseBolaTimeMandanteDefesaEmMin;
	private int posseBolaTimeMandanteAtaqueEmMin;
	private int tempoTotalBolaRolandoEmMin;
	private int tempoTotalJogoEmMin;
	private int faltasTimeVisitante;
	private int cartoesAmarelosVisitante;
	private int cartoesVermelhosVisitante;
	private int faltasTimeMandante;
	private int cartoesAmarelosMandante;
	private int cartoesVermelhosMandante;
	
	private int totalCartoesAmarelosTimeVisitante;
	private int totalCartoesVermelhosTimeVisitante;
	private int totalCartoesAmarelosTimeMandante;
	private int totalCartoesVermelhosTimeMandante;
	private int totalFaltasTimeVisitante;
	private int totalFaltasTimeMandante;
	private int totalFaltas;
	
	

	

	public DadosJogo(int golsTimeVisitante, int golsTimeMandante, int totalGols, int chutesAGolTimeVisitante,
			int chutesAGolTimeMandante, int posseBolaTimeVisitanteDefesaEmMin, int posseBolaTimeVisitanteAtaqueEmMin,
			int posseBolaTimeMandanteDefesaEmMin, int posseBolaTimeMandanteAtaqueEmMin, int tempoTotalBolaRolandoEmMin,
			int tempoTotalJogoEmMin, int faltasTimeVisitante, int cartoesAmarelosVisitante,
			int cartoesVermelhosVisitante, int faltasTimeMandante, int cartoesAmarelosMandante,
			int cartoesVermelhosMandante, int totalCartoesAmarelosTimeVisitante, int totalCartoesVermelhosTimeVisitante,
			int totalCartoesAmarelosTimeMandante, int totalCartoesVermelhosTimeMandante, int totalFaltasTimeVisitante,
			int totalFaltasTimeMandante, int totalFaltas) {
		super();
		this.golsTimeVisitante = golsTimeVisitante;
		this.golsTimeMandante = golsTimeMandante;
		this.totalGols = totalGols;
		this.chutesAGolTimeVisitante = chutesAGolTimeVisitante;
		this.chutesAGolTimeMandante = chutesAGolTimeMandante;
		this.posseBolaTimeVisitanteDefesaEmMin = posseBolaTimeVisitanteDefesaEmMin;
		this.posseBolaTimeVisitanteAtaqueEmMin = posseBolaTimeVisitanteAtaqueEmMin;
		this.posseBolaTimeMandanteDefesaEmMin = posseBolaTimeMandanteDefesaEmMin;
		this.posseBolaTimeMandanteAtaqueEmMin = posseBolaTimeMandanteAtaqueEmMin;
		this.tempoTotalBolaRolandoEmMin = tempoTotalBolaRolandoEmMin;
		this.tempoTotalJogoEmMin = tempoTotalJogoEmMin;
		this.faltasTimeVisitante = faltasTimeVisitante;
		this.cartoesAmarelosVisitante = cartoesAmarelosVisitante;
		this.cartoesVermelhosVisitante = cartoesVermelhosVisitante;
		this.faltasTimeMandante = faltasTimeMandante;
		this.cartoesAmarelosMandante = cartoesAmarelosMandante;
		this.cartoesVermelhosMandante = cartoesVermelhosMandante;
		this.totalCartoesAmarelosTimeVisitante = totalCartoesAmarelosTimeVisitante;
		this.totalCartoesVermelhosTimeVisitante = totalCartoesVermelhosTimeVisitante;
		this.totalCartoesAmarelosTimeMandante = totalCartoesAmarelosTimeMandante;
		this.totalCartoesVermelhosTimeMandante = totalCartoesVermelhosTimeMandante;
		this.totalFaltasTimeVisitante = totalFaltasTimeVisitante;
		this.totalFaltasTimeMandante = totalFaltasTimeMandante;
		this.totalFaltas = totalFaltas;
	}

	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	
	public int getGolsTimeMandante() {
		return golsTimeMandante;
	}
	
	public int getChutesAGolTimeVisitante() {
		return chutesAGolTimeVisitante;
	}
	
	public int getChutesAGolTimeMandante() {
		return chutesAGolTimeMandante;
	}
	
	public int getPosseBolaTimeVisitanteDefesaEmMin() {
		return posseBolaTimeVisitanteDefesaEmMin;
	}
	
	public int getPosseBolaTimeVisitanteAtaqueEmMin() {
		return posseBolaTimeVisitanteAtaqueEmMin;
	}
	
	public int getPosseBolaTimeMandanteDefesaEmMin() {
		return posseBolaTimeMandanteDefesaEmMin;
	}
	
	public int getPosseBolaTimeMandanteAtaqueEmMin() {
		return posseBolaTimeMandanteAtaqueEmMin;
	}
	
	public int getTempoTotalBolaRolandoEmMin() {
		return tempoTotalBolaRolandoEmMin;
	}
	
	public int getTempoTotalJogoEmMin() {
		return tempoTotalJogoEmMin;
	}
	
	public int getFaltasTimeVisitante() {
		return faltasTimeVisitante;
	}
	
	public int getCartoesAmarelosVisitante() {
		return cartoesAmarelosVisitante;
	}
	
	public int getCartoesVermelhosVisitante() {
		return cartoesVermelhosVisitante;
	}
	
	public int getFaltasTimeMandante() {
		return faltasTimeMandante;
	}
	public int getCartoesAmarelosMandante() {
		return cartoesAmarelosMandante;
	}
	
	public int getCartoesVermelhosMandante() {
		return cartoesVermelhosMandante;
	}



	public int getTotalCartoesAmarelosTimeVisitante() {
		return totalCartoesAmarelosTimeVisitante;
	}



	public int getTotalCartoesVermelhosTimeVisitante() {
		return totalCartoesVermelhosTimeVisitante;
	}



	public int getTotalCartoesAmarelosTimeMandante() {
		return totalCartoesAmarelosTimeMandante;
	}



	public int getTotalCartoesVermelhosTimeMandante() {
		return totalCartoesVermelhosTimeMandante;
	}



	public int getTotalFaltasTimeVisitante() {
		return totalFaltasTimeVisitante;
	}



	public int getTotalFaltasTimeMandante() {
		return totalFaltasTimeMandante;
	}

	public int getTotalGols() {
		return totalGols;
	}

	public int getTotalFaltas() {
		return totalFaltas;
	}
	
	
}
