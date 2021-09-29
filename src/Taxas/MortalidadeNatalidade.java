package Taxas;

public class MortalidadeNatalidade {
	 public float natalidade(float numNascidos, float numHabitantes) {
	        return (numNascidos * 1000) / numHabitantes;
	    }
	    public float mortalidade(float numObitos, float numHabitantes) {
	        return (numObitos * 1000) / numHabitantes;
	    }

	}
