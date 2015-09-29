package nlp.langmodel;

import java.util.List;

/**
 * Language models assign probabilities to sentences and generate sentences.
 */
public interface LanguageModel {
	double getSentenceProbability(List<String> sentence,double l1,double l2);

	List<String> generateSentence();
}
