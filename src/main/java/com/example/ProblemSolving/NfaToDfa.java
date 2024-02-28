package src.main.java.com.example.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NfaToDfa {


    public static void main(String[] args) {
        String nfaDescription = "0;1;a,b,e;0,a,1;0,b,0;1,e,1;0;1";
        NfaToDfa nfaToDfa = new NfaToDfa();
        System.out.println(nfaToDfa.convert(nfaDescription));
    }

    public String convert(String nfaDescription) {
        String[] parts = nfaDescription.split(";");
        String[] states = parts[0].split(",");
        String[] alphabet = parts[1].split(",");
        String[] transitions = parts[2].split(";");
        String initialState = parts[3];
        String[] acceptStates = parts[4].split(",");


        List<String> dfaStates = new ArrayList<>();
        List<String> dfaAlphabet = Arrays.asList(alphabet);
        List<String> dfaTransitions = new ArrayList<>();
        String dfaInitialState = "";
        List<String> dfaAcceptStates = new ArrayList<>();
        List<String> markedStates = new ArrayList<>();


        dfaInitialState = epsilonClosure(initialState, transitions);
        dfaStates.add(dfaInitialState);


        for (int i = 0; i < dfaStates.size(); i++) {
            String dfaState = dfaStates.get(i);
            markedStates.add(dfaState);

            for (String symbol : dfaAlphabet) {
                String nextState = epsilonClosure(move(dfaState, symbol, transitions), transitions);
                if (!dfaStates.contains(nextState) && !markedStates.contains(nextState)) {
                    dfaStates.add(nextState);
                }
                dfaTransitions.add(dfaState + "," + symbol + "," + nextState);
            }
        }


        for (String acceptState : acceptStates) {
            for (String dfaState : dfaStates) {
                if (dfaState.contains(acceptState)) {
                    dfaAcceptStates.add(dfaState);
                }
            }
        }


        StringBuilder result = new StringBuilder();
        result.append(String.join(",", dfaStates)).append(";");
        result.append(String.join(",", dfaAlphabet)).append(";");
        result.append(String.join(";", dfaTransitions)).append(";");
        result.append(dfaInitialState).append(";");
        result.append(String.join(",", dfaAcceptStates));

        return result.toString();
    }
    private String epsilonClosure(String state, String[] transitions) {
        List<String> closure = new ArrayList<>();
        closure.add(state);

        boolean added;
        do {
            added = false;
            for (String transition : transitions) {
                String[] parts = transition.split(",");
                String currentState = parts[0];
                String symbol = parts[1];
                String nextState = parts[2];

                if (closure.contains(currentState) && symbol.equals("e") && !closure.contains(nextState)) {
                    closure.add(nextState);
                    added = true;
                }
            }
        } while (added);

        Collections.sort(closure);
        return String.join(",", closure);
    }

    private String move(String state, String symbol, String[] transitions) {
        List<String> nextStates = new ArrayList<>();

        for (String transition : transitions) {
            String[] parts = transition.split(",");
            String currentState = parts[0];
            String inputSymbol = parts[1];
            String nextState = parts[2];

            if (currentState.equals(state) && inputSymbol.equals(symbol)) {
                nextStates.add(nextState);
            }
        }

        Collections.sort(nextStates);
        return String.join(",", nextStates);
    }

}
