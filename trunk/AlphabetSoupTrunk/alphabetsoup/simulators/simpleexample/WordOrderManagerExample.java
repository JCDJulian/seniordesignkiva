/**
 * 
 */
package alphabetsoup.simulators.simpleexample;

import alphabetsoup.framework.Updateable;
import alphabetsoup.framework.Word;
import alphabetsoup.framework.WordList;
import alphabetsoup.framework.WordStation;

/**Basic simple implementation of a WordOrderManager, which dispenses incoming words to Word
 * stations as they have space.
 * @author Chris Hazard
 */
public class WordOrderManagerExample implements Updateable {

	/* (non-Javadoc)
	 * @see alphabetsoup.framework.Updateable#getNextEventTime(double)
	 */
	public double getNextEventTime(double cur_time) {
		return Double.POSITIVE_INFINITY;
	}

	/* (non-Javadoc)
	 * @see alphabetsoup.framework.Updateable#update(double, double)
	 */
	public void update(double last_time, double cur_time) 
	{
		WordList wl = SimulationWorldSimpleExample.getSimulationWorld().getWordList();
		LetterManagerExample lm = ((LetterManagerExample)((SimulationWorldSimpleExample)SimulationWorldSimpleExample.getSimulationWorld()).letterManager);
		
		//see if all done
		if(wl.getAvailableWords().size() == 0) return;
		
		for(WordStation s : SimulationWorldSimpleExample.getSimulationWorld().getWordStations()) 
		{
			//give the station words if it needs them
			if(s.getAssignedWords().size() < s.getCapacity()) 
			{
				// GET THE ORDER AND ASSIGN INSTEAD OF WORD
				Word w = wl.takeAvailableWord(0);
				s.assignWord(w);
				SimulationWorldSimpleExample.getSimulationWorld().bucketbotManager.newWordAssignedToStation(w, s);
				lm.newWordAssignedToStation(s, w);
			}
			
			//can't continue if out of words
			if(wl.getAvailableWords().size() == 0) return;
		}
	}

}
