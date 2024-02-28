package src.main.java.com.example.ProblemSolving;

import java.util.*;
import java.util.stream.Collectors;

public class NfaToDfa2 {
        private Set<Set<Integer>> dfaStates;
        private Set<Character> alphabet;
        private Set<Transition> nfaTransitions;
        private Set<Integer> nfaAcceptStates;

        public NfaToDfa2(Set<Set<Integer>> nfaStates, Set<Character> alphabet, Set<Transition> nfaTransitions, Set<Integer> nfaAcceptStates) {
            this.dfaStates = new HashSet<>();
            this.alphabet = alphabet;
            this.nfaTransitions = nfaTransitions;
            this.nfaAcceptStates = nfaAcceptStates;

            convertNfaToDfa(nfaStates);
        }

        private void convertNfaToDfa(Set<Set<Integer>> nfaStates) {
            Set<Integer> startState = epsilonClosure(Collections.singleton(0)); // Assuming start state is always 0
            dfaStates.add(startState);

            Queue<Set<Integer>> queue = new LinkedList<>();
            queue.add(startState);

            while (!queue.isEmpty()) {
                Set<Integer> currentState = queue.poll();

                for (char symbol : alphabet) {
                    Set<Integer> nextState = epsilonClosure(getNextStates(currentState, symbol));
                    if (!dfaStates.contains(nextState)) {
                        dfaStates.add(nextState);
                        queue.add(nextState);
                    }
                }
            }
        }

        private Set<Integer> epsilonClosure(Set<Integer> states) {
            Set<Integer> closure = new HashSet<>(states);

            Queue<Integer> queue = new LinkedList<>(states);
            while (!queue.isEmpty()) {
                int currentState = queue.poll();

                for (Transition transition : nfaTransitions) {
                    if (transition.getFromState() == currentState && transition.getSymbol() == 0) {
                        int toState = transition.getToState();
                        if (!closure.contains(toState)) {
                            closure.add(toState);
                            queue.add(toState);
                        }
                    }
                }
            }

            return closure;
        }

        private Set<Integer> getNextStates(Set<Integer> states, char symbol) {
            Set<Integer> nextStates = new HashSet<>();
            for (int state : states) {
                for (Transition transition : nfaTransitions) {
                    if (transition.getFromState() == state && transition.getSymbol() == symbol) {
                        nextStates.add(transition.getToState());
                    }
                }
            }
            return nextStates;
        }

        public String toString() {
            StringBuilder result = new StringBuilder();

            for (Set<Integer> stateSet : dfaStates) {
                result.append(stateSetToString(stateSet)).append(":");
                for (char symbol : alphabet) {
                    Set<Integer> nextState = epsilonClosure(getNextStates(stateSet, symbol));
                    result.append(stateSetToString(nextState)).append(",");
                }
                result.setLength(result.length() - 1);  // Remove the last comma
                result.append("#");
            }

            result.append(statesToString(nfaAcceptStates));

            return result.toString();
        }

        private String stateSetToString(Set<Integer> stateSet) {
            List<Integer> sortedStates = new ArrayList<>(stateSet);
            Collections.sort(sortedStates);
            return sortedStates.stream().map(String::valueOf).collect(Collectors.joining("/"));
        }

        private String statesToString(Set<Integer> states) {
            return states.stream().map(String::valueOf).collect(Collectors.joining("/"));
        }

        private static class Transition {
            private int fromState;
            private char symbol;
            private int toState;

            public Transition(int fromState, char symbol, int toState) {
                this.fromState = fromState;
                this.symbol = symbol;
                this.toState = toState;
            }

            public int getFromState() {
                return fromState;
            }

            public char getSymbol() {
                return symbol;
            }

            public int getToState() {
                return toState;
            }
        }
    }



