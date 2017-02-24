import java.util.*;

public class BuildingStrings {
    public String[] findAny(int K) {
        
        HashMap<Integer,Score> allPossibleScores = findAllPossibleScores();
        ArrayList<Integer> sortedScores = sortScores(allPossibleScores);
        
        List<String> result = new ArrayList<String>();
        for(int i = sortedScores.size() - 1; i >= 0; i--) {
            int curr_k = K - sortedScores.get(i);
            if(curr_k >= 0) {
                Score s = allPossibleScores.get(sortedScores.get(i));
                int diffChars = s.diffChars;
                int length  = s.length;
                String sequence = generateSequence(sortedScores.get(i),length, diffChars);
                result.add(sequence);
                K = curr_k;
            }
        }
        
        String[] sequence = new String[result.size()];
        sequence = result.toArray(sequence);
        return sequence;
        
    }
    
    public HashMap<Integer, Score> findAllPossibleScores() {
        HashMap<Integer, Score> result = new HashMap<Integer, Score>();
        
        for(int l = 1; l <= 50; l ++){
            for(int d = 1; d <= Math.min(26, l); d++) {
                int score = l * d;
                if(!result.containsKey(score)) {
                	result.put(score, new Score(l, d, score));
                }
            }
        }
        
        return result;
    }
    
    public ArrayList<Integer> sortScores(HashMap<Integer, Score> allPossibleScores) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(Map.Entry<Integer, Score> entry : allPossibleScores.entrySet()) {
        	int score = entry.getKey();   
            result.add(score);
        }
        
        Collections.sort(result);
        return result;
    }
    
    public String generateSequence(int score, int length, int diffChars) {
        StringBuilder result = new StringBuilder();
       
        
        for(int i = 0; i < diffChars; i ++) {
         	result.append((char) ('a' + i));
        }
        
        int numSameChars = length - diffChars;
        for(int i = 0; i < numSameChars; i++) {
         	result.append('a');   
        }
        
        return result.toString();    
    }
    
    public class Score {
        public int length;
        public int diffChars;
        public int score;
        
        public Score(int length, int diffChars, int score){
            this.length = length;
            this.diffChars = diffChars;
            this.score = score;
        }
    }
    
}
